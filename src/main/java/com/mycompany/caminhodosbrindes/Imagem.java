
package com.mycompany.caminhodosbrindes;

import antlr.collections.List;
import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author alunof16
 */

@Entity
@Table(name = "TB_Image")
@Access(AccessType.FIELD)
public class Imagem {
    
    
    @Id
    @Column(name = "id_image")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idimagem;
    
    @Column(name="Image_01",nullable=false)
    private String imagem1;
    
    @Column(name="Image_02",nullable=false)
    private String imagem2;
    
    @Column(name="Image_03",nullable=false)
    private String imagem3;
    
    @Column(name="Cor_01",nullable=false)
    private String cor1;
    
    @Column(name="Cor_02",nullable=false)
    private String cor2;
    
    @Column(name="Cor_03",nullable=false)
    private String cor3;
    
    @Column(name="Cor_04",nullable=true)
    private String cor4;
    
    @Column(name="Cor_05",nullable=true)
    private String cor5;
    
    @Column(name="Cor_06",nullable=true)
    private String cor6;
    
    @Column(name="Cor_07",nullable=true)
    private String cor7;
    
    @OneToMany(mappedBy="iamgem")
    private Produto produto;
    
}
