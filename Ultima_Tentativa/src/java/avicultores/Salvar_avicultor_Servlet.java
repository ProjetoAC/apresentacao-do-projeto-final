/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avicultores;

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
public class Salvar_avicultor_Servlet extends HttpServlet {

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
            out.println("<title>Servlet Salvar_avicultor_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Salvar_avicultor_Servlet at " + request.getContextPath() + "</h1>");
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

           if ( request.getParameter("codigo_avicultor").isEmpty()
                || request.getParameter("nome_avicultor").isEmpty()
                || request.getParameter("login_usuario_avicultor").isEmpty()
                || request.getParameter("email_avicultor").isEmpty()                   
                ) {
            request.setAttribute("erro",
                    "Preencha todos os campos corretamente.");
            request.getRequestDispatcher(
                    "cadastro_avicultor.jsp")
                    .forward(request, response);
        } else {

         int codigo_avicultor = Integer.valueOf(request.getParameter("codigo_avicultor"));
        String nome_avicultor = request.getParameter("nome_avicultor");
        String nome_eletricista = request.getParameter("nome_eletricista");
        String email_avicultor = request.getParameter("email_avicultor");
        String telefone_avicultor = request.getParameter("telefone_avicultor");
        String celular_avicultor = request.getParameter("celular_avicultor");
        String senha_avicultor = request.getParameter("senha_avicultor");
        String observacao_avicultor = request.getParameter("observacao_avicultor");
        String cidade = request.getParameter("cidade");
        String nome_cidade = request.getParameter("nome_cidade");
        String estado = request.getParameter("estado");  
        String login_usuario_avicultor = request.getParameter("login_usuario_avicultor");

           // ClienteDAO.salvar(codigo_cliente, nome_cliente, login_usuario, cliente, email, telefone, celular, senha, observacao, nome_cidade, estado);

        AvicultorDAO.salvar_avicultor(codigo_avicultor, nome_avicultor, nome_eletricista, email_avicultor, telefone_avicultor, celular_avicultor, senha_avicultor, observacao_avicultor, cidade, nome_cidade, estado, login_usuario_avicultor);

           
            //serve para deixar mensagem é utilizado para aparecer na mesma pagina
            /*
            request.setAttribute("sucesso",
                    "Cadastro realizado com sucesso!");
            request.getRequestDispatcher(
                 //   "listar_cliente.jsp") 
                    .forward(request, response);
             */
        response.sendRedirect("listar_avicultor.jsp");
        }
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
