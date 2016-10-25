/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historico_avicultor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class Historico_AvicultorDAO {
    
    public static void salvar_historico_avicultor(int codigo_historico_avicultor, String nome_eletricista, String pendente_avicultor, String data_inicio, String data_termino, String tb_concluido, String observacao_avicultor) {

        try {
            Class.forName("org.postgresql.Driver");
           
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
         
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("insert into historicos_avicultores(codigo_historico_avicultor, nome_eletricista, pendente_avicultor, data_inicio, data_termino, tb_concluido, observacao_avicultor) values (?, ?, ?, ?, ?, ?, ?);");

            hist.setInt(1, codigo_historico_avicultor);
            hist.setString(2, nome_eletricista);
            hist.setString(3, pendente_avicultor);

            //hist.setString(3, data_inicio);
            Date inicio = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_inicio).getTime()); // para fazer a data e criar o campo incluir add cat clause
            hist.setDate(4, inicio);
            
            //hist.setString(4, data_termino);
           // Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
            //hist.setDate(5, termino);
            
             if(data_termino.isEmpty()){
                hist.setDate(5, null);
            
            }else {
            Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
          
            hist.setDate(5, termino);
            }
            
            
            
            hist.setString(6, tb_concluido);
            hist.setString(7, observacao_avicultor);
                     
            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
           Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static ArrayList<Historico_Avicultor> listar_historico_avicultor() {
        ArrayList<Historico_Avicultor> historicos = new ArrayList<Historico_Avicultor>();

        try {
            Class.forName("org.postgresql.Driver");

            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
           
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos_avicultores");

            ResultSet rs = hist.executeQuery();

            while (rs.next()) {
                Historico_Avicultor historico = new Historico_Avicultor();
                
                historico.codigo_historico_avicultor = rs.getInt("codigo_historico_avicultor");
                historico.nome_eletricista =rs.getString("nome_eletricista");
                historico.pendente_avicultor = rs.getString("pendente_avicultor");
                historico.data_inicio = rs.getDate("data_inicio");
                historico.data_termino = rs.getDate("data_termino");
                historico.tb_concluido = rs.getString("tb_concluido");
                historico.observacao_avicultor = rs.getString("observacao_avicultor");

                historicos.add(historico);
            }

            rs.close();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historicos;
    }
    
      
        public static Historico_Avicultor buscar_historico_avicultor(int codigo_historico_avicultor) {

        try {
            Class.forName("org.postgresql.Driver");

           //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
           Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos_avicultores where codigo_historico_avicultor = ?");

            hist.setInt(1, codigo_historico_avicultor);
            ResultSet rs = hist.executeQuery();

            rs.next();

            Historico_Avicultor historico = new Historico_Avicultor();

            historico.codigo_historico_avicultor = rs.getInt("codigo_historico_avicultor");
            historico.nome_eletricista = rs.getString("nome_eletricista");
            historico.pendente_avicultor = rs.getString("pendente_avicultor");
            historico.data_inicio = rs.getDate("data_inicio");
            historico.data_termino = rs.getDate("data_termino");
            historico.tb_concluido = rs.getString("tb_concluido");
            historico.observacao_avicultor = rs.getString("observacao_avicultor");
            
            rs.close();
            hist.close();
            conexao.close();

            return historico;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void atualizar_historico_avicultor(int codigo_historico_avicultor,String nome_eletricista, String pendente_avicultor, String data_inicio, String data_termino, String tb_concluido, String observacao_avicultor) {

        try {
            Class.forName("org.postgresql.Driver");
           
           // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
           Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("update historicos_avicultores set  nome_eletricista =?, pendente_avicultor = ?, data_inicio = ?, data_termino = ?, tb_concluido = ?, observacao_avicultor = ? where codigo_historico_avicultor = ?");

            hist.setString(1,nome_eletricista);
            hist.setString(2, pendente_avicultor);
            //hist.setString(2, data_inicio);
           // hist.setString(3, data_termino);
           
            Date inicio = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_inicio).getTime()); // para fazer a data e criar o campo incluir add cat clause
            hist.setDate(3, inicio);
            
           //Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
           // hist.setDate(4, termino);
                    
             if(data_termino.isEmpty()){
                hist.setDate(4, null);
            
            }else {
            Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
          
            hist.setDate(4, termino);
            }
            
            
            
            hist.setString(5, tb_concluido);
            hist.setString(6, observacao_avicultor);
            hist.setInt(7, codigo_historico_avicultor);
       
            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void excluir_historico_avicultor(int codigo_historico_avicultor) {

        try {
            Class.forName("org.postgresql.Driver");

           //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("delete from historicos_avicultores where codigo_historico_avicultor = ?");

            hist.setInt(1, codigo_historico_avicultor);
            hist.executeUpdate();

            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_AvicultorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
