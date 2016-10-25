<%-- 
    Document   : editar_avicultor
    Created on : 22/10/2016, 22:54:36
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="avicultores.*" %>
<%@page import="avicultores.AvicultorDAO" %>
<%@page import="historico_avicultor.*" %>
<%@page import="historico_avicultor.Historico_AvicultorDAO" %>
<%@page import="cidades.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Avicultor</title>
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
                        <h1 style="color: #fff;" class="logo">Elefra O.S</h1>
                    </div>
                    <div class="coluna col8">
                        <nav>
                            <ul class="menu inline sem-marcador">
                                <!--<li> <a href="cadastro_principal.jsp" target="_blank">Gerenciador &raquo;</a></li> -->
                                <li><a href="index.jsp">Home &raquo;</a></li>
                                <li> <a href="listar_avicultor.jsp">Avicultores &raquo;</a></li>
                                <li> <a href="login_avicultor.jsp">Login &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <section>
            <div class="coluna col5 sidebar">

                <h2><em>Empresa Elefra</em></h2>
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

            <div  class="coluna col7 contato">

                <% int codigo_avicultor = Integer.valueOf(request.getParameter("codigo_avicultor"));
                    Avicultor avicultor = AvicultorDAO.buscar_avicultor(codigo_avicultor);
                %>

                <form  action="Editar_avicultor_Servlet" method="post">
                    <br>
                    <br>
                    <label>Código:</label>
                    <input name="codigo_avicultor" value="<%= avicultor.codigo_avicultor%>">
                    <br>
                    <label> Nome: </label>
                    <input name="nome_avicultor" value="<%= avicultor.nome_avicultor%>">
                    <br>
                    <label> Eletricista: </label>
                    <input name="nome_eletricista" value="<%= avicultor.nome_eletricista%>">
                    <br>
                    <label> Login/Usuário </label>
                    <input name="login_usuario_avicultor" value="<%= avicultor.login_usuario_avicultor%>">
                    <br>
                    <label>E-mail:</label>
                    <input name="email_avicultor" value="<%= avicultor.email_avicultor%>"> 
                    <br>
                    <label>Telefone Residêncial:</label>
                    <input name="telefone_avicultor" value="<%= avicultor.telefone_avicultor%>">
                    <br>
                    <label>Telefone Celular:</label>
                    <input name="celular_avicultor" value="<%= avicultor.celular_avicultor%>">
                    <br>
                    <label>Senha:</label>
                    <input name="senha_avicultor" type="password" value="<%= avicultor.senha_avicultor%>">
                    <br>
                    <label>Cidade:</label>
                    <input  name="nome_cidade" value="<%= avicultor.nome_cidade%>">
                    <br>
                    <br>
                    <!--
                    <select name="codigo_cidade">
                       <1% for (Cidade cidade : CidadeDAO.listar_cidade()) {%>
                            <option value="<1%=cidade.codigo_cidade%>">
                                <1%=cidade.nome_cidade%>
                            </option>
                            <1% }%>
                        </select>
                    -->                    

                    <label>Estado:</label>
                    <select name="estado">
                        <option value="AC">AC</option>
                        <option value="AL">AL</option>
                        <option value="AP">AP</option>
                        <option value="AM">AM</option>
                        <option value="BA">BA</option>
                        <option value="CE">CE</option>
                        <option value="DF">DF</option>
                        <option value="ES">ES</option>
                        <option value="GO">GO</option>
                        <option value="MA">MA</option>
                        <option value="MT">MT</option>
                        <option value="MS">MS</option>
                        <option value="MG">MG</option>
                        <option value="PA">PA</option>
                        <option value="PB">PB</option>
                        <option value="PR">PR</option>
                        <option value="PE">PE</option>
                        <option value="PI">PI</option>
                        <option value="RJ">RJ</option>
                        <option value="RN">RN</option>
                        <option value="RS">RS</option>
                        <option value="RO">RO</option>
                        <option value="RR">RR</option>
                        <option value="SC">SC</option>
                        <option value="SP">SP</option>
                        <option value="SE">SE</option>
                        <option value="TO">TO</option>   
                    </select>

                    <br>
                    <br>
                    <label>Observação:</label>                       
                    <textarea  name="observacao_avicultor"></textarea>
                    <br>
                    <input type="submit" class="botao"  value="Cadastrar">
                    <br>
                    <br>
                </form>
            </div>
        </section>
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Atenção:</h2>
                        <p>Analise todas as informações para Atualizar o cadastro</p>
                    </section>
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
                                <!-- <a href="">leia mais &raquo;</a></p> -->
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
