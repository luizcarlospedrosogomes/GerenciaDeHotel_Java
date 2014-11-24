
package DAO;

import Model.Servico;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServicoDAO extends Banco{
   
    PreparedStatement ps;
    public ServicoDAO()throws ClassNotFoundException, SQLException{} 
    
    public void inserirServico(Servico servico) throws SQLException{
        this.ps = con.prepareStatement("Insert into servico (descricao, valor) values (?, ?)");
        this.ps.setString(1, servico.getDescricao());
        this.ps.setBigDecimal(2, servico.getValor());
        this.ps.executeUpdate();
    }
    
    public String ultimoID() throws SQLException{
        String codigo;
        this.sessao = con.createStatement();
        this.dados = sessao.executeQuery("select codigo from servico order by codigo DESC limit 1");
        this.dados.next();
        return codigo = dados.getString("codigo");

    }
}
