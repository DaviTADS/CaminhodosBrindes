/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Nome
 */
public class Administrador {
    int id;
    String nome_administrador;
    String email_administrador;
    String senha_administrador;
    String login_administrador;
    
    public int getId(){
        return id;
       
    }
    public void setId(int i){
        this.id=i;
    }
    public String getNomeAdm(){
        return nome_administrador;
    }
    public void setNomeAdm(String a){
        this.nome_administrador=a;
    }
    public String getEmailAdm(){
        return email_administrador;
    }
    public void setEmailAdm(String email){
        this.email_administrador=email;
    }
    public String getSenhaAdm(){
        return senha_administrador;
    }
    public void setSenhaAdm(String senha){
        this.senha_administrador=senha;
    }
    public String getLogin(){
        return login_administrador;
        
    }
    public void setLogin(String login){
        this.login_administrador=login;
    }
}
