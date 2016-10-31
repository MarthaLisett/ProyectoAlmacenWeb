/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesDatos;

import informacion.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MarthaLisett
 */
public class ManejoBasesDatos {

    private static Connection connection;

    public ManejoBasesDatos() {
        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost/mensajeria", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean existe(Usuario user){
        
        boolean existe = false;
        
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT Matricula FROM alumno");
            while (result.next()) {
                String matricula = result.getString(1);
                
                if (user.getMatricula().equals(matricula)) {
                    existe = !existe;
                }
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return existe;
    }

}
