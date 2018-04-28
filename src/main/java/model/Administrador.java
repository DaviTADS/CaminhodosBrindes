package model;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;



/*
@author
*/

@Entity
@Table(name="TB_Administrador")
@Access(AccessType.FIELD)
public class Administrador implements Serializable {

        @Id
        @Column(name = "id_Administrador")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        
        @Column(name="nome_Administrador",nullable = false,length=45)
	private String nome;
        
        @Column(name="email_Administrador",nullable=false,length=45)
	private String email;
        
        @Column(name="login_Administrador",nullable=false,length=45)
	private String loginadm;
        
        @Column(name="senha_Administrador",nullable=false,length=45)
	private String senha;
        
        @OneToMany(mappedBy="administrador",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval=true)
        private List <Produto> produto;
        
        

        
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
