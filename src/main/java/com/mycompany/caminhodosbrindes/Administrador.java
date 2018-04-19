package com.mycompany.caminhodosbrindes;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/*
@author
*/

@Entity
@Table(name="TB_Administrador")
public class Administrador extends Usuario implements Serializable {

        @Id
        @Column(name = "id_Administrador")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        
        @Column(name="nome_Administrador",nullable = false)
	private String nome;
        
        @Column(name="email_Administrador",nullable=false,length=12)
	private String email;
        
        @Column(name="login_Administrador",nullable=false,length=10)
	private String loginadm;
        
        @Column(name="senha_Administrador",nullable=false,length=13)
	private String senha;
        
        @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval=true)
        @JoinColumn(name="ID_Produto", referencedColumnName="id_Administrador")
        private Produto produto;
        
        

        @Override
        void RealizaLogin(String LoginAdm, String Senha) {

	}
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginadm() {
        return loginadm;
    }

    public void setLoginadm(String loginadm) {
        this.loginadm = loginadm;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

    
    

    
}
