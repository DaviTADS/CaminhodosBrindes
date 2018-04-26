/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Date;

/**
 *
 * @author Nome
 */
public class Cartao {
    int ID_Cartao;
    long Numero;
    int CodigoSeguranca;
    String NomeTitular;
    Date Validade;
    String bandeira;
    
   public int getIdCartao(){
       return ID_Cartao;
       
   } 
   public void setIdCartao(int i){
       this.ID_Cartao=i;
   }
   public long getNumero(){
       return Numero;
   }
   public void setNumero(long numero){
       this.Numero=numero;
   }
   public int getCodigo(){
       return CodigoSeguranca;}
   public void setCodigo(int cod){
       this.CodigoSeguranca=cod;
       
   }
   public String getTitular(){
       return NomeTitular;
   }
   public void setTitular(String nome){
       this.NomeTitular=nome;
   }
   public Date getValidade(){
       return Validade;
   }
   public void setValidade(Date v){
       this.Validade=v;
   }
   public String getBandeira(){
       return bandeira;
      
   }
   public void setBandeira(String b){
       this.bandeira=b;
   }
}
