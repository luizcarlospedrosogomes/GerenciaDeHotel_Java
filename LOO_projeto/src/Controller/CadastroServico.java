

package Controller;

import DAO.ServicoDAO;
import Model.Servico;
import java.math.BigDecimal;
import java.sql.SQLException;

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
          // edicao
        }
    }
    return false;
    }
      
    public String ultimoID() throws SQLException{
       return ser.ultimoID();
    }
            
}
