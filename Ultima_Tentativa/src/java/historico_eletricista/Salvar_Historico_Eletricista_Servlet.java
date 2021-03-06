/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historico_eletricista;

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
public class Salvar_Historico_Eletricista_Servlet extends HttpServlet {

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
            out.println("<title>Servlet Salvar_Historico_Eletricista_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Salvar_Historico_Eletricista_Servlet at " + request.getContextPath() + "</h1>");
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
       
        if (request.getParameter("codigo_historico_eletricista").isEmpty()
                || request.getParameter("pendente_eletricista").isEmpty()
                || request.getParameter("data_inicio").isEmpty()
                //|| request.getParameter("data_termino").isEmpty()
                || request.getParameter("tb_concluido").isEmpty()
              //  || request.getParameter("observacao_eletricista").isEmpty()
                
                ) {
            request.setAttribute("erro",
                    "Preencha todos os campos corretamente.");
            request.getRequestDispatcher(
                    "pendencia_eletricista.jsp")
                    .forward(request, response);
        } else {    

            int codigo_historico_eletricista = Integer.valueOf(request.getParameter("codigo_historico_eletricista"));
            String nome_avicultor = request.getParameter("nome_avicultor");
            String pendente_eletricista = request.getParameter("pendente_eletricista");
            String data_inicio = request.getParameter("data_inicio");
            String data_termino = request.getParameter("data_termino");
            String tb_concluido = request.getParameter("tb_concluido");
            String observacao_eletricista = request.getParameter("observacao_eletricista");    

            Historico_EletricistaDAO.salvar_historico_eletricista(codigo_historico_eletricista, nome_avicultor, pendente_eletricista, data_inicio, data_termino, tb_concluido, observacao_eletricista);

            //serve para deixar mensagem é utilizado para aparecer na mesma pagina
            /*
            request.setAttribute("sucesso",
                    "Cadastro realizado com sucesso!");
            request.getRequestDispatcher(
                 //   "listar_cliente.jsp") 
                    .forward(request, response);
             */
            response.sendRedirect("listar_historico_eletricista.jsp");
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
