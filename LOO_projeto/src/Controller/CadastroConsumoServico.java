
package Controller;

import DAO.ConsumoServicoDAO;
import Model.ConsumoServico;
import Model.Reserva;
import Model.Servico;
import java.sql.SQLException;


public class CadastroConsumoServico {

    ConsumoServico consumo;
    ConsumoServicoDAO con;
    Servico  servico;
    Reserva  reserva;
    
    public CadastroConsumoServico() throws ClassNotFoundException, SQLException{
        this.consumo  = new ConsumoServico();
        this.con      = new ConsumoServicoDAO();
        this.servico  = new Servico();
        this.reserva  = new Reserva();
    }
    
    public boolean inserirConsumo(String codReserva, String codServico) throws SQLException{
    if(!codReserva.equals("") && !codServico.equals("")){
       
          this.servico.setCodigo(Integer.parseInt(codServico));
          this.reserva.setCodigo(Integer.parseInt(codReserva));
          this.consumo.setServico(servico);
          this.consumo.setReserva(reserva);
          this.con.inserirConsumo(consumo);
          return true;
        }
    return false;
    }
}
