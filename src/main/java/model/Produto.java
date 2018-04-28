package model;

import javax.persistence.Entity;
import javax.persistence.Id;

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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ALUNO
 */
@Entity
@Table(name = "TB_Produto")
@Access(AccessType.FIELD)
public class Produto implements Serializable {

    @Id
    @Column(name = "ID_Produto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Tamanho_Altura", nullable = false)
    private float Altura;

    @Column(name = "Tamanho_Largura", nullable = false)
    private float Largura;

    @Column(name = "Nome", nullable = false, length = 20)
    private String nome;

    @Column(name = "Quantidade", nullable = false)
    private int quantidade;

    @Column(name = "Cor", nullable = false, length = 10)
    private String cor;

    @Column(name = "Preco", nullable = true)
    private float preco;

    @Column(name = "Produto_Promocao", nullable = true)
    private int produtopromocao;
    
    @Column(name="tipo",nullable=true,length=100)
    private String tipo;

    private String descricao;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "ID_Promocao", referencedColumnName = "Produto_Promocao")
    private Promocao promocao;

    @ManyToMany(mappedBy = "produto")
    private Cliente cliente;

    @OneToMany(mappedBy="produto",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List <Imagem> imagem;

    private void CriarProduto(float Tamanho, char Nome, int quantidade, char cor) {

    }

    private void VisualizarProduto() {

    }

    private void VisualizarPreviaProduto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getProdutopromocao() {
        return produtopromocao;
    }

    public void setProdutopromocao(int produtopromocao) {
        this.produtopromocao = produtopromocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Imagem> getImagem() {
        return imagem;
    }

    public void setImagem(List<Imagem> imagem) {
        this.imagem = imagem;
    }

   

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getLargura() {
        return Largura;
    }

    public void setLargura(float Largura) {
        this.Largura = Largura;
    }

    public void setImagem01(Byte i1) {
       
    }

    public void setImagem02(Byte i2) {
        
    }

    public void setImagem03(Byte i3) {
        
    }

    public void setCorVermelho(int i) {
        
    }

    public void setCorPreto(int i) {
        
    }

    public void setCorAzul(int i) {
        
    }

    public void setCorBranco(int i) {
        
    }

}
