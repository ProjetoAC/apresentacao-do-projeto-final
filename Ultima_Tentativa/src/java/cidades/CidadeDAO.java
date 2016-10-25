/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cidades;

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
public class CidadeDAO {

    public static void salvar(int codigo_cidade, String nome_cidade, String estado) {


        try {
            Class.forName("org.postgresql.Driver");
            
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
            
            PreparedStatement cid = conexao.prepareStatement("insert into cidades(codigo_cidade, nome_cidade, estado) values (?, ?, ?);");
            //cid = cidade
            cid.setInt(1, codigo_cidade);
            cid.setString(2, nome_cidade);
            cid.setString(3, estado);

            cid.executeUpdate();
            
            cid.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Cidade> listar_cidade() {
        ArrayList<Cidade> cidades = new ArrayList<Cidade>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
            PreparedStatement cid = conexao.prepareStatement("select * from cidades");
            //cid = cidade
            ResultSet rs = cid.executeQuery();

            while (rs.next()) {

                Cidade cidade = new Cidade();
                cidade.codigo_cidade = rs.getInt("codigo_cidade");
                cidade.nome_cidade = rs.getString("nome_cidade");
                cidade.estado = rs.getString("estado");
                cidades.add(cidade);
            }
            rs.close();
            cid.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cidades;
    }
    
    public static void excluir(int codigo_cidade) {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");
            PreparedStatement cid = conexao.prepareStatement("delete from cidades where codigo_cidade = ?");

            cid.setInt(1, codigo_cidade);
            cid.executeUpdate();

            cid.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void atualizar(int codigo_cidade, String nome_cidade,  String estado){
        
        try {
            Class.forName("org.postgresql.Driver");
            
            Connection conexao = DriverManager.getConnection("jdbc:postgres://localhost:5432/projeto_final", "postgres", "oifio2016");
            
            PreparedStatement cid = conexao.prepareStatement("update cidades set nome_cidade = ?,  estado = ? where codigo_cliente = ?");
            
            cid.setString(1, nome_cidade);
            cid.setString(2, estado);
            cid.setInt(3, codigo_cidade);
            
            cid.executeUpdate();
            cid.close();
            conexao.close();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
 

}