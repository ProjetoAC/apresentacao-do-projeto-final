/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class TesteDAO {
    
    public static void salvar (int codigo_teste, String nome_teste){
        
        try {
            Class.forName("org.postgresql.Driver");
            
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testes", "postgres", "oifio2016");
            
            PreparedStatement test = conexao.prepareStatement("insert into testes (codigo_teste, nome_teste) values (?, ?)");
                      
            test.setInt(1, codigo_teste);
            test.setString(2, nome_teste);
            
            test.executeUpdate();
            test.close();
            conexao.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TesteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
