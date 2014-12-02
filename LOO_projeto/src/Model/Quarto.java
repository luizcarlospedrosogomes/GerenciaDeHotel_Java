package Model;

import java.util.HashSet;
import java.util.Set;


public class Quarto  implements java.io.Serializable {


     private int codigo;
     private Integer numero;
     private Integer tipo;
     private Set statuses = new HashSet(0);
     private Hospede hospede;
    public Quarto() {
    }

	
    public Quarto(int codigo) {
        this.codigo = codigo;
    }
    public Quarto(int codigo, Integer numero, Set statuses) {
       this.codigo = codigo;
       this.numero = numero;
       this.statuses = statuses;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Set getStatuses() {
        return this.statuses;
    }
    
    public void setStatuses(Set statuses) {
        this.statuses = statuses;
    }

    /**
     * @return the tipo
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the hospede
     */
    public Hospede getHospede() {
        return hospede;
    }

    /**
     * @param hospede the hospede to set
     */
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }




}


