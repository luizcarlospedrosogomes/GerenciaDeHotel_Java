
package DAO;

import Model.ConsumoServico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsumoServicoDAO extends Banco{
    
    PreparedStatement ps;
    public ConsumoServicoDAO() throws ClassNotFoundException, SQLException{} 
    
    public void inserirConsumo(ConsumoServico consumo) throws SQLException{
    this.ps =  con.prepareStatement("Insert into consumo_servico (cod_servico, cod_reserva) values (?, ?)");
    this.ps.setInt(2,consumo.getReserva().getCodigo());
    this.ps.setInt(1,consumo.getServico().getCodigo());
    this.ps.executeUpdate();
    }
  
}
