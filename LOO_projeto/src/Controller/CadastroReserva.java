package Controller;

import DAO.ReservaDAO;
import Model.Reserva;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroReserva {
Reserva reserva;
ReservaDAO res;

public CadastroReserva()throws ClassNotFoundException, SQLException{
  reserva = new Reserva();
  res     = new ReservaDAO();
}

public boolean inserirReserva(String codigoCliente, String dataInicio, String dataFim) throws SQLException, ParseException{
    if(!codigoCliente.equals("") && !dataInicio.equals("") && !dataFim.equals("")){
        
        this.reserva.setCodigoCliente(Integer.parseInt(codigoCliente));
        this.reserva.setDataInicio(converteData(dataInicio));
        this.reserva.setDataFim(converteData(dataFim));
        this.res.inserirReserva(reserva);
        return true;  
    }
    
    return false;
}

private Date converteData(String data) throws ParseException{
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    java.sql.Date datas = new java.sql.Date(format.parse(data).getTime());
    return datas;
}
}
