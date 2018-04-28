package com.mycompany.caminhodosbrindes;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="TB_Cliente")
@Access(AccessType.FIELD)
public class Cliente implements Serializable {
    
        @Id
        @Column(name = "User_ID")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idcliente;
        
        @Column(name="Nome",nullable=false,length=45)
	private String nome;
        
        @Column(name="sobrenome_usuario",nullable=false,length=45)
        private String sobrenome;
        
        @Column(name="Email",nullable=false,length=45)
	private String email;
        
        @Column(name="Login",nullable=false,length=45)
	private String logincliente;
        
        @Column(name="Senha",nullable=false,length=45)
	private String senha;
        
        @Column(name="telefone_usuario",nullable=false,length=45)
	private int telefone;
        
        @Column(name="celular_usuario",nullable=false)
        private int celular;
        
        @Column(name="cidade_usuario",nullable=false,length=45)
        private String cidade;
        
        @Column(name="bairro_usuario",nullable=false,length=45)
        private String Bairro;
        
        @Column(name="cep_usuario",nullable=false,length=45)
        private String cep;
        
        @Column(name="Cartao",nullable=true)
        private int cartao;
        
        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name="TB_Pedido",joinColumns = {
                @JoinColumn(name="id_usu")},
                inverseJoinColumns = {@JoinColumn(name="ID_Pedido")}
                )
        private Produto produto;
        
        @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval=true)
        @JoinColumn(name="ID_Cartao", referencedColumnName="Cartao")
        private CartaoCredito cartaocredito;
        
        
         
        
        
        void RealizaLogin(String logincliente,String senha) {
        
    }

        
        void FazerCadastro(String Nome, String Email, String CPF, boolean tipo) {
       
    }


	private void ListarProdutos() {

	}

	private void VisualizarProduto() {

	}

	private void EnviarComentarios(char Nome, char Email, int Telefone, char Mensagem) {

	}

	private void VisualizarPreviaProduto() {

	}

	private void VisualizarPromocoes() {

	}

	private void VisualizarNovidades() {

	}

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogincliente() {
        return logincliente;
    }

    public void setLogincliente(String logincliente) {
        this.logincliente = logincliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CartaoCredito getCartaocredito() {
        return cartaocredito;
    }

    public void setCartaocredito(CartaoCredito cartaocredito) {
        this.cartaocredito = cartaocredito;
    }

    


}
