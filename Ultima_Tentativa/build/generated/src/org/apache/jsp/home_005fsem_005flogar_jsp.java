package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import avicultores.*;
import avicultores.AvicultorDAO;
import historico_avicultor.*;
import historico_avicultor.Historico_AvicultorDAO;
import eletricista.*;
import eletricista.EletricistaDAO;
import historico_eletricista.Historico_EletricistaDAO;
import historico_eletricista.*;

public final class home_005fsem_005flogar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <!-- \n");
      out.write("        Home off-line\n");
      out.write("        -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"normalize.css\" /> \n");
      out.write("        <style>\n");
      out.write("            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\" /> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"coluna col4\">\n");
      out.write("                        <h1 class=\"logo\">Elefra O.S</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"coluna col8\">\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"menu inline sem-marcador\">\n");
      out.write("                                <li> <a href=\"home_sem_logar.jsp\">Home &raquo;</a></li>\n");
      out.write("                                <li> <a href=\"pagina_escolha_cliente.jsp\" target=\"_blank\">Login &raquo;</a></li>\n");
      out.write("                                <li> <a href=\"login_gerenciador.jsp\" target=\"_blank\">Gerenciador &raquo;</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"linha\"> \n");
      out.write("            <section>\n");
      out.write("                <div class=\"coluna col3 sidebar\">\n");
      out.write("                    <img src=\"img/TRABALHO 2.png\" alt=\"imagem logo\"/>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                    <li><u><strong>Elefra O.S</strong>  </u></li>\n");
      out.write("                    <li><strong>Endereço:</strong></li>\n");
      out.write("                    <li>Rua das Camélias, 123</li>\n");
      out.write("                    <li>Bairro das Flores</li>\n");
      out.write("                    <li>Bela Flor - Pr</li>                                           \n");
      out.write("                </ul>\n");
      out.write("                <h3>Contato Direto</h3>\n");
      out.write("                <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                    <li>Fone: <strong>(46) 9999-9999</strong></li>\n");
      out.write("                    <li>e-mail: <strong>elefra@elefra.com</strong></li>\n");
      out.write("                    <li>Facebook: <strong>elefra.facebook</strong></li>                                           \n");
      out.write("                </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col9\">\n");
      out.write("                    <h2><em>Agilidade em suas tarefas conte conosco da Elefra</em></h2>\n");
      out.write("                    <img src=\"img/ELETRICA.jpg\" alt=\"imagem\" />\n");
      out.write("                    <p></p>\n");
      out.write("                 <!--   <a href=\"clientes.html\" class=\"botao\">Verificar o que pode ser feito aqui &raquo;</a> -->\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"conteudo-extra\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <section>\n");
      out.write("                    <h2>Avisos</h2>\n");
      out.write("                    <p>Neste site você pode analisar o quando pode ser útil para o auxílio de todo eletricista</p>\n");
      out.write("                    <h2>O que você irá encontrar no Site ?</h2>\n");
      out.write("                    <p>Tendo o melhor assistente para ajudar no que for preciso na organização das suas tarefas</p>\n");
      out.write("                    <h2>Temas</h2>\n");
      out.write("                    <p>Tendo como o propósito atender a sua necessidade de continuas melhoras no ramo de atuação</p>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"coluna col5\">\n");
      out.write("                <h3>Noticias</h3>\n");
      out.write("                <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                    <li>\n");
      out.write("                        <img src=\"img/imagem lanterna.jpg\" alt=\"imagem lanterna\" />\n");
      out.write("                        <h4>Acompanhe as ultimas tendências</h4>\n");
      out.write("                        <p>Surgindo no mercado um organizador de tarefas para eletricistas que \n");
      out.write("                            tenham como foco a manutenção de aviários na região sudoeste do Paraná.\n");
      out.write("                            Para ser mais preciso no munícipio de Dois Vizinhos, onde, se concentram as maiores empresas \n");
      out.write("                            do ramo de aves da américa latina.\n");
      out.write("                            <a href=\"\">leia mais &raquo;</a></p>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <footer>\n");
      out.write("                    <div class=\"coluna col12\">\n");
      out.write("                        <span>&copy; 2016 Elefra O.S gerenciador de tarefas </span>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
