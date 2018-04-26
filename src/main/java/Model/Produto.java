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
public class Produto {
    int Id;
    String Nome;
    String tipo;
    Float Altura;
    Float Largura;
    int Quantidade;
    int Cor_vermelho;
    int idImage;
    String Descricao;
    int Cor_branco;
    int Cor_preto;
    int Cor_azul;
    String OutrasCores;
    Float preco;
    Image imagem;
    
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
  public String GetTipo(){
      return tipo;
  }
  public void SetTipo(String nome){
      this.tipo = nome;
      
  }
  public float GetAltura(){
      return Altura;
  }
  public void SetAltura(float altura){
      this.Altura = altura;
      
  }
  public float GetLargura(){
      return Largura;
  }
  public void SetLargura(float largura){
      this.Largura = largura;
      
  }
  public int GetQuantidade(){
      return Quantidade;
  }
  public void SetQuantidade(int quantidade){
      this.Quantidade = quantidade;
      
      
  }
  public int GetCorVermelho(){
      return Cor_vermelho;
  }
  public void SetCorVermelho(int cor){
      this.Cor_vermelho = cor;
      
  }
  public int GetCorBranco(){
      return Cor_branco;
  }
  public void SetCorBranco(int cor){
      this.Cor_branco = cor;
      
  }
  public int GetCorPreto(){
      return Cor_preto;
  }
  public void SetCorPreto(int cor){
      this.Cor_preto = cor;
      
  }
  public int GetCorAzul(){
      return Cor_azul;
  }
  public void SetCorAzul(int cor){
      this.Cor_azul = cor;
      
  }
  public int GetidImage(){
      return idImage;
  }
  public void SetidImage(int id_image){
      this.idImage = id_image;
  }
   public String GetOutros(){
      return OutrasCores;
  }
  public void SetOutros(String nome){
      this.OutrasCores = nome;
      
  }
  
  public String GetDescricao(){
      return Descricao;
  }
  public void SetDescricao(String descricao){
      this.Descricao = descricao;
  }
  public float GetPreco(){
    return preco;
  }
  public void Setpreco(float altura){
      this.preco = altura;
      
  }
  public Byte getImagem01(){
  return imagem.getImage01();
  }
  public void setImagem01(Byte a){
      this.imagem.setImage01(a);
  }
  public Byte getImagem02(){
  return imagem.getImage02();
  }
  public void setImagem02(Byte a){
      this.imagem.setImage02(a);
  }
  public Byte getImagem03(){
  return imagem.getImage03();
  }
 public void setImagem03(Byte a){
      this.imagem.setImage03(a);
  }
 public Byte getImagem04(){
  return imagem.getImage04();
  }
 public void setImagem04(Byte a){
      this.imagem.setImage04(a);
  }
 public Byte getImagem05(){
  return imagem.getImage05();
  }
 public void setImagem05(Byte a){
      this.imagem.setImage05(a);
  }
}
