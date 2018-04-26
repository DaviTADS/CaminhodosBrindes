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
public class Promocao {
    int id_promocao;
    Date DataInicio;
    Date DataFim;
    Float DescontoPreco;
    
    public int getId(){
        return id_promocao;
        
    }
    public void setId(int i){
        this.id_promocao=i;
        
    }
    public Date getInicio(){
        return DataInicio;
    }
    public void setInicio(Date a){
        this.DataInicio=a;
        
    }
    public Date getFim(){
        return DataFim;
    }
    public void setFim(Date b){
        this.DataFim=b;
    }
    public float getDesconto(){
       return DescontoPreco;
    }
   public void setDesconto(float a){
       this.DescontoPreco =a;
   } 
   
}
