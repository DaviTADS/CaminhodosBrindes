package com.mycompany.caminhodosbrindes;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_Pedido")
@Access(AccessType.FIELD)
public class Pedido {
    
        @Id
        @Column(name = "ID_Promocao")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idpedido;
        
        @Column(name="Status_Pedido",nullable=false,length=45)
        private String status;
         
        @Column(name="Cartao_id")
        private Long cartaoid;
        
        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,optional=false)
        @JoinColumn(name = "ID_Cartao",referencedColumnName="Cartao_id")
        private CartaoCredito cartaocredito;
        
        

	private void AnalisarStatusPedido() {

	}

	private void PagarOnline() {

	}

	private void FazerPedido() {

	}

}
