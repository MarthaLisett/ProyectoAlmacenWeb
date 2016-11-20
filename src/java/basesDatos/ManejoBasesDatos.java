/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basesDatos;

import informacion.Consumible;
import informacion.Equipo;
import informacion.Forma;
import informacion.Laboratorio;
import informacion.Material;
import informacion.Profesor;
import informacion.Reactivo;
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
 * /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
import informacion.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

    
    // TODO: esto es necesario?
    public ManejoBasesDatos() {
        try {
            //connection = DriverManager.getConnection("jdbc:mysql://10.12.172.100", "root", "");
            // connection = DriverManager.getConnection("jdbc:mysql://localhost/laboratorioqumica", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void iniciarConexion() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost/quimica", "root", "");
        System.out.println("conexion iniciada");
    }
    
    public static StringBuilder obtenerDatos(String matricula) throws SQLException {
         StringBuilder resultado = new StringBuilder();
         
         Statement statement = connection.createStatement();
         String query = "SELECT * FROM usuarios WHERE Matricula = '" +
                 matricula + "'"; 
         
         ResultSet result = statement.executeQuery(query);
         
         while(result.next()) {
             resultado.append(result.getString(1));
             resultado.append("-");
             resultado.append(result.getString(2));
             resultado.append("-");
             resultado.append(result.getString(3));
             resultado.append("-");
             resultado.append(result.getString(4));
             resultado.append("-");
             resultado.append(result.getString(5));
             resultado.append("-");
         }
        
         System.out.println("resultado:" + resultado);
         
        return resultado;
    }
    
    
    public static Boolean existe(Usuario user) {
        Boolean existe = false;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT Matricula FROM usuarios");
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

    // Se quitó el tipo de la tabla
    public static String buscarTipo(Usuario user) {
        String matricula = user.getMatricula();
        String tipo = "";
        try {
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("SELECT Tipo FROM usuarios WHERE Matricula = '" + matricula + "'");

            while (result.next()) {
                tipo = result.getString(1);
            }
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tipo;
    }

    public static boolean insertarEquipo(Equipo eq) {
        try {
            Statement statement = connection.createStatement();

            ResultSet result = statement.executeQuery("INSERT INTO `equipo`(`Id`, `Nombre`, `Marca`, `Inventario`, `Localizacion`, `Disponibilidad`) VALUES (eq.getId(), eq.getNombre(), eq.getMarca(), eq.getInventario(), eq.getLocalizacion(), eq.getDisponibilidad())");
            while (result.next()) {
                statement.close();
                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean insertarMaterial(Material mat) {

        try {
            Statement statement = connection.createStatement();
           ResultSet result = statement.executeQuery("INSERT INTO `material`(`Id`, `Nombre`, `Marca`, `Localización`, `Capacidad`, `Disponibilidad`) VALUES (mat.getId(), mat.getNombre(), mat.getMarca(), mat.getLocalizacion(), mat.getCapacidad(), mat.getDisponibilidad())");
            while (result.next()) {
                statement.close();

                return true;

            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean insertarReactivo(Reactivo react) {

        try {
            Statement statement = connection.createStatement();
          ResultSet result = statement.executeQuery("INSERT INTO `reactivo`(`Id`, `Nombre`, `Marca`, `Presentacion`, `Contenido`, `Localizacion`, `Disponibilidad`) VALUES (react.getId(), react.getNombre(), react.getMarca(), react.getPresentacion(), react.getContenido(), react.getLocalizacion(), react.getDisponibilidad())");
            while (result.next()) {
                statement.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean insertarConsumible(Consumible cons) {
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("INSERT INTO `consumible`(`Id`, `Nombre`, `Marca`, `Presentacion`, `Contenido`, `Localizacion`, `Disponibilidad`) VALUES(cons.getId(), cons.getNombre(), cons.getMarca(), cons.getPresentacion(), cons.getContenido(), cons.getLocalizacion(), cons.getDisponibilidad())");
            while (result.next()) {
                statement.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarPrestado(Forma forma) {
       
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("INSERT INTO `prestado`(`Matricula`, `Fecha`, `Vale`, `Correo`, `Lab`, `Descripcion`, `Capacidad`, `Marca`, `Cantidad`, `Estatus`, `Observaciones`) VALUES (forma.getUsuario(),forma.getFecha(),forma.getVale(),forma.getCorreo(),forma.getLab(),forma.getDesc(),forma.getCap(),forma.getMarca(),forma.getCant(),forma.getStatus(), forma.getObs())");
            while (result.next()) {
                statement.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarPedido(Forma forma) {
       
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("INSERT INTO `pedido`(`Matricula`, `Fecha`, `Vale`, `Correo`, `Lab`, `Descripcion`, `Capacidad`, `Marca`, `Cantidad`, `Estatus`, `Observaciones`) VALUES (forma.getUsuario(),forma.getFecha(),forma.getVale(),forma.getCorreo(),forma.getLab(),forma.getDesc(),forma.getCap(),forma.getMarca(),forma.getCant(),forma.getStatus(), forma.getObs())");
            while (result.next()) {
                statement.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarReporte(Forma forma) {
       
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("INSERT INTO `totales`(`Matricula`, `Fecha`, `Vale`, `Correo`, `Lab`, `Descripcion`, `Capacidad`, `Marca`, `Cantidad`, `Estatus`, `Observaciones`) VALUES (forma.getUsuario(),forma.getFecha(),forma.getVale(),forma.getCorreo(),forma.getLab(),forma.getDesc(),forma.getCap(),forma.getMarca(),forma.getCant(),forma.getStatus(), forma.getObs())");
            while (result.next()) {
                statement.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarLab(Laboratorio lab) {
       
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("INSERT INTO `laboratorio`(`Nombre`, `Clave`) VALUES (lab.getNombre(), lab.getClave())");
            while (result.next()) {
                statement.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarProfe(Profesor profe) {
       
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("INSERT INTO `profesor`(`Nombre`, `Correo`) VALUES (profe.getNombre(), profe.getCorreo())");
            while (result.next()) {
                statement.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    /*
    *
    *
    */
    public static boolean modif(Forma form, String tipo) {
        //agarro la dispobinibilidad actual del inventario
        String disp =  "";
        String tabla = "";
        String query = "";
        
        if(tipo.equals("alumnoMaterial") || tipo.equals("profeMaterial")) {
            tabla = "material";
        } else if (tipo.equals("profeEquipo") || tipo.equals("alumnoEquipo")) {
            tabla = "equipo";
        } else if (tipo.equals("profeConsumible")) {
            tabla = "consumible";
        } else if (tipo.equals("profeReactivo")) {
            tabla = "reactivo";
        }
        
        try {
            Statement statement = connection.createStatement();
            query = "SELECT Disponibilidad FROM " + tabla + 
                    " WHERE Id = '" + form.getId() + "'";
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                disp = result.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //checo que haya suficientes
        int iDisp = Integer.parseInt(disp);
        int iCant = Integer.parseInt(form.getCant());
        iDisp = iDisp - iCant;
        //si no hay, regreso falso para fallar
        if(iDisp < 0) {
            return false;
        } else {
            //si si hay, inserto la nueva dipobilidad en el inventario
            try {
                System.out.println("tabla: " + tabla);
                System.out.println("disponible: " + iDisp);
                System.out.println("nombre: " + form.getDesc());
                
                query = "UPDATE " + tabla + " SET Disponibilidad = ? WHERE Nombre = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setInt   (1, iDisp);
                preparedStmt.setString(2, form.getDesc());
                preparedStmt.executeUpdate();
                
                if (preparedStmt.executeUpdate() == 1) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
         return false;
    }
    
    public static String[][] leerReportes() {
       //saco el total de registros
        int cont = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM totales");
            while (result.next()) {
             cont++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //matriz para guardar los registros
           String[][] reporte = new String[cont][11];
           cont = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM totales");
            while (result.next()) {
                //leolos registros y los guardo cada uno en un renglon de la matriz
                reporte[cont][0] = result.getString(1);
                reporte[cont][1] = result.getString(2);
                reporte[cont][2] = result.getString(3);
                reporte[cont][3] = result.getString(4);
                reporte[cont][4] = result.getString(5);
                reporte[cont][5] = result.getString(6);
                reporte[cont][6] = result.getString(7);
                reporte[cont][7] = result.getString(8);
                reporte[cont][8] = result.getString(9);
                reporte[cont][9] = result.getString(10);
                reporte[cont][10] = result.getString(11);
                cont++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //regreso reporte completo
        return reporte;
       }
}
