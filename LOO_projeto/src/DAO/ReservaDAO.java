package DAO;

import Model.Reserva;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservaDAO extends Banco{
    PreparedStatement ps;
    
    public ReservaDAO()throws ClassNotFoundException, SQLException{} 
    
    public void inserirReserva(Reserva reserva) throws SQLException{
        this.ps = con.prepareStatement("insert into reserva(cod_cliente, data_inicio, data_fim, confirmado) values (?, ?, ?, ?)");
        this.ps.setInt(1, reserva.getCodigo());
        this.ps.setDate(2, (Date) reserva.getDataInicio());
        this.ps.setDate(3, (Date) reserva.getDataFim());
        this.ps.setInt(4, 0);
        this.ps.executeUpdate();        
    }
}
