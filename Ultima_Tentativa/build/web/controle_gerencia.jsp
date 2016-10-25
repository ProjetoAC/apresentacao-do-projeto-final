<%-- 
    Document   : controle_gerencia
    Created on : 22/10/2016, 18:44:03
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <!-- 
        Home off-line
        -->
        <link rel="stylesheet" href="normalize.css" /> 
        <style>
            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';
        </style>
        <link rel="stylesheet" href="home.css" /> 
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
                </header>
            </div>
        </div>
        <div class="linha"> 
            <section>
                <div class="coluna col3 sidebar">
                    <img src="img/TRABALHO 2.png" alt="imagem logo"/>
                  
                    <ul class="sem-marcador">
                        
                            <li > <a href="controle_gerencia.jsp" style="color: black;" >Controle Gerência<br> </a> </li>
                            <li > <a href="cadastro_avicultor.jsp" style="color: blue;" >Cadastro Avicultor<br> </a> </li>
                            <li> <a href="cadastro_eletricista.jsp" style="color: chocolate;" >Cadastro Eletricista<br> </a></li>
                            <li> <a href="listar_avicultor.jsp" style="color: dodgerblue;" >Lista Avicultor<br> </a></li>
                            <li> <a href="listar_eletricista.jsp" style="color: orange;" >Lista Eletricista<br> </a></li>
                            <li> <a href="listar_historico_avicultor.jsp" style="color: burlywood;" >Historico Avicultor<br></a></li>
                            <li> <a href="listar_historico_eletricista.jsp" style="color: darkgrey;" >Historico Eletricista<br> </a></li>
                            <li> <a href="login_avicultor.jsp" style="color: coral;" > Login Avicultor<br> </a></li>
                            <li> <a href="login_eletricista.jsp" style="color: hotpink;" > Login Eletricista<br> </a></li>
                            <li> <a href="login_gerenciador.jsp" style="color: indigo;" > Login Gerenciador<br> </a></li>
                            <li> <a href="pagina_escolha_cliente.jsp" style="color: lightseagreen;" >Escolha de Usuarios<br> </a></li>
                            <li> <a href="pendencia_avicultor.jsp" style="color: mediumorchid;" >Pendencia Avicultor<br> </a></li>
                            <li> <a href="pendencia_eletricista.jsp" style="color: mediumturquoise;" >Pendencia Eletricista<br> </a></li>
                            <li> <a href="pagina_saida.jsp" style="color: red;" >Sair<br> </a></li>
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






<!--

  <ol>
                            <li> <a href="cadastro_avicultor.jsp">Cadastro Avicultor<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a> </li>
                            <li> <a href="cadastro_eletricista.jsp">Cadastro Eletricista<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="listar_avicultor.jsp">Lista Avicultor<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="listar_eletricista.jsp">Lista Eletricista<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="listar_historico_avicultor.jsp">Historico Avicultor<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="listar_historico_eletricista.jsp">Historico Eletricista<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="login_avicultor.jsp"> Login Avicultor<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="login_eletricista.jsp"> Login Eletricista<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="login_gerenciador.jsp"> Login Gerenciador<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="pagina_escolha_cliente.jsp">Escolha de Usuarios<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                            <li> <a href="pagina_saida.jsp">Sair<br><img src="img/gerente1.jpg" alt="imagem gerente1" /> </a></li>
                        </ol>

-->