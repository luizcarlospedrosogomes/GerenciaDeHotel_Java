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
    public boolean insereCliente(String nome, String cpf, String operacao) throws SQLException{
        if(!nome.equals("") && !cpf.equals("")) { 
           if(operacao.equals("-1")){
               this.hospede.setNome(nome);
               this.hospede.setCpf(cpf);
               this.hos.inserirCliente(hospede);
               return true;
            }else{
              editarCliente(nome, cpf, operacao);
              return true;
             }
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
    
    private void editarCliente(String nome, String cpf, String operacao) throws SQLException{
        this.hospede.setNome(nome);
        this.hospede.setCpf(cpf);
        
        this.hospede.setCodigo(Integer.parseInt(operacao));
        this.hos.editarCliente(hospede);
    }
    
    public void excluirCliente(String codigo) throws SQLException{
      this.hospede.setCodigo(Integer.parseInt(codigo));
      this.hos.excluirCliente(hospede);
    }
    
    public ArrayList<Hospede> listarCliente() throws SQLException{
        ArrayList<Hospede> lista = new ArrayList<>();
        ResultSet dados = this.hos.listar();
        while(dados.next()){
           Hospede hospede_lista = new Hospede();
           hospede_lista.setCodigo(dados.getInt(1));
           hospede_lista.setNome(dados.getString(2));
           hospede_lista.setCpf(dados.getString(3));
           lista.add(hospede_lista);
        }
      
        return lista;
    }
    
    public int getCodigoLista(String codigo){
      return Integer.parseInt(codigo);
    }
    
}
