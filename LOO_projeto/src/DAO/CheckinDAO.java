package DAO;

import Model.Status;
import java.sql.PreparedStatement;
import java.sql.SQLException;

    public class CheckinDAO extends Banco{
     
        PreparedStatement ps;
        
        public CheckinDAO()throws ClassNotFoundException, SQLException{} 
        
        public void inserirCheckin(Status status) throws SQLException {
            this.ps = con.prepareStatement("Insert into status (cod_quarto, cod_reserva) values (?, ?)");
            this.ps.setInt(1, status.getQuarto().getCodigo());
            this.ps.setInt(2, status.getReserva().getCodigo());
           
            this.ps.executeUpdate();
           
        }
       
  
    
        
}
