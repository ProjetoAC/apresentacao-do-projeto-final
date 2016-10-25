/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletricista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADM
 */
public class Editar_eletricista_Servlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Editar_eletricista_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Editar_eletricista_Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        request.setCharacterEncoding("UTF-8");
         
        int codigo_eletricista = Integer.valueOf(request.getParameter("codigo_eletricista"));
        String nome_eletricista = request.getParameter("nome_eletricista");
        String nome_avicultor = request.getParameter("nome_avicultor");
        String login_usuario_eletricista = request.getParameter("login_usuario_eletricista");
        String email_eletricista = request.getParameter("email_eletricista");
        String telefone_eletricista = request.getParameter("telefone_eletricista");
        String celular_eletricista = request.getParameter("celular_eletricista");
        String senha_eletricista = request.getParameter("senha_eletricista");
        String observacao_eletricista = request.getParameter("observacao_eletricista");
        String nome_cidade = request.getParameter("nome_cidade");
        String estado = request.getParameter("estado");  
        
        
            
        EletricistaDAO.atualizar_eletricista(codigo_eletricista, nome_eletricista, nome_avicultor, login_usuario_eletricista, email_eletricista, telefone_eletricista, celular_eletricista, senha_eletricista, observacao_eletricista, nome_cidade, estado);
                
        response.sendRedirect("listar_eletricista.jsp");
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
