/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="TB_Promocao")
@Access(AccessType.FIELD)
public class Promocao implements Serializable{
    
    @Id
    @Column(name = "ID_Promocao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="DataInicio",nullable=false)
    private Date DataInicio;
    
    @Column(name="DataInicio",nullable=false)
    private Date DataFim;
    
    @Column(name="DescontoPreco",nullable=false)
    private float desconto;
    
    @OneToOne(mappedBy="promocao",optional=false)
    private Produto produto;
    
    private void verpromocao(){
        
    }
    
    private void excluipromocao(){
        
    }
    
    private void criapromocao(){
        
    }
    
    private void desativapromocao(){
        
    }
    
    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date DataFim) {
        this.DataFim = DataFim;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    
    
    
    
}
