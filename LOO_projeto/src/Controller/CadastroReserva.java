package Controller;

import DAO.ReservaDAO;
import Model.Hospede;
import Model.Reserva;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CadastroReserva {
Reserva reserva;
ReservaDAO res;
Hospede hospede;

public CadastroReserva()throws ClassNotFoundException, SQLException{
  reserva = new Reserva();
  res     = new ReservaDAO();
  hospede = new Hospede();

}

public boolean inserirReserva(String codigoCliente, String dataInicio, String dataFim) throws SQLException, ParseException{
    if(!codigoCliente.equals("") && !dataInicio.equals("") && !dataFim.equals("")){
        
        this.hospede.setCodigo(Integer.parseInt(codigoCliente));
        this.reserva.setHospede(this.hospede);
        this.reserva.setDataInicio(converteData(dataInicio));
        this.reserva.setDataFim(converteData(dataFim));
        this.res.inserirReserva(reserva);
        return true;  
    }
    
    return false;
}

private Date converteData(String data) throws ParseException{
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    java.sql.Date datas = new java.sql.Date(format.parse(data).getTime());
    return datas;
}

    public ArrayList<Reserva> listarReserva() throws SQLException{
    ArrayList<Reserva> lista = new ArrayList<>();
    ResultSet dados = this.res.listar();
    while(dados.next()){
       Hospede hospedeLista =  new Hospede();
       Reserva reservaLista = new Reserva();
       reservaLista.setCodigo(dados.getInt("cod_reserva"));
       reservaLista.setDataInicio(dados.getDate("data_inicio"));
       reservaLista.setDataFim(dados.getDate("data_fim"));
       hospedeLista.setNome(dados.getString("nome"));
       hospedeLista.setCpf(dados.getString("cpf"));
       hospedeLista.setCodigo(dados.getInt("cod_hospede"));
       reservaLista.setHospede(hospedeLista);
       lista.add(reservaLista);
    }
    
    return lista;
    }
    
    public void excluirReserva(String codigo) throws SQLException{
      this.reserva.setCodigo(Integer.parseInt(codigo));
      this.res.excluir(reserva);
    }
}
