<%-- 
    Document   : pagina_saida
    Created on : 22/10/2016, 17:04:27
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saída</title>
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
                              <li><a href="home_sem_logar.jsp" target="_blank">Home &raquo</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col5 sidebar">
                    <h3>Obrigado por utilizar nossos serviços &raquo;</h3>
                    <img src="img/final1.jpg" alt="imagem de despedida" />
                    <ul class="sem-marcador sem-padding noticias">
                        <li><u><strong>Elefra O.S</strong>  </u></li>
                        <li><p>Cuidando sempre de você</p></li>                                         
                    </ul>
                </div>
                <div align="center">

                    <div class="coluna col7 contato login">
                        <h1>Volte Sempre</h1>
                        <div>
                          <ul class="sem-marcador sem-padding noticias">
                                <li></li>
                                <li></li>
                                <li>Acesse novamente</li>
                                <li></li>
                                <li></li>
                                <li><a href="pagina_escolha_cliente.jsp"  class="botao">Login &raquo;</a></li>
                            </ul>
                        </div>
                        <!--
                        <form action="Login" method="post">
                            <label>Usuário:</label>
                            <input name="login_usuario">
                            <br>
                            <label>Senha:</label>
                            <input name="senha" type="password">
                            <br>
                            <br>
                            <input type="submit" class="botao" value="Entrar &raquo;" />
                        </form> 
                        -->
                    </div>
                </div>
        </div>            
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Encontre</h2>
                        <p>Veja em nosso site tudo o que você precisa</p>
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
