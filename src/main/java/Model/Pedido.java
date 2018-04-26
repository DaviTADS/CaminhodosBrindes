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
public class Pedido {
    int ID_Pedido;
    String Status_Pedido;
    Cartao Cartao_id;
    Byte Arquivo;
    int Quantidade ;
    String Mensagem;
    
     public int GetIdPedido(){
      return ID_Pedido;
  }
  public void SetIdPedido(int id){
      this.ID_Pedido = id;
  }
   public String GetStatus(){
      return Status_Pedido;
  }
  public void SetId(String status){
      this.Status_Pedido = status;
  }
  
   public Byte GetArquivo(){
      return Arquivo;
  }
  public void GetArquivo(Byte image){
      this.Arquivo = image;
  }
   public int GetQuantidade(){
      return Quantidade;
  }
  public void SetQuantidade(int id){
      this.Quantidade = id;
  }
   public String GetMensagem(){
      return Mensagem;
  }
  public void SetMensagem(String mensagem){
      this.Mensagem = mensagem;
  }
}
