/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import Model.Login;
import com.mycompany.caminhodosbrindes.Administrador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nome
 */
public class LoginServlet extends HttpServlet {
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
           
        
    }
  
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
           
        
       response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
            
              String usuario =(String) request.getParameter("usuario");
              String senha = (String) request.getParameter("senha");
                if(usuario.equals("Administrador_cdb")&& senha.equals("3008")){
                     HttpSession sessao = request.getSession();
            sessao.setAttribute("login", usuario);
            sessao.setAttribute("permissao", "Usuario");

                     response.sendRedirect("telaADM.jsp");  }
            
                
            
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       processRequest(request, response);
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
