

package Controller;
;
import DAO.CheckoutDAO;
import Model.Checkout;
import Model.Hospede;
import Model.Reserva;
import Model.Servico;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastroCheckout {
    
    CheckoutDAO che;
    ResultSet dadosLista;
    Checkout chekout;
    Reserva reserva;
    
    public CadastroCheckout() throws ClassNotFoundException, SQLException{
          
        this.che = new CheckoutDAO();
        this.chekout  = new Checkout();
        this.reserva  = new Reserva();
     }
     public ArrayList<Checkout> buscarConsumo(String codigo) throws SQLException{
       // this.dadosLista = this.che.buscarConsumoLista(Integer.parseInt(codigo));
        ArrayList<Checkout> lista= new ArrayList<>();
        ResultSet dados = this.che.buscarConsumo(codigo);
        while (dados.next()) {
            Checkout checkout = new Checkout();
            Hospede hospede   = new Hospede();
            Servico servico   = new Servico();
            checkout.setPeriodo(dados.getInt("periodo"));
            hospede.setCpf(dados.getString("cpf"));
            hospede.setNome(dados.getString("nome"));
            servico.setValor(dados.getBigDecimal("valor"));
            checkout.setHospede(hospede);
            checkout.setServico(servico);  
            lista.add(checkout);
        }
        
        return lista;
     }
     
      public ArrayList<Checkout> buscarConsumoLista() throws SQLException{
        ArrayList<Checkout> lista= new ArrayList<>();
        while (this.dadosLista.next()) {
            Checkout checkout = new Checkout();
            Servico servico   = new Servico();
            servico.setValor(this.dadosLista.getBigDecimal("descricao"));
            servico.setValor(this.dadosLista.getBigDecimal("valor"));
            checkout.setServico(servico);  
            lista.add(checkout);
        }
        
        return lista;
     }
     
      public boolean inserirCheckout(String codReserva) throws SQLException{
          if(!codReserva.equals("")){
              this.reserva.setCodigo(Integer.parseInt(codReserva));
              this.chekout.setReserva(reserva);
              this.che.inserirCheckout(chekout);
          }
          
          return false;
      }
}
