package Controller;

import DAO.CheckinDAO;
import DAO.QuartoDAO;
import Model.Quarto;
import Model.Reserva;
import Model.Status;
import java.sql.SQLException;

public class Checkin {
  
    Status status;
    CheckinDAO checkin;
    Reserva reserva;
    Quarto quarto;
    QuartoDAO qua;
    
    
    public Checkin() throws ClassNotFoundException, SQLException{
     this.status = new Status();
     this.checkin = new CheckinDAO();
     this.reserva = new Reserva();
     this.quarto  = new Quarto();
     this.qua     = new QuartoDAO();
     
    }
    
     public boolean inserirCheckin(String codReserva, String codQuarto) throws SQLException{
        if(!codReserva.equals("") && !codQuarto.equals("")) { 
          // if(operacao.equals("-1")){
               this.reserva.setCodigo(Integer.parseInt(codReserva));
               this.quarto.setCodigo(Integer.parseInt(codQuarto));
               this.status.setQuarto(quarto);
               this.status.setReserva(reserva);
               this.checkin.inserirCheckin(this.status);
               return true;
            //}else{
            //  editarCliente(nome, cpf, operacao);
            //  return true;
           //  }
        } 
        return false;
     }
     
     public String buscaQuarto(String numero) throws SQLException{
            if(!this.qua.buscaQuarto(numero).equals(""))
                return this.qua.buscaQuarto(numero);
            return "-1";
     }
}
