

package Controller;

import DAO.ServicoDAO;
import Model.Hospede;
import Model.Servico;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastroServico {
    
    Servico servico;
    ServicoDAO ser;
    
    public CadastroServico() throws ClassNotFoundException, SQLException{
    servico = new Servico();
    ser     = new ServicoDAO();
    }
    public boolean inserirServico(String descricao, BigDecimal valor, String operacao) throws SQLException{
    if(!descricao.equals("") && !valor.equals("")){
        if(operacao.equals("-1")){
          this.servico.setDescricao(descricao);
          this.servico.setValor(valor);
          this.ser.inserirServico(servico);
          return true;
        }
        if(!operacao.equals("-1")){
            editarServico(descricao, valor, operacao);
            return true;
        }
    }
    return false;
    }
      
    public String ultimoID() throws SQLException{
       return ser.ultimoID();
    }
     private void editarServico(String descricao, BigDecimal valor, String codigo) throws SQLException{
        this.servico.setDescricao(descricao);
        this.servico.setValor(valor);
        
        this.servico.setCodigo(Integer.parseInt(codigo));
        this.ser.editarServico(servico);
    } 
    public ArrayList<Servico> listarServico() throws SQLException{
    ArrayList<Servico> lista = new ArrayList<>();
    ResultSet dados = this.ser.listar();
    while(dados.next()){
       Servico servicoLista = new Servico();
       servicoLista.setCodigo(dados.getInt(1));
       servicoLista.setDescricao(dados.getString(2));
       servicoLista.setValor(dados.getBigDecimal(3));
       lista.add(servicoLista);
    }

    return lista;
    }
}
