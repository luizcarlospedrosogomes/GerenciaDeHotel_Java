
package DAO;

import Model.Servico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public void editarServico(Servico servico) throws SQLException{
     this.ps =  con.prepareStatement("update servico set descricao = ? , valor = ? where codigo = ?");
     this.ps.setString(1,servico.getDescricao());
     this.ps.setBigDecimal(2,servico.getValor());
     this.ps.setInt(3, servico.getCodigo());
     this.ps.executeUpdate();
    }
    
    public ResultSet listar() throws SQLException{
    this.sessao = con.createStatement();
    return  sessao.executeQuery("select codigo, descricao, valor from servico order by codigo");
    }
    
    public ResultSet buscaServico(String codigo) throws SQLException{
    this.sessao = con.createStatement();
    return  sessao.executeQuery("select descricao, valor from servico where codigo = "+codigo);
  
}
}
