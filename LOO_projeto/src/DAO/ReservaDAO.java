package DAO;

import Model.Reserva;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservaDAO extends Banco{
    PreparedStatement ps;
    
    public ReservaDAO()throws ClassNotFoundException, SQLException{} 
    
    public void inserirReserva(Reserva reserva) throws SQLException{
        this.ps = con.prepareStatement("insert into reserva(cod_cliente, data_inicio, data_fim, confirmado, valor_diaria) values (?, ?, ?, ?, ?)");
        this.ps.setInt(1, reserva.getHospede().getCodigo());
        this.ps.setDate(2, (Date) reserva.getDataInicio());
        this.ps.setDate(3, (Date) reserva.getDataFim());
        this.ps.setInt(4, 0);
        this.ps.setBigDecimal(5, reserva.getValorDiaria());
        this.ps.executeUpdate();        
    }
     
    public ResultSet listar() throws SQLException{
        this.sessao = con.createStatement();
        String sql = "select r.codigo as cod_reserva\n" +
                     "     , r.data_inicio \n" +
                     "     , r.data_fim\n" +
                     "     , h.nome\n" +
                     "     , h.cpf\n" +
                     "     , h.codigo as cod_hospede\n" +
                     "  from reserva r\n" +
                     " inner join hospede h\n" +
                     "    on h.codigo = r.cod_cliente\n";
                      
        return  sessao.executeQuery(sql);
    }
    
    public void excluir(Reserva reserva) throws SQLException{
     this.ps =  con.prepareStatement("delete from reserva where codigo = ?");
     this.ps.setInt(1, reserva.getCodigo());
     this.ps.executeUpdate();
}
    
}
