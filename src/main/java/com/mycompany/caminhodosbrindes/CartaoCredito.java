
package com.mycompany.caminhodosbrindes;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_CartaodeCredito")

public class CartaoCredito {

    
    @Id
    @Column(name = "ID_Cartao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcartao;
    
    @Column(name="Numero",nullable=false)
    private int numerocartao;
    
    @Column(name="CodigoSeguranca",nullable=false)
    private int codigoseguranca;
    
    @Column(name="NomeTitular",nullable=false,length=45)
    private String nometitular;
    
    @Column(name="Validae",nullable=false)
    private Date validade;
    
    @Column(name="Bandeira",nullable=false,length=10)
    private String bandeira;
    
    @OneToOne(mappedBy="cartaocredito",optional=false)
    private Cliente cliente;

    
    
    public Long getIdcartao() {
        return idcartao;
    }

    public void setIdcartao(Long idcartao) {
        this.idcartao = idcartao;
    }

    public int getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(int numerocartao) {
        this.numerocartao = numerocartao;
    }

    public int getCodigoseguranca() {
        return codigoseguranca;
    }

    public void setCodigoseguranca(int codigoseguranca) {
        this.codigoseguranca = codigoseguranca;
    }

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    
}