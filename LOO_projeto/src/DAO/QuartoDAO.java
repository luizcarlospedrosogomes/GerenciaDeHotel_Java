package DAO;

import Model.Quarto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuartoDAO extends Banco{
 
    PreparedStatement ps;
  //  Quarto quarto;
    public QuartoDAO()throws ClassNotFoundException, SQLException{}    
    
    
    public void inserirQuarto(Quarto quarto) throws SQLException{
    this.ps =  con.prepareStatement("Insert into quarto (numero, tipo) values (?, ?)");
    this.ps.setInt(1,quarto.getNumero());
    this.ps.setInt(2,quarto.getTipo());
    this.ps.executeUpdate();
    }
    
    public ResultSet preencheComboobx() throws SQLException{
        this.sessao = con.createStatement();
        String sql = " select '1' as valor, 'individual' as tipo\n" +
                     " union all\n" +
                     " select '2' as valor, 'casal' as tipo\n" +
                     " union all\n" +
                     " select '3' as valor, 'suite' as tipo";
       // this.ps = con.prepareStatement(sql);
        return this.dados = sessao.executeQuery(sql);
    }
    
    public ResultSet listar() throws SQLException{
    this.sessao = con.createStatement();
    return  sessao.executeQuery("select codigo, numero  from quarto order by codigo");
    }
    
    public void excluirQuarto(Quarto quarto) throws SQLException{
     this.ps =  con.prepareStatement("delete from quarto where numero = ?");
     this.ps.setInt(1, quarto.getNumero());
     this.ps.executeUpdate();
     
    }
    public ResultSet listarOcupacao() throws SQLException{
        this.sessao = con.createStatement();
        String sql ="select q.codigo\n" +
                    "     , q.numero\n" +
                    "     , h.nome\n" +
                    "  from reserva r\n" +
                    "  inner join status s\n" +
                    "    on s.cod_reserva  = r.codigo\n" +
                    "  left join quarto q\n" +
                    "    on q.numero = s.cod_quarto\n" +
                    "  left join hospede h\n" +
                    "    on h.codigo = r.cod_cliente";
        return  sessao.executeQuery(sql);
    }
    
     public String buscaQuarto(String numero) throws SQLException{
        String dado;
    this.sessao = con.createStatement();
    String sql = "select q.numero\n" +
                 "  from quarto q\n" +
                 " left join status s\n" +
                 "    on s.cod_quarto = q.codigo\n" +
                 " where q.numero ="+numero+"\n" +
                 "   and s.cod_quarto isnull";
    this.dados = sessao.executeQuery(sql);
    this.dados.next();
    return  dado = dados.getString("numero");
        
     }
        
}
