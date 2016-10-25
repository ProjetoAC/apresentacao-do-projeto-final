/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avicultores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class AvicultorDAO {
    
       
      public static void salvar_avicultor(int codigo_avicultor, String nome_avicultor, String nome_eletricista, String login_usuario_avicultor, String email_avicultor, String telefone_avicultor, String celular_avicultor, String senha_avicultor, String observacao_avicultor, String cidade, String nome_cidade, String estado) {

        try {
            Class.forName("org.postgresql.Driver");
          
            // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
     
             Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
          
           PreparedStatement avic = conexao.prepareStatement("insert into avicultores (codigo_avicultor, nome_avicultor, nome_eletricista, email_avicultor, telefone_avicultor, celular_avicultor, senha_avicultor, observacao_avicultor, cidade, nome_cidade, estado, login_usuario_avicultor) values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

            // clt = cliente  
            avic.setInt(1, codigo_avicultor);
            avic.setString(2, nome_avicultor);
            avic.setString(3, nome_eletricista);
            avic.setString(4,login_usuario_avicultor);
            avic.setString(5, email_avicultor);
            avic.setString(6, telefone_avicultor);
            avic.setString(7, celular_avicultor);
            avic.setString(8, senha_avicultor);
            avic.setString(9, observacao_avicultor);
            avic.setString(10, cidade);
            avic.setString(11, nome_cidade);
            avic.setString(12, estado);

            avic.executeUpdate();
            avic.close();
            conexao.close();
                       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static ArrayList<Avicultor> listar_avicultores() {
        ArrayList<Avicultor> avicultores = new ArrayList<Avicultor>();

        try {
            Class.forName("org.postgresql.Driver");
            
           // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
                     
            PreparedStatement avic = conexao.prepareStatement("select * from avicultores");

            ResultSet rs = avic.executeQuery();

            while (rs.next()) {
                
                Avicultor avicultor = new Avicultor();
                
                avicultor.codigo_avicultor = rs.getInt("codigo_avicultor");
                avicultor.nome_avicultor = rs.getString("nome_avicultor");
                avicultor.nome_eletricista = rs.getString("nome_eletricista");
                avicultor.login_usuario_avicultor = rs.getString("login_usuario_avicultor");
                avicultor.email_avicultor = rs.getString("email_avicultor");
                avicultor.telefone_avicultor = rs.getString("telefone_avicultor");
                avicultor.celular_avicultor = rs.getString("celular_avicultor");
                avicultor.senha_avicultor = rs.getString("senha_avicultor");
                avicultor.observacao_avicultor = rs.getString("observacao_avicultor");
                //avicultor.cidade = rs.getString("cidade");
                avicultor.nome_cidade = rs.getString("nome_cidade");
                avicultor.estado = rs.getString("estado");

                //Cidade cidade = new Cidade();
               // cidade.nome_cidade = rs.getString("nomeCidade");
               // cidade.estado = rs.getString("uf");

               // cliente.cidade = cidade.nome_cidade;
                //cliente.cidade = cidade;

                avicultores.add(avicultor);
            }
            rs.close();
            avic.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return avicultores;
    }
    
    public static Avicultor login_avicultor(String login_usuario_avicultor, String senha_avicultor) {

        try {
            Class.forName("org.postgresql.Driver");
           
           // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

           
            PreparedStatement avic = conexao.prepareStatement("select * from avicultores where login_usuario_avicultor = ? and senha_avicultor = ?");

            avic.setString(1, login_usuario_avicultor);
            avic.setString(2, senha_avicultor);

            ResultSet rs = avic.executeQuery();

            if (rs.next()) {
                Avicultor avicultor = new Avicultor();
                avicultor.login_usuario_avicultor = rs.getString("login_usuario_avicultor");
                avicultor.senha_avicultor = rs.getString("senha_avicultor");
                // cliente.email = rs.getString("email");

                rs.close();
                avic.close();
                conexao.close();

                return avicultor;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Avicultor buscar_avicultor(int codigo_avicultor) {

        try {

            Class.forName("org.postgresql.Driver");

            try {
                
            // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
          
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
               
               PreparedStatement avic = conexao.prepareStatement("select * from avicultores where codigo_avicultor = ?");

                avic.setInt(1, codigo_avicultor);
                ResultSet rs = avic.executeQuery();

                rs.next();

                Avicultor avicultor = new Avicultor();
                
                avicultor.codigo_avicultor = rs.getInt("codigo_avicultor");
                avicultor.nome_avicultor = rs.getString("nome_avicultor");
                avicultor.nome_eletricista = rs.getString("nome_eletricista");
                avicultor.login_usuario_avicultor = rs.getString("login_usuario_avicultor");
                avicultor.email_avicultor = rs.getString("email_avicultor");
                avicultor.telefone_avicultor = rs.getString("telefone_avicultor");
                avicultor.celular_avicultor = rs.getString("celular_avicultor");
                avicultor.senha_avicultor = rs.getString("senha_avicultor");
                avicultor.observacao_avicultor = rs.getString("observacao_avicultor");
                //avicultor.cidade = rs.getString("cidade");
                avicultor.nome_cidade = rs.getString("nome_cidade");
                avicultor.estado = rs.getString("estado");
               
                rs.close();
                avic.close();
                conexao.close();

                return avicultor;

            } catch (SQLException ex) {
                Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            {
                Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    public static void atualizar_avicultor(int codigo_avicultor, String nome_avicultor, String nome_eletricista, String login_usuario_avicultor, String email_avicultor, String telefone_avicultor, String celular_avicultor, String observacao_avicultor, String nome_cidade, String estado){
       
        try {
            Class.forName("org.postgresql.Driver");
            
            try {
           // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
           
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement avic = conexao.prepareStatement("update avicultores set nome_avicultor = ?, nome_eletricista =?, login_usuario_avicultor = ?,  email_avicultor = ?, telefone_avicultor = ?, celular_avicultor =?, observacao_avicultor =?,  nome_cidade=?, estado=? where codigo_avicultor = ?");

         
            
            avic.setString(1, nome_avicultor);
            avic.setString(2,nome_eletricista);
            avic.setString(3,login_usuario_avicultor);
            avic.setString(4, email_avicultor);
            avic.setString(5, telefone_avicultor);
            avic.setString(6, celular_avicultor);
            //avic.setString(7, senha_avicultor);
            avic.setString(7, observacao_avicultor);
            //avic.setString(7, cidade);
            avic.setString(8, nome_cidade);
            avic.setString(9, estado);
            avic.setInt(10, codigo_avicultor);

            avic.executeUpdate();
            avic.close();
            conexao.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     catch (ClassNotFoundException ex) {
              Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
          }

    }
    
        public static void excluir_avicultor(int codigo_avicultor) {

        try {
            Class.forName("org.postgresql.Driver");
            
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
          
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
            
            PreparedStatement avic = conexao.prepareStatement("delete from avicultores where codigo_avicultor = ?");

            avic.setInt(1, codigo_avicultor);
            avic.executeUpdate();

            avic.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
  
    
    

