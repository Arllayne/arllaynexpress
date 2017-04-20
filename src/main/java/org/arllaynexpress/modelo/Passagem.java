/**
 * This file was generated by the JPA Modeler
 */
package org.arllaynexpress.modelo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author ArllayneC
 */
@Entity
public class Passagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private Date ida;

    @Basic
    private Date volta;

    @Basic
    private int quant_adulto;

    @Basic
    private int quant_crianca;

    @OneToOne(targetEntity = Pagamento.class)
    private Pagamento pagamento;

    @ManyToOne(targetEntity = Lugar.class)
    private Lugar lugar;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getIda() {
        return this.ida;
    }

    public void setIda(Date ida) {
        this.ida = ida;
    }

    public Date getVolta() {
        return this.volta;
    }

    public void setVolta(Date volta) {
        this.volta = volta;
    }

    public int getQuant_adulto() {
        return this.quant_adulto;
    }

    public void setQuant_adulto(int quant_adulto) {
        this.quant_adulto = quant_adulto;
    }

    public int getQuant_crianca() {
        return this.quant_crianca;
    }

    public void setQuant_crianca(int quant_crianca) {
        this.quant_crianca = quant_crianca;
    }

    public Pagamento getPagamento() {
        return this.pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Lugar getLugar() {
        return this.lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

}