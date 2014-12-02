package Model;
// Generated 18/11/2014 01:42:29 by Hibernate Tools 3.6.0



/**
 * ConsumoServico generated by hbm2java
 */
public class ConsumoServico  implements java.io.Serializable {


     private int codigo;
     private Servico servico;
     private Hospede hospede;
     private Reserva reserva;

    public ConsumoServico() {
    }

	
    public ConsumoServico(int codigo) {
        this.codigo = codigo;
    }
    public ConsumoServico(int codigo, Servico servico, Hospede hospede) {
       this.codigo = codigo;
       this.servico = servico;
       this.hospede = hospede;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Servico getServico() {
        return this.servico;
    }
    
    public void setServico(Servico servico) {
        this.servico = servico;
    }
    public Hospede getHospede() {
        return this.hospede;
    }
    
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    /**
     * @return the reserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reserva the reserva to set
     */
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }




}


