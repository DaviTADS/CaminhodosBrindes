/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALUNO
 */
public class AdicionarUsuario extends HttpServlet {

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
            out.println("<title>Servlet AdicionarUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdicionarUsuario at " + request.getContextPath() + "</h1>");
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
        Cliente cliente = new Cliente();
        String nome = request.getParameter("Nome_cliente");
        String email = request.getParameter("Email_cliente");
        String login = request.getParameter("Login_cliente");
        String senha = request.getParameter("Senha_cliente");
        String sobrenome = request.getParameter("Sobrenome_cliente");
        String bairro = request.getParameter("Bairro_cliente");
        String cidade = request.getParameter("Cidade_cliente");
       // String endereco = request.getParameter("Endereco_cliente");
        String cep = request.getParameter("Cep_cliente");
        String telefone = request.getParameter("Telefone_cliente");
        String celular = request.getParameter("Celular_cliente");
        
        cliente.setBairro(bairro);
        cliente.setCelular(celular);
        cliente.setCep(cep);
        cliente.setEmail(email);
        cliente.setLogincliente(login);
        cliente.setNome(nome);
        cliente.setSobrenome(sobrenome);
        cliente.setTelefone(telefone);
        cliente.setSenha(senha);
        cliente.setCidade(cidade);
        //cliente.setEndereco(endereco);
        
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
