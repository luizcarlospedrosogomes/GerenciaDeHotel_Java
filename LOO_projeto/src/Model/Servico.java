package Model;
// Generated 18/11/2014 01:42:29 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Servico generated by hbm2java
 */
public class Servico  implements java.io.Serializable {


     private int codigo;
     private String descricao;
     private BigDecimal valor;
     private Set consumoServicos = new HashSet(0);

    public Servico() {
    }

	
    public Servico(int codigo) {
        this.codigo = codigo;
    }
    public Servico(int codigo, String descricao, BigDecimal valor, Set consumoServicos) {
       this.codigo = codigo;
       this.descricao = descricao;
       this.valor = valor;
       this.consumoServicos = consumoServicos;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Set getConsumoServicos() {
        return this.consumoServicos;
    }
    
    public void setConsumoServicos(Set consumoServicos) {
        this.consumoServicos = consumoServicos;
    }




}


