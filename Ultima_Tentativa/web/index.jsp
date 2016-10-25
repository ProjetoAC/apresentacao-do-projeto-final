<%-- 
    Document   : index
    Created on : 12/10/2016, 21:54:07
    Author     : ADM
--%>
<!--
<1%@page contentType="text/html" pageEncoding="UTF-8"%>
<1%@page import="teste.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste</title>
    </head>
    <body>
        <!-- 
        A parte do header está sendo importado da pagina include.jsp 
        utilizando os metodos de Include.
        
        qualquer pagina que você queira que apareça essa mensagem pode utilizar 
        o include 
        <1%@include file="include.jsp" %>
        
        -->
        <!--
        <header>
            <1%@include file="include.jsp" %>
        </header>
        <div align="center">
            <form action="Salvar_Teste_Servlet" method="post">
                <label>Código Teste:</label>
                <input name="codigo_teste">
                <br>
                <label>Nome Teste:</label>
                <input name="nome_teste">
                <br>
                <input type="submit" value="testar">
            </form>
        </div>
    </body>
</html>
-->



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Avicultor</title>
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
                               <!-- <li> <a href="index.jsp" target="_blank">Home &raquo;</a></li> -->
                               <!--<li> <a href="pagina_escolha_cliente.jsp">Troca de Usuário &raquo;</a></li> -->
                               <li> <a href="pendencia_avicultor.jsp">Pendências &raquo;</a></li>
                                <li> <a href="listar_historico_avicultor.jsp">Histórico &raquo;</a></li>
                                <li><a href="pagina_saida.jsp" target="_blank">Sair &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col3 sidebar">
                    <img src="img/TRABALHO 2.png" alt="imagem logo"/>
                    <ul class="sem-marcador sem-padding noticias">
                    <li><u><strong>Elefra O.S</strong>  </u></li>
                    <li><strong>Endereço:</strong></li>
                    <li>Rua das Camélias, 123</li>
                    <li>Bairro das Flores</li>
                    <li>Bela Flor - Pr</li>                                           
                </ul>
                <h3>Contato Direto</h3>
                <ul class="sem-marcador sem-padding noticias">
                    <li>Fone: <strong>(46) 9999-9999</strong></li>
                    <li>e-mail: <strong>elefra@elefra.com</strong></li>
                    <li>Facebook: <strong>elefra.facebook</strong></li>                                           
                </ul>
                </div>
                <div class="coluna col9">
                    <h2><em>Agilidade em suas tarefas conte conosco da Elefra</em></h2>
                    <img src="img/ELETRICA.jpg" alt="imagem" />
                    <p></p>
                 <!--   <a href="clientes.html" class="botao">Verificar o que pode ser feito aqui &raquo;</a> -->
                </div>
            </section>
        </div>
        <div class="conteudo-extra">
            <div class="linha">
                <section>
                    <h2>Avisos</h2>
                    <p>Neste site você pode analisar o quando pode ser útil para o auxílio de todo eletricista</p>
                    <h2>O que você irá encontrar no Site ?</h2>
                    <p>Tendo o melhor assistente para ajudar no que for preciso na organização das suas tarefas</p>
                    <h2>Temas</h2>
                    <p>Tendo como o propósito atender a sua necessidade de continuas melhoras no ramo de atuação</p>
                </section>
            </div>
            <div class="coluna col5">
                <h3>Noticias</h3>
                <ul class="sem-marcador sem-padding noticias">
                    <li>
                        <img src="img/imagem lanterna.jpg" alt="imagem lanterna" />
                        <h4>Acompanhe as ultimas tendências</h4>
                        <p>Surgindo no mercado um organizador de tarefas para eletricistas que 
                            tenham como foco a manutenção de aviários na região sudoeste do Paraná.
                            Para ser mais preciso no munícipio de Dois Vizinhos, onde, se concentram as maiores empresas 
                            do ramo de aves da américa latina.
                            <a href="">leia mais &raquo;</a></p>
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
    </body>
</html>

