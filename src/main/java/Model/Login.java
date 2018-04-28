/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ALUNO
 */
public class Login {
    String Email;
    String Senha;
    String Login;
    String Nome;
    
    public String getEmail(){
        return Email;
        
    }
   public void SetEmail(String a){
       this.Email=a;
   } 
   public String getSenha(){
       return Senha;
       
   }
   public void SetSenha(String b){
       this.Senha= b;
   }
   public String getLogin(){
       return Login;
   }
   public void SetLogin(String l)
   {
       this.Login=l;
   }
   public String getNome(){
       return Nome;
   }
   public void setNome(String n){
       this.Nome=n;
   }
}
