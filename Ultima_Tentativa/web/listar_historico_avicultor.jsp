<%-- 
    Document   : listar_historico_avicultor
    Created on : 22/10/2016, 17:00:46
    Author     : ADM
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="avicultores.*" %>
<%@page import="avicultores.AvicultorDAO" %>
<%@page import="historico_avicultor.*" %>
<%@page import="historico_avicultor.Historico_AvicultorDAO" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Histórico Avicultores</title>
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
                                <li><a href="index.jsp">Home &raquo;</a></li>
                                <li><a href="pendencia_avicultor.jsp">Pendência Avicultor &raquo;</a></li>
                                <li><a href="pagina_saida.jsp" target="_blank">Sair &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div style="width:200px;" class="coluna col5 sidebar">
                    <h3>Histórico</h3>
                    <img src="img/fibra otica.jpg" alt="imagem luzes" />
                    <ul class="sem-marcador sem-padding noticias">
                        <li><u><strong>Serviços</strong></u></li>
                        <li><strong>Pendentes</strong></li>                                   
                    </ul>
                </div>
            </section>
            <section>

                <div align="center" class="coluna col7 contato">
                    <h2>Histórico</h2>
                    <table border="1">
                        <thead style="color:#fff; background: #800080    ;" >
                            <tr>
                                <td>codigo</td>
                                <td>Eletricista</td>
                                <td>Pendentes</td>
                                <td>Data Início</td>
                                <td>Data Término</td>
                                <td>Trabalhos Concluidos</td>
                                <td>Observacao</td>
                                <td>Editar</td>
                                <td>Excluir</td>
                            </tr>
                        </thead>
                        <tbody  style="color:#000000; background: #B0C4DE">

                            <% for (Historico_Avicultor historico : Historico_AvicultorDAO.listar_historico_avicultor()) {%>  
                            <tr> 
                                <td> <%= historico.codigo_historico_avicultor%> </td>
                                <td> <%= historico.nome_eletricista%> </td>
                                <td> <%= historico.pendente_avicultor%> </td>
                          
                                <td> <%= historico.data_inicio%> </td>
                                <td> <%= historico.data_termino%> </td> 


                                <td> <%= historico.tb_concluido%>    </td>
                                <td> <%= historico.observacao_avicultor%>      </td>

                                <td> <a href="atualizar_historico_avicultor.jsp?codigo_historico_avicultor=<%=historico.codigo_historico_avicultor%> " style="color:blue;"> Editar </a> </td>
                                <td> <a href="Excluir_Historico_Avicultor_Servlet?codigo_historico_avicultor=<%=historico.codigo_historico_avicultor%>" style="color:red;"> Excluir </a> </td>

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
        </div>
    </body>
</html>

