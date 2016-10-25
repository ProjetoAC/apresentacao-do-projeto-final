<%-- 
    Document   : pendencia_eletricista
    Created on : 22/10/2016, 18:04:43
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="avicultores.*" %>
<%@page import="avicultores.AvicultorDAO" %>
<%@page import="historico_avicultor.*" %>
<%@page import="historico_avicultor.Historico_AvicultorDAO" %>
<%@page import="eletricista.*" %>
<%@page import="eletricista.EletricistaDAO" %>
<%@page import="historico_eletricista.Historico_EletricistaDAO" %>
<%@page import="historico_eletricista.*" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pendência Eletricista</title>
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
                                <li><a href="index_1.jsp">Home &raquo;</a></li>
                                <li><a href="listar_historico_eletricista.jsp">Histórico &raquo;</a></li>
                                <li><a href="listar_historico_avicultor_para_o_eletricista.jsp">Solicitação Serviço &raquo;</a></li>
                                <li><a href="pagina_saida.jsp" target="_blank">Sair &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col5 sidebar">
                    <h3>Seleção de Pendência</h3>
                    <img src="img/clique5.jpg" alt="imagem check" />
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
                <div class="coluna col7 contato">
                    <h2>Escolha a opção de Serviço:</h2>
                    <h4 style="color:#FF0000">Pendência Eletricista</h4>


                    <!-- <form action="Salvar_Pendencia_Servlet" method="post">  -->
                    <form action="Salvar_Historico_Eletricista_Servlet" method="post">
                        <label>Codigo do Serviço:</label>
                        <input placeholder="verificar codigo" name="codigo_historico_eletricista">
                        <br> 
                        <label>Avicultor:</label>
                        <input name="nome_avicultor"> 
                        <br>
                        <!--   teste para buscar o nome do avicultor 
                        <label>Avicultor:</label>
                        <select name="codigo_avicultor">  
                            < 1% for (Avicultor avicultores : AvicultorDAO.listar_avicultores()) {%>   
                            <option value="< 1%=avicultores.codigo_avicultor%>">< 1%=avicultores.nome_avicultor%></option>

                            < 1% }%>
                        </select>
                        <br>
                        -->
                        <br>
                        <label>Descrição do Serviço:</label>
                        <select name="pendente_eletricista">
                            <option value=""></option>
                            <option value="troca de Lampada">Troca de Lampada</option>
                            <option value="Reparo no Comedouro">Reparo no Comedouro</option>
                            <option value="Reparo na Ventilacao">Reparo na Ventilacao</option>
                            <option value="Reparo no Bebedouros">Reparo no Bebedouros</option>
                            <option value="Conserto no Aquecedor">Conserto no Aquecedor</option>
                            <option value="Regulagem da Umidade">Regulagem da Umidade</option>
                        </select>  
                        <br>
                        <br>
                        <br>
                        <label>Data da Solicitação do Serviço:</label>
                        <input type="date" name="data_inicio" style="width:150px;">
                        <label>(Dia-Mês-Ano)</label>
                        <br>
                        <label>Data de Conlusão do Serviço:</label>
                        <input  type="date" name="data_termino"  style="width:150px;">
                        <label>(Dia-Mês-Ano)</label>
                        <br>
                        <label>Trabalhos Concluidos:</label>
                        <select name="tb_concluido">
                            <option value="Sim">Sim</option>
                            <option value="Nao">Nao</option>
                        </select>
                        <br>
                        <br>
                        <label>Observação:</label>
                        <textarea  name="observacao_eletricista" ></textarea>
                        <input type="submit" class="botao" value="Salvar &raquo;" />
                    </form> 
                </div>
            </section>
        </div>
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Atenção:</h2>
                        <p>Analise todas as informações para não efetuar o cadastro errado</p>
                    </section>
                </div>
                <div class="coluna col5">
                    <h3>Seja um novo cliente</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/clique.png" alt="imagem pessoas ">
                            <h4>Venha fazer parte de nossos clientes</h4>
                            <p>Teremos sempre o privilégio de termos conosco</p>
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
