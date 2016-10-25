<%-- 
    Document   : cadastro_avicultor
    Created on : 22/10/2016, 16:53:44
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
        <title>Cadastro Avicultor</title>
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
                                <li><a href="pagina_escolha_cliente.jsp" target="_blank" >Login &raquo;</a></li>
                                <li><a href="index.jsp" target="_blank" >Home &raquo;</a></li>
                                <li><a href="listar_historico_avicultor.jsp" target="_blank" >Histórico &raquo;</a></li>
                                <li><a href="listar_avicultor.jsp" target="_blank" >Avicultor &raquo;</a></li>
                                <li><a href="pendencia_avicultor.jsp" target="_blank" >Pendência &raquo;</a></li>

                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <section>
            <div class="coluna col5 sidebar">
                <h3>Cadastro de Avicultor</h3>
                <img src="img/pessoas1.jpeg" alt="imagem de pessoas" />
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
                <h2>Preencha o formulário:</h2>
                <h4 style="color:#FF0000">Cadastro Avicultor</h4>
                <form action="Salvar_avicultor_Servlet" method="post"> 
                    <label>Codigo:</label>
                    <input placeholder="verificar codigo" name="codigo_avicultor">
                    <label>Nome:</label>
                    <input name="nome_avicultor">
                    <label>Eletricista:</label>
                    <input name="nome_eletricista">
                    <label>E-mail:</label>
                    <input name="email_avicultor">
                    <label>Telefone Residêncial:</label>
                    <input name="telefone_avicultor">
                    <label>Telefone Celular:</label>
                    <input name="celular_avicultor">
                    <label>Login/Usuário</label>
                    <input placeholder="escreva seu nome de login/usuário até 15 letras" name="login_usuario_avicultor">
                    <label>Senha:</label>
                    <input name="senha_avicultor" type="password" >
                    <label>Cidade:</label>
                    <input name="nome_cidade">
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
                    <label>Observação:</label>                       
                    <textarea  name="observacao_avicultor" ></textarea>
                    <input type="submit" class="botao" value="Salvar &raquo;" />
                </form> 
            </div>
        </section>
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Atenção:</h2>
                        <p>Analise todas as informações para efetuar o cadastro</p>
                    </section>
                </div>
                <div class="coluna col5">
                    <h3>Seja um novo cliente</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/pessoas2.jpg" alt="imagem pessoas ">
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
