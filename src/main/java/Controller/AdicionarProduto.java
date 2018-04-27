/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALUNO
 */
@WebServlet(urlPatterns = "/adicionarProduto")
public class AdicionarProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdicionarProduto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdicionarProduto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        Produto produto = new Produto();
        String nome = request.getParameter("Nome_produto");
        String altura = request.getParameter("Altura_produto");
        String largura = request.getParameter("Largura_produto");
        String quantidade = request.getParameter("Quantidade_produto");
        
        String descricao = request.getParameter("descricao_produto");
        String tipo = request.getParameter("tipo_produto");
        String vermelho = request.getParameter("cor_vermelho");
        String azul= request.getParameter("cor_azul");
       String preto = request.getParameter("cor_preto");
       String branco = request.getParameter("cor_branco");
       String outros = request.getParameter("OutrasCores");
       String preco = request.getParameter("preco_produto");
       String image1 = request.getParameter("image01");
       String image2 = request.getParameter("image02");
       String image3 = request.getParameter("image03");
       String image4 = request.getParameter("image04");
       String image5 = request.getParameter("image05");
       
       
       if(nome!=null){ produto.setNome(nome); } 
       else{ }
       if(altura!=null){float alt = Float.parseFloat(altura);produto.setAltura(alt); } 
       else{ }
       if(largura!=null){float larg = Float.parseFloat(largura);produto.setLargura(larg); } 
       else{ }
        if(descricao!=null){ produto.setDescricao(descricao); } 
       else{ }
        if(outros!=null){ produto.setNome(nome); } 
       else{ }
        if(preco!=null){float prec = Float.parseFloat(preco);produto.setPreco(prec); } 
       else{ }
       if(image1!=null){
           Byte i1 =Byte.parseByte(image1);produto.setImagem01(i1);
       }
       else{}
       if(image2!=null){
           Byte i2 =Byte.parseByte(image2);produto.setImagem02(i2);
       }
        Byte i3 =Byte.parseByte(image3);produto.setImagem03(i3);
        Byte i4 =Byte.parseByte(image4);produto.setImagem01(i4);
        Byte i5 =Byte.parseByte(image5);produto.setImagem01(i5);
        
       if(vermelho=="sim"){
           produto.setCorVermelho(1);
       }
       else{
           produto.setCorVermelho(0);
       }
       if(preto=="sim"){
           produto.setCorPreto(1);
       }
       else{
           produto.setCorPreto(0);
       }
       if(azul=="sim"){
           produto.setCorAzul(1);
       }
       else{
           produto.setCorAzul(0);
       }
       if(branco=="sim"){
           produto.setCorBranco(1);
       }
       else{
           produto.setCorBranco(0);
       }
       /**
     * 
     */
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
