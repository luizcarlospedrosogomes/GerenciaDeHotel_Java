
package Controller;

import DAO.QuartoDAO;
import Model.Quarto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.hibernate.cfg.annotations.ResultsetMappingSecondPass;


public class CadastroQuarto {
    Quarto quarto; 
    QuartoDAO qua;
  public CadastroQuarto() throws ClassNotFoundException, SQLException{
     this.quarto = new Quarto();
     this.qua    = new QuartoDAO();
  }
  
  public boolean inserirQuarto(String numero, int tipo) throws SQLException{
      if (!numero.equals("")) {
          this.quarto.setNumero(Integer.parseInt(numero));
          this.quarto.setTipo(tipo);
          this.qua.inserirQuarto(quarto);
          return true;
      }
      return false;
  }
  public ArrayList<Quarto> preencheCombobox() throws SQLException{
    ArrayList<Quarto> lista = new ArrayList<>();
    ResultSet campo = qua.preencheComboobx();
    while(campo.next()){
      quarto.setCodigo(campo.getInt(1));
      quarto.setNumero(campo.getInt(2));
      lista.add(quarto);
    }
    return lista;
  }
}
