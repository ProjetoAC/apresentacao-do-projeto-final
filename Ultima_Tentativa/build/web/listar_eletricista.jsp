<%-- 
    Document   : listar_eletricista
    Created on : 22/10/2016, 17:00:06
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="eletricista.*" %>
<%@page import="eletricista.EletricistaDAO" %>
<%@page import="historico_eletricista.Historico_EletricistaDAO" %>
<%@page import="historico_eletricista.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Eletricistas</title>
        <link rel="stylesheet" href="normalize.css" /> 
        <style>
            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';
        </style>
        <link rel="stylesheet" href="estilos.css" /> 
    </head>
    <body>
        <div class="header">
            <div class="linha">
                <header>
                    <div class="coluna col4">
                        <h1 class="logo">Elefra O.S</h1>
                    </div>
                    <div class="coluna col8">
                        <nav>
                            <ul class="menu inline sem-marcador">
                                <li><a href="cadastro_eletricista.jsp">Cadastro Eletricista&raquo;</a></li>
                                <li><a href="pagina_escolha_cliente.jsp">Login &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <section>
            
          <!--  <div style="margin-left: 150px;" align="center" class="coluna col7 contato"> -->
            <div style="margin:auto;" align="center" class="coluna col7 contato">
                <h2 align="center;">Lista de Eletricistas</h2>
                <table  border="1">
                  <thead style="color:#fff; background: #800080    ;" >
                        <tr>
                            <td>codigo</td>
                            <td>nome</td>
                            <td>avicultor</td>
                            <td>Login/Usuário</td>
                            <td>email</td>
                            <td>telefone</td>
                            <td>celular</td>
                            <td>senha</td>
                            <td>observacao</td>
                            <td>cidade</td>
                            <td>estado</td>
                            <td>editar</td>
                            <td>excluir</td>
                        </tr>
                    </thead>
                    <tbody  style="color:#000000; background: #B0C4DE">
                    
                        <% for (Eletricista eletricista : EletricistaDAO.listar_eletricistas()) {%>  
                        <tr>
                            <td> <%= eletricista.codigo_eletricista%> </td>
                            <td> <%= eletricista.nome_eletricista%> </td>
                            <td> <%= eletricista.nome_avicultor%> </td>
                            <td> <%= eletricista.login_usuario_eletricista%> </td>
                            <td> <%= eletricista.email_eletricista%> </td>
                            <td> <%= eletricista.telefone_eletricista%> </td>  
                            <td> <%= eletricista.celular_eletricista%> </td>
                            <td> <%= eletricista.senha_eletricista%> </td>
                            <td> <%= eletricista.observacao_eletricista%> </td> 
                            <td> <%= eletricista.nome_cidade%> </td>   <!--cliente.cidade.nome -->
                            <td> <%= eletricista.estado%> </td>   <!--cliente.cidade.estado -->

                            <td> <a href="editar_eletricista.jsp?codigo_eletricista=<%=eletricista.codigo_eletricista%>" style="color:blue;"> Editar </a> </td>
                            <td> <a href="Excluir_eletricista_Servlet?codigo_eletricista=<%=eletricista.codigo_eletricista%>" style="color:red;"> Excluir </a> </td>
                        </tr>
                        
                        <% }%>
                    </tbody>
                </table>  
            </div>
        </section>
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Pendências</h2>
                        <p>Certifique que todos os trabalhos foram bem feitos</p>
                        <p>caso não esteja satisfeito entre em contato com o nosso</p>
                        <p>telefone de contato (99)9999-9999</p>
                    </section>
                </div>
                <div class="coluna col5">
                    <h3>Histórico</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/pessoas2.jpg" alt="imagem pessoas " />
                            <h4>Acompanhe todo o histórico de serviços</h4>
                            <p>Estará sempre atualizado com as ultimas informações
                                para sempre cumprirmos</p>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="footer">
                <div class="linha">
                    <footer>
                        <div class="coluna col12">
                            <span>&copy; 2016 Elefra O.S gerenciador de tarefas </span>
                        </div>
                    </footer>
                </div>
            </div>
        </div>
</body>
</html>
