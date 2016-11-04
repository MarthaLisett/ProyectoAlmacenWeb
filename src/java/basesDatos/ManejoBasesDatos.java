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

            connection = DriverManager.getConnection("jdbc:mysql://10.12.172.100", "root", "");
            //  connection = DriverManager.getConnection("jdbc:mysql://localhost/laboratorioqumica", "root", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String existe(Usuario user) {

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT Tipo FROM usuario WHERE Matricula = '" + user.getMatricula() + "'");
            while (result.next()) {      
                return result.getString(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public static void ObtenerInfoUsuario(Usuario user) {
        try {
            Statement statement = connection.createStatement();
            String matricula = user.getMatricula();
            ResultSet infoAlumno = statement.executeQuery("SELECT Matricula, Nombre, ApellidoPaterno, ApellidoMaterno, Correo FROM alumno where matricula ='" + matricula + "'");
            while (infoAlumno.next()) {
                String id = infoAlumno.getString(1);
                String nombre = infoAlumno.getString(2);
                String apellidoPat = infoAlumno.getString(3);
                String apellidoMat = infoAlumno.getString(4);
                String correo = infoAlumno.getString(5);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
