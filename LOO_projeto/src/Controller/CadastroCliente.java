package Controller;

import DAO.HospedeDAO;
import Model.Hospede;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastroCliente {
    
    Hospede hospede;
    HospedeDAO hos;
    
    public CadastroCliente() throws ClassNotFoundException, SQLException{
     this.hospede = new Hospede();
     this.hos     = new HospedeDAO();
     
    }
    public boolean insereCliente(String nome, String cpf) throws SQLException{
          if(!nome.equals("") && !cpf.equals("")) { 
                this.hospede.setNome(nome);
                this.hospede.setCpf(cpf);
                this.hos.inserirCliente(hospede);
            return true;
           }
        return false;
    }
    
    public ArrayList<Hospede> preencheCampos(String codigo) throws SQLException{
        ArrayList<Hospede> lista= new ArrayList<>();
        ResultSet dados = this.hos.preencheCampos(codigo);
        while (dados.next()) {
            this.hospede.setNome(dados.getString(2));
            this.hospede.setCpf(dados.getString(3));
                
            lista.add(this.hospede);
        }
        
        return lista;
    }
    
    public String ultimoID() throws SQLException{
     return hos.ultimoID();
    }
    
}
