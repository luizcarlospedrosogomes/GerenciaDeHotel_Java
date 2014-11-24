package Model;
// Generated 18/11/2014 01:42:29 by Hibernate Tools 3.6.0



/**
 * Status generated by hbm2java
 */
public class Status  implements java.io.Serializable {


     private int codigo;
     private Hospede hospede;
     private Quarto quarto;

    public Status() {
    }

	
    public Status(int codigo) {
        this.codigo = codigo;
    }
    public Status(int codigo, Hospede hospede, Quarto quarto) {
       this.codigo = codigo;
       this.hospede = hospede;
       this.quarto = quarto;
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
    public Quarto getQuarto() {
        return this.quarto;
    }
    
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }




}


