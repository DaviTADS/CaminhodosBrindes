package com.mycompany.caminhodosbrindes;

import javax.persistence.Entity;
import javax.persistence.Id;





import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ALUNO
 */
@Entity
@Table(name = "TB_Produto")

public class Produto implements Serializable {

    

        @Id
        @Column(name = "ID_Produto")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        @Column(name="Tamanho_Altura",nullable = false)
	private float tamanhoA;
        
        @Column(name="Tamanho_Largura",nullable = false)
        private float tamanhoL;

        @Column(name="Nome",nullable = false,length=20)
	private char nome;
        
        @Column(name="Quantidade",nullable= false)
	private int quantidade;
        
        @Column(name="Cor",nullable = false,length=10)
	private char cor;
        
        @Column(name="Preco",nullable=false)
        private float preco;
        
        @Column(name="Produto_Promocao",nullable=false)
        private int produtopromocao;
        
        private String descricao;
        
        
        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,optional=false)
        @JoinColumn(name = "ID_Promocao",referencedColumnName="Produto_Promocao")
        private Promocao promocao;
        
        @ManyToMany(mappedBy="produto")
         private Cliente cliente;  
        
        @OneToMany(fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,orphanRemoval=true)
        @JoinColumn(name = "id_image",referencedColumnName="ID_Produto")
        private Imagem imagem;
        
	private void CriarProduto(float Tamanho, char Nome, int quantidade, char cor) {

	}

	private void VisualizarProduto() {

	}

	private void VisualizarPreviaProduto() {

	}

    @Id
    public Long getID() {
        return id;
    }

    public void setID(Long ID) {
        this.id = ID;
    }

}
