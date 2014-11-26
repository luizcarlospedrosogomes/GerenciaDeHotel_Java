
package DAO;

import Model.Hospede;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospedeDAO extends Banco{
//Hospede hospede;
PreparedStatement ps;

public HospedeDAO() throws ClassNotFoundException, SQLException{} 

public void inserirCliente(Hospede hospede) throws SQLException{
    this.ps =  con.prepareStatement("Insert into hospede (nome, cpf) values (?, ?)");
    this.ps.setString(1,hospede.getNome());
    this.ps.setString(2,hospede.getCpf());
    this.ps.executeUpdate();

}

public String ultimoID() throws SQLException{
    String codigo;
    this.sessao = con.createStatement();
    this.dados = sessao.executeQuery("select codigo from hospede order by codigo DESC limit 1");
    this.dados.next();
    return  codigo = dados.getString("codigo");
}
 
public ResultSet preencheCampos(String codigo) throws SQLException{
    this.sessao = con.createStatement();
    return  sessao.executeQuery("select codigo, nome, cpf from hospede where codigo = "+codigo);
  
}

public void editarCliente(Hospede hospede) throws SQLException{
     this.ps =  con.prepareStatement("update hospede set nome = ? , cpf = ? where codigo = ?");
     this.ps.setString(1,hospede.getNome());
     this.ps.setString(2,hospede.getCpf());
     this.ps.setInt(3, hospede.getCodigo());
     this.ps.executeUpdate();
}

public void excluirCliente(Hospede hospede) throws SQLException{
     this.ps =  con.prepareStatement("delete from hospede where codigo = ?");
     this.ps.setInt(1, hospede.getCodigo());
     this.ps.executeUpdate();
}

public ResultSet listar() throws SQLException{
    this.sessao = con.createStatement();
    return  sessao.executeQuery("select codigo, nome, cpf from hospede order by codigo");
}
}
