<%-- 
    Document   : pagina_escolha_cliente
    Created on : 22/10/2016, 17:03:55
    Author     : ADM
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Escolha de Usuário</title>
        <link rel="stylesheet" href="normalize.css" /> 
        <style>
            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';
        </style>
        <link rel="stylesheet" href="estilos.css" /> 
<%@page import="avicultores.*" %>
<%@page import="avicultores.AvicultorDAO" %>
<%@page import="historico_avicultor.*" %>
<%@page import="historico_avicultor.Historico_AvicultorDAO" %>
<%@page import="eletricista.*" %>
<%@page import="eletricista.EletricistaDAO" %>
<%@page import="historico_eletricista.Historico_EletricistaDAO" %>
<%@page import="historico_eletricista.*" %>

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
                                <li><a href="home_sem_logar.jsp" target="_blank">Home &raquo;</a></li>
                                <li><a href="login_gerenciador.jsp" target="_blank">Gerencia &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div style="margin-left: 210px;" class="linha">
            <section>
                <div class="coluna col5 sidebar">
                    <h3>Eletricista</h3>
                    <img src="img/Eletricista.jpg" alt="imagem eletricista" style="width:335px;"/>
                    <ul class="sem-marcador sem-padding noticias">
                        <li> <a href="login_eletricista.jsp" class="botao">Faça seu Login Eletricista</a></li>
                        <li><u><strong></strong>  </u></li>
                        <li><p></p></li>                                         
                    </ul>
                </div>
                
                <div style="margin-left: auto; width: 400px; height: 440px;" class="coluna col5 sidebar">
                    <h3>Avicultor</h3>
                    <img src="img/avicultor2.jpg" alt="imagem avicultor"/>
                    <ul class="sem-marcador sem-padding noticias">
                        <li> <a href="login_avicultor.jsp" class="botao">Faça seu Login Avicultor</a></li>
                        <li><u><strong></strong>  </u></li>
                        <li><p></p></li>                                         
                    </ul>
                </div>
        </div>            
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Sejam Bem-vindos</h2>
                        <p>Organize seu dia com nossas ferramentas online</p>
                    </section>
                </div>
                <div class="coluna col5">
                    <h3>Esteja sempre conectado conosco</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/tomada.png" alt="imagem tomada">
                            <h4>Esteja sempre atualizado</h4>
                            <p>Mantenha seus dados sempre em dia</p>
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

