package com.mycompany.caminhodosbrindes;

import javax.persistence.Entity;
import javax.persistence.Id;





import java.io.Serializable;
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
@Access(AccessType.FIELD)
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
	private String nome;
        
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getTamanhoA() {
        return tamanhoA;
    }

    public void setTamanhoA(float tamanhoA) {
        this.tamanhoA = tamanhoA;
    }

    public float getTamanhoL() {
        return tamanhoL;
    }

    public void setTamanhoL(float tamanhoL) {
        this.tamanhoL = tamanhoL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public char getCor() {
        return cor;
    }

    public void setCor(char cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getProdutopromocao() {
        return produtopromocao;
    }

    public void setProdutopromocao(int produtopromocao) {
        this.produtopromocao = produtopromocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    

}
