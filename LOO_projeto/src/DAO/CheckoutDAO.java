
package DAO;

import Model.Checkout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckoutDAO extends Banco{
    
    PreparedStatement ps;
    public CheckoutDAO() throws ClassNotFoundException, SQLException{} 
    
     public ResultSet buscarConsumo(String codigo) throws SQLException{
        this.sessao = con.createStatement();
         String sql = "select sum(s.valor) as valor \n"
                 + "     , cs.cod_reserva\n"
                 + "     , (r.data_fim - r.data_inicio) as periodo\n"
                 + "     , h.nome\n"
                 + "     , h.cpf\n"
                 + "     , (r.valor_diaria + (sum(s.valor))) as valor_apagar\n"
                 + " from reserva r\n"
                 + "inner join hospede h\n"
                 + "   on h.codigo = r.cod_cliente\n"
                 + "left join consumo_servico cs\n"
                 + "   on cs.cod_reserva = r.codigo\n"
                 + "left join servico s\n"
                 + "   on cs.cod_servico = s.codigo\n"
                 + "where r.codigo = " + codigo + "\n"
                 + " group by cs.cod_reserva, periodo, h.nome, h.cpf, r.valor_diaria";
         System.out.println(sql);
        return  sessao.executeQuery(sql);
      }
     
     public ResultSet buscarConsumoLista(int codigo) throws SQLException{
        this.sessao = con.createStatement();
        String sql = "select s.descricao\n" +
                     "     , s.valor\n" +
                     "  from consumo_servico cs\n" +
                     " inner join servico s\n" +
                     "    on cs.cod_servico = s.codigo\n" +
                     " inner join reserva r\n" +
                     "    on r.codigo = cs.cod_reserva\n" +
                     " inner join hospede h\n" +
                     "    on h.codigo = r.cod_cliente\n" +
                     " where cs.cod_reserva = "+codigo+"\n" +
                     " group by  s.descricao, s.valor";
        return  sessao.executeQuery(sql);
      }
     
     public void inserirCheckout(Checkout checkout) throws SQLException {
            this.ps = con.prepareStatement("Insert into checkout (cod_reserva, data_checkout) values (?, current_date)");
            this.ps.setInt(1, checkout.getReserva().getCodigo());
            this.ps.executeUpdate();          
        }
}
