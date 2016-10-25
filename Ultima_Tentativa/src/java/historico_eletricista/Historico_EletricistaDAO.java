/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historico_eletricista;

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
public class Historico_EletricistaDAO {

    public static void salvar_historico_eletricista(int codigo_historico_eletricista, String nome_avicultor, String pendente_eletricista, String data_inicio, String data_termino, String tb_concluido, String observacao_eletricista) {

        try {
            Class.forName("org.postgresql.Driver");
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("insert into historicos_eletricistas(codigo_historico_eletricista, nome_avicultor, pendente_eletricista, data_inicio, data_termino, tb_concluido, observacao_eletricista) values (?, ?, ?, ?, ?, ?, ?);");

            hist.setInt(1, codigo_historico_eletricista);
            hist.setString(2, nome_avicultor);
            hist.setString(3, pendente_eletricista);

            // hist.setString(3, data_inicio);
            Date inicio = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_inicio).getTime()); // para fazer a data e criar o campo incluir add cat clause
            hist.setDate(4, inicio);

            // hist.setString(4, data_termino);
            //Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
            //hist.setDate(5, termino);

             if(data_termino.isEmpty()){
                hist.setDate(5, null);
            
            }else {
            Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
          
            hist.setDate(5, termino);
            }
  
            hist.setString(6, tb_concluido);
            hist.setString(7, observacao_eletricista);

            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static ArrayList<Historico_Eletricista> listar_historico_eletricista() {
        ArrayList<Historico_Eletricista> historicos = new ArrayList<Historico_Eletricista>();

        try {
            Class.forName("org.postgresql.Driver");

            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos_eletricistas");

            ResultSet rs = hist.executeQuery();

            while (rs.next()) {
                Historico_Eletricista historico = new Historico_Eletricista();

                historico.codigo_historico_eletricista = rs.getInt("codigo_historico_eletricista");
                historico.nome_avicultor = rs.getString("nome_avicultor");
                historico.pendente_eletricista = rs.getString("pendente_eletricista");
                historico.data_inicio = rs.getDate("data_inicio");
                historico.data_termino = rs.getDate("data_termino");
                historico.tb_concluido = rs.getString("tb_concluido");
                historico.observacao_eletricista = rs.getString("observacao_eletricista");

                historicos.add(historico);
            }

            rs.close();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historicos;
    }

    public static Historico_Eletricista buscar_historico_eletricista(int codigo_historico_eletricista) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos_eletricistas where codigo_historico_eletricista = ?");

            hist.setInt(1, codigo_historico_eletricista);
            ResultSet rs = hist.executeQuery();

            rs.next();

            Historico_Eletricista historico = new Historico_Eletricista();

            historico.codigo_historico_eletricista = rs.getInt("codigo_historico_eletricista");
            historico.nome_avicultor = rs.getString("nome_avicultor");
            historico.pendente_eletricista = rs.getString("pendente_eletricista");
            historico.data_inicio = rs.getDate("data_inicio");
            historico.data_termino = rs.getDate("data_termino");
            historico.tb_concluido = rs.getString("tb_concluido");
            historico.observacao_eletricista = rs.getString("observacao_eletricista");

            rs.close();
            hist.close();
            conexao.close();

            return historico;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void atualizar_historico_eletricista(int codigo_historico_eletricista, String nome_avicultor, String pendente_eletricista, String data_inicio, String data_termino, String tb_concluido, String observacao_eletricista) {

        try {
            Class.forName("org.postgresql.Driver");

            // Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("update historicos_eletricistas set nome_avicultor =? ,pendente_eletricista = ?, data_inicio = ?, data_termino = ?, tb_concluido = ?, observacao_eletricista = ? where codigo_historico_eletricista = ?");

            hist.setString(1, nome_avicultor);
            hist.setString(2, pendente_eletricista);
            // hist.setString(2, data_inicio);
            //hist.setString(3, data_termino);
            hist.setString(3, tb_concluido);

            // hist.setString(3, data_inicio);
            Date inicio = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_inicio).getTime()); // para fazer a data e criar o campo incluir add cat clause
            hist.setDate(4, inicio);

            // hist.setString(4, data_termino);
            //Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
            //hist.setDate(5, termino);
                        
             if(data_termino.isEmpty()){
                hist.setDate(5, null);
            
            }else {
            Date termino = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_termino).getTime()); // para fazer a data e criar o campo incluir add cat clause
          
            hist.setDate(5, termino);
            }
            
            
            
            hist.setString(6, observacao_eletricista);
            hist.setInt(7, codigo_historico_eletricista);

            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void excluir_historico_eletricista(int codigo_historico_eletricista) {

        try {
            Class.forName("org.postgresql.Driver");

            //Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tentativa", "postgres", "oifio2016");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://projetoac.cloudapp.net:5432/elefra", "elefra", "elefra$1");

            PreparedStatement hist = conexao.prepareStatement("delete from historicos_eletricistas where codigo_historico_eletricista = ?");

            hist.setInt(1, codigo_historico_eletricista);
            hist.executeUpdate();

            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Historico_EletricistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
