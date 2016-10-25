<%-- 
    Document   : listar_avicultor
    Created on : 22/10/2016, 16:59:30
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="avicultores.*" %>
<%@page import="avicultores.AvicultorDAO" %>
<%@page import="historico_avicultor.*" %>
<%@page import="historico_avicultor.Historico_AvicultorDAO" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Avicultores</title>
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
                                <li><a href="cadastro_avicultor.jsp">Cadastrar Avicultor &raquo;</a></li>
                                <li><a href="pagina_escolha_cliente.jsp">Login &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <section>
            
          <!--  <div style="margin-left: 150px;" align="center" class="coluna col7 contato"> -->
            <div style="margin:auto; margin-left: 100px;" align="center" class="coluna col7 contato">
                <h2 align="center;">Lista de Avicultores</h2>
                <table  border="1">
                    <thead style="color:#fff; background: #800080    ;" >
                        <tr>
                            <td>codigo</td>
                            <td>nome</td>
                            <td>eletricista</td>
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
                    
                        <% for (Avicultor avicultor : AvicultorDAO.listar_avicultores()) {%>  
                      
                        <tr>
                            <td> <%= avicultor.codigo_avicultor%> </td>
                            <td> <%= avicultor.nome_avicultor%> </td>
                            <td> <%= avicultor.nome_eletricista%> </td>
                            <td> <%= avicultor.login_usuario_avicultor%> </td>
                            <td> <%= avicultor.email_avicultor%> </td>
                            <td> <%= avicultor.telefone_avicultor%> </td>  
                            <td> <%= avicultor.celular_avicultor%> </td>
                            <td> <%= avicultor.senha_avicultor%> </td>
                            <td> <%= avicultor.observacao_avicultor%> </td> 
                            <td> <%= avicultor.nome_cidade%> </td> 
                            <td> <%= avicultor.estado%> </td>  

                            <td> <a href="editar_avicultor.jsp?codigo_avicultor=<%=avicultor.codigo_avicultor%>" style="color:blue;"> Editar </a> </td>
                            <td> <a href="Excluir_avicultor_Servlet?codigo_avicultor=<%=avicultor.codigo_avicultor%>" style="color:red;"> Excluir </a> </td>
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
