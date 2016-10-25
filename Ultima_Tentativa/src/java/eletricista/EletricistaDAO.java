/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eletricista;

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
public class EletricistaDAO {
      
      public static void salvar_eletricista(int codigo_eletricista, String nome_eletricista, String nome_avicultor, String login_usuario_eletricista, String email_eletricista, String telefone_eletricista, String celular_eletricista, String senha_eletricista, String observacao_eletricista,  String nome_cidade, String estado) {

        try {
            Class.forName("org.postgresql.Driver");
           // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
          
           Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
          
           PreparedStatement elec = conexao.prepareStatement("insert into eletricistas (codigo_eletricista, nome_eletricista, nome_avicultor, login_usuario_eletricista, email_eletricista, telefone_eletricista, celular_eletricista, senha_eletricista, observacao_eletricista, nome_cidade, estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

            // clt = cliente  
            elec.setInt(1, codigo_eletricista);
            elec.setString(2, nome_eletricista);
            elec.setString(3, nome_avicultor);
            elec.setString(4, login_usuario_eletricista);
            elec.setString(5, email_eletricista);
            elec.setString(6, telefone_eletricista);
            elec.setString(7, celular_eletricista);
            elec.setString(8, senha_eletricista);
            elec.setString(9, observacao_eletricista);
            //elec.setString(10, cidade);
            elec.setString(10, nome_cidade);
            elec.setString(11, estado);

            elec.executeUpdate();
            elec.close();
            conexao.close();
                       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Lista de Cliente
    public static ArrayList<Eletricista> listar_eletricistas() {
        ArrayList<Eletricista> eletricistas = new ArrayList<Eletricista>();

        try {
            Class.forName("org.postgresql.Driver");
            
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
                     
            PreparedStatement elec = conexao.prepareStatement("select * from eletricistas");

            ResultSet rs = elec.executeQuery();

            while (rs.next()) {
                
                Eletricista eletricista = new Eletricista();
                
                eletricista.codigo_eletricista = rs.getInt("codigo_eletricista");
                eletricista.nome_eletricista = rs.getString("nome_eletricista");
                eletricista.nome_avicultor = rs.getString("nome_avicultor");
                eletricista.login_usuario_eletricista = rs.getString("login_usuario_eletricista");
                eletricista.email_eletricista = rs.getString("email_eletricista");
                eletricista.telefone_eletricista = rs.getString("telefone_eletricista");
                eletricista.celular_eletricista= rs.getString("celular_eletricista");
                eletricista.senha_eletricista = rs.getString("senha_eletricista");
                eletricista.observacao_eletricista = rs.getString("observacao_eletricista");
                eletricista.nome_cidade = rs.getString("nome_cidade");
                eletricista.estado = rs.getString("estado");

                //Cidade cidade = new Cidade();
               // cidade.nome_cidade = rs.getString("nomeCidade");
               // cidade.estado = rs.getString("uf");

               // cliente.cidade = cidade.nome_cidade;
                //cliente.cidade = cidade;

                eletricistas.add(eletricista);
            }
            rs.close();
            elec.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return eletricistas;
    }
    
    public static Eletricista login_eletricista(String login_usuario_eletricista, String senha_eletricista) {

        try {
            Class.forName("org.postgresql.Driver");
           
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

           
            PreparedStatement elec = conexao.prepareStatement("select * from eletricistas where login_usuario_eletricista = ? and senha_eletricista = ?");

            elec.setString(1, login_usuario_eletricista);
            elec.setString(2, senha_eletricista);

            ResultSet rs = elec.executeQuery();

            if (rs.next()) {
                Eletricista eletricista = new Eletricista();
                eletricista.login_usuario_eletricista = rs.getString("login_usuario_eletricista");
                eletricista.senha_eletricista = rs.getString("senha_eletricista");
                // eletricista.email_eletricista = rs.getString("email_eletricista");

                rs.close();
                elec.close();
                conexao.close();

                return eletricista;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Eletricista buscar_eletricista(int codigo_eletricista) {

        try {

            Class.forName("org.postgresql.Driver");

            try {
                
             //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
             Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
               
               PreparedStatement elec = conexao.prepareStatement("select * from eletricistas where codigo_eletricista= ?");

                elec.setInt(1, codigo_eletricista);
                ResultSet rs = elec.executeQuery();

                rs.next();

                Eletricista eletricista = new Eletricista();
                
                eletricista.codigo_eletricista = rs.getInt("codigo_eletricista");
                eletricista.nome_eletricista = rs.getString("nome_eletricista");
                eletricista.nome_avicultor = rs.getString("nome_avicultor");
                eletricista.login_usuario_eletricista = rs.getString("login_usuario_eletricista");
                eletricista.email_eletricista = rs.getString("email_eletricista");
                eletricista.telefone_eletricista = rs.getString("telefone_eletricista");
                eletricista.celular_eletricista= rs.getString("celular_eletricista");
                eletricista.senha_eletricista = rs.getString("senha_eletricista");
                eletricista.observacao_eletricista = rs.getString("observacao_eletricista");
                eletricista.nome_cidade = rs.getString("nome_cidade");
                eletricista.estado = rs.getString("estado");
                
                
                rs.close();
                elec.close();
                conexao.close();

                return eletricista;

            } catch (SQLException ex) {
                Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            {
                Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
      public static void atualizar_eletricista(int codigo_eletricista, String nome_eletricista, String nome_avicultor, String login_usuario_eletricista, String email_eletricista, String telefone_eletricista, String celular_eletricista,String senha_eletricista, String observacao_eletricista, String nome_cidade, String estado) {
       
        try {
            Class.forName("org.postgresql.Driver");
            
            try {
           // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement elec = conexao.prepareStatement("update eletricistas set nome_eletricista = ?, nome_avicultor=?, login_usuario_eletricista = ?,  email_eletricista = ?, telefone_eletricista = ?, celular_eletricista =?,  senha_eletricista = ?, observacao_eletricista =?, nome_cidade =?, estado =? where codigo_eletricista = ?");

            elec.setString(1, nome_eletricista);            
            elec.setString(2, nome_avicultor);
            elec.setString(3, login_usuario_eletricista);
            elec.setString(4, email_eletricista);
            elec.setString(5, telefone_eletricista);
            elec.setString(6, celular_eletricista);
            elec.setString(7, senha_eletricista);
            elec.setString(8, observacao_eletricista);
            elec.setString(9, nome_cidade);
            elec.setString(10, estado);
            elec.setInt(11, codigo_eletricista);

            elec.executeUpdate();
            elec.close();
            conexao.close();
            
            } catch (SQLException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }     catch (ClassNotFoundException ex) {
              Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
          }

    }
    
        public static void excluir_eletricista(int codigo_eletricista) {

        try {
            Class.forName("org.postgresql.Driver");
            
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");
            
            PreparedStatement elec = conexao.prepareStatement("delete from eletricistas where codigo_eletricista= ?");

            elec.setInt(1, codigo_eletricista);
            elec.executeUpdate();

            elec.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  

