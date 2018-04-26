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
public class Cliente {
    int Id;
    String Nome;
    String Email;
    String Login;
    String Senha;
    String Sobrenome;
    String Bairro;
    String Endereco;
    String Cep;
    String Telefone;
    String Celular;
    
  public int GetId(){
      return Id;
  }
  public void SetId(int id){
      this.Id = id;
  }  
    
  public String GetNome(){
      return Nome;
  }
  public void SetNome(String nome){
      this.Nome = nome;
  }
  public String GetEmail(){
      return Email;
  }
  public void SetEmail(String email){
      this.Email = email;
  }
   public String GetLogin(){
      return Login;
  }
  public void SetLogin(String login){
      this.Login = login;
  }
  public String GetSenha(){
      return Senha;
  }
  public void SetSenha(String senha){
      this.Senha = senha;
  }
   public String GetSobrenome(){
      return Sobrenome;
  }
  public void SetSobrenome(String sobrenome){
      this.Sobrenome = sobrenome;
  }
   public String GetBairro(){
      return Bairro;
  }
  public void SetBairro(String bairro){
      this.Bairro = bairro;
  }
  public String GetEndereco(){
      return Endereco;
  }
  public void SetEndereco(String endereco){
      this.Endereco = endereco;
  }
   public String GetCep(){
      return Cep;
  }
   public void SetCep(String cep){
      this.Cep = cep;
  }  
    public String GetTelefone(){
      return Telefone;
  }
  public void SetTelefone(String telefone){
      this.Telefone = telefone;
  }
   public String GetCelular(){
      return Celular;
  }
  public void SetCelular(String celular){
      this.Celular = celular;
  }
}
