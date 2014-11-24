package Model;
// Generated 18/11/2014 01:42:29 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Reserva generated by hbm2java
 */
public class Reserva  implements java.io.Serializable {


     private int codigo;
     private Hospede hospede;
     private Date dataInicio;
     private Date dataFim;
     private Integer confirmado;

    public Reserva() {
    }

	
    public Reserva(int codigo) {
        this.codigo = codigo;
    }
    public Reserva(int codigo, Hospede hospede, Date dataInicio, Date dataFim, Integer confirmado) {
       this.codigo = codigo;
       this.hospede = hospede;
       this.dataInicio = dataInicio;
       this.dataFim = dataFim;
       this.confirmado = confirmado;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Hospede getHospede() {
        return this.hospede;
    }
    
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    public Date getDataInicio() {
        return this.dataInicio;
    }
    
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public Date getDataFim() {
        return this.dataFim;
    }
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    public Integer getConfirmado() {
        return this.confirmado;
    }
    
    public void setConfirmado(Integer confirmado) {
        this.confirmado = confirmado;
    }




}


