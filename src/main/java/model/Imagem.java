
package model;

import antlr.collections.List;
import java.util.ArrayList;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    
    @Column(name="Nome_image",nullable=false,length=100)
    private String nome;
    
    @Column(name="Image_01",nullable=false)
    private String imagem1;
    
    @Column(name="Image_02",nullable=false)
    private String imagem2;
    
    @Column(name="Image_03",nullable=true)
    private String imagem3;
    
    @Column(name="Image_04",nullable=false)
    private String imagem4;
    
    @Column(name="Image_05",nullable=false)
    private String imagem5;
    
    @ManyToOne(fetch=FetchType.LAZY,optional=false)
    @JoinColumn(name="ID_Produto",referencedColumnName="id_image")
    private Produto produto;
    
}
