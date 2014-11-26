package DAO;

import Model.Quarto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuartoDAO extends Banco{
 
    PreparedStatement ps;
  //  Quarto quarto;
    public QuartoDAO()throws ClassNotFoundException, SQLException{}    
    
    
    public void inserirQuarto(Quarto quarto) throws SQLException{
    this.ps =  con.prepareStatement("Insert into quarto (numero, tipo) values (?, ?)");
    this.ps.setInt(1,quarto.getNumero());
    this.ps.setInt(2,quarto.getTipo());
    this.ps.executeUpdate();
    }
    
    public ResultSet preencheComboobx() throws SQLException{
        this.sessao = con.createStatement();
        String sql = " select '1' as valor, 'individual' as tipo\n" +
                     " union all\n" +
                     " select '2' as valor, 'casal' as tipo\n" +
                     " union all\n" +
                     " select '3' as valor, 'suite' as tipo";
       // this.ps = con.prepareStatement(sql);
        return this.dados = sessao.executeQuery(sql);
    }
    
    public ResultSet listar() throws SQLException{
    this.sessao = con.createStatement();
    return  sessao.executeQuery("select codigo, numero  from quarto order by codigo");
    }
    public void excluirQuarto(Quarto quarto) throws SQLException{
     this.ps =  con.prepareStatement("delete from quarto where numero = ?");
     this.ps.setInt(1, quarto.getNumero());
     this.ps.executeUpdate();
}
}
