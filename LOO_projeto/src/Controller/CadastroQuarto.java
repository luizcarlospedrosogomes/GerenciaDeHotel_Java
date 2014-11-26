
package Controller;

import DAO.QuartoDAO;
import Model.Quarto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



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
      Quarto qua_lista = new Quarto();
      qua_lista.setCodigo(campo.getInt(1));
      //qua_lista.setNumero(campo.get(2));
      lista.add(qua_lista);
    }
    return lista;
  }
  
      
    public ArrayList<Quarto> listarQuarto() throws SQLException{
        ArrayList<Quarto> lista = new ArrayList<>();
        ResultSet dados = this.qua.listar();
        while(dados.next()){
           Quarto quartoLita = new Quarto();
           quartoLita.setCodigo(dados.getInt(1));
           quartoLita.setNumero(dados.getInt(2));
        
           lista.add(quartoLita);
        }
      
        return lista;
    }
    
     public void excluirQuarto(String codigo) throws SQLException{
      this.quarto.setNumero(Integer.parseInt(codigo));
      this.qua.excluirQuarto(quarto);
    }
}
