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
        String query ="";
        try {
         
            iniciarConexion();
            
            query = "INSERT INTO `equipo`(`Id`, `Nombre`, `Marca`, `Inventario`, `Localizacion`, `Disponibilidad`) VALUES (?, ?, ?, ?, ?, ?)";
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             
             preparedStmt.setString   (1, eq.getId());
             preparedStmt.setString   (2, eq.getNombre());
             preparedStmt.setString   (3, eq.getMarca());
             preparedStmt.setString   (4, eq.getInventario());
             preparedStmt.setString   (5, eq.getLocalizacion());
             preparedStmt.setString   (6, eq.getDisponibilidad());
             
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean insertarMaterial(Material mat) {
            String query ="";
        try {
         
            iniciarConexion();
            query =  "INSERT INTO `material`(`Id`, `Nombre`, `Marca`, `Localización`, `Capacidad`, `Disponibilidad`) VALUES (?, ?, ?, ?, ?, ?)";
            
            
            
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             preparedStmt.setString   (1, mat.getId());
             preparedStmt.setString   (2, mat.getNombre());
             preparedStmt.setString   (3, mat.getMarca());
             preparedStmt.setString   (4, mat.getLocalizacion());
             preparedStmt.setString   (5, mat.getCapacidad());
             preparedStmt.setInt      (6, Integer.parseInt(mat.getDisponibilidad()));
             
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean insertarReactivo(Reactivo react) {
        String query ="";
       try {
         
            iniciarConexion();
            query ="INSERT INTO `reactivo`(`Id`, `Nombre`, `Marca`, `Presentacion`, `Contenido`, `Localizacion`, `Disponibilidad`) VALUES (?, ?, ?, ?, ?, ?, ?)";

             PreparedStatement preparedStmt = connection.prepareStatement(query);
             
             preparedStmt.setString   (1, react.getId());
             preparedStmt.setString   (2, react.getNombre());
             preparedStmt.setString   (3, react.getMarca());
             preparedStmt.setString   (4, react.getPresentacion());
             preparedStmt.setString   (5, react.getContenido());
             preparedStmt.setString   (6, react.getLocalizacion());
             preparedStmt.setString   (7, react.getDisponibilidad());

             
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
            
    }

    public static boolean insertarConsumible(Consumible cons) {
       String query ="";
       try {
         
            iniciarConexion();
            query ="INSERT INTO `consumible`(`Id`, `Nombre`, `Marca`, `Presentacion`, `Contenido`, `Localizacion`, `Disponibilidad`) VALUES (?, ?, ?, ?, ?, ?, ?)";

             PreparedStatement preparedStmt = connection.prepareStatement(query);
             
             preparedStmt.setString   (1, cons.getId());
             preparedStmt.setString   (2, cons.getNombre());
             preparedStmt.setString   (3, cons.getMarca());
             preparedStmt.setString   (4, cons.getPresentacion());
             preparedStmt.setString   (5, cons.getContenido());
             preparedStmt.setString   (6, cons.getLocalizacion());
             preparedStmt.setString   (7, cons.getDisponibilidad());

             
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarPrestado(Forma forma) {
     String query = "";
        try {
             iniciarConexion();
             query = "INSERT INTO prestado (Matricula, Fecha, Correo, Lab, Descripcion, Capacidad, Marca, Cantidad, Estatus, Observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             preparedStmt.setString   (1, forma.getUsuario());
             preparedStmt.setString   (2, forma.getFecha());
             preparedStmt.setString   (3, forma.getCorreo());
             preparedStmt.setString   (4, forma.getLocal());
             preparedStmt.setString   (5, forma.getDesc());
             preparedStmt.setString   (6, forma.getCap());
             preparedStmt.setString   (7, forma.getMarca());
             preparedStmt.setInt      (8, Integer.parseInt(forma.getCant()));
             preparedStmt.setString   (9, forma.getStatus());
             preparedStmt.setString   (10, forma.getObs());
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarPedido(Forma forma) {
       String query = "";
        try {
             iniciarConexion();
             query = "INSERT INTO pedido (Matricula, Fecha, Correo, Lab, Descripcion, Capacidad, Marca, Cantidad, Estatus, Observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             preparedStmt.setString   (1, forma.getUsuario());
             preparedStmt.setString   (2, forma.getFecha());
             preparedStmt.setString   (3, forma.getCorreo());
             preparedStmt.setString   (4, forma.getLocal());
             preparedStmt.setString   (5, forma.getDesc());
             preparedStmt.setString   (6, forma.getCap());
             preparedStmt.setString   (7, forma.getMarca());
             preparedStmt.setInt      (8, Integer.parseInt(forma.getCant()));
             preparedStmt.setString   (9, forma.getStatus());
             preparedStmt.setString   (10, forma.getObs());
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean autorizarPrestamo(String nombre) {
        
        
        return true;
    }
    
    public static String buscaLocalizacion (String nombre) {
        return "local";
    }
    
    public static boolean insertarReporte(Forma forma) {
       
      String query = "";
        
        try {
            
            iniciarConexion();
            
             query = "INSERT INTO totales (Matricula, Fecha, Correo, Lab, Descripcion, Capacidad, Marca, Cantidad, Estatus, Observaciones) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             
             preparedStmt.setString   (1, forma.getUsuario());
             preparedStmt.setString   (2, forma.getFecha());
             preparedStmt.setString   (3, forma.getCorreo());
             preparedStmt.setString   (4, forma.getLocal());
             preparedStmt.setString   (5, forma.getDesc());
             preparedStmt.setString   (6, forma.getCap());
             preparedStmt.setString   (7, forma.getMarca());
             preparedStmt.setInt      (8, Integer.parseInt(forma.getCant()));
             preparedStmt.setString   (9, forma.getStatus());
             preparedStmt.setString   (10, forma.getObs());
             
             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarLab(Laboratorio lab) {
 String query = "";
        
        try {
            
            iniciarConexion();
            
             query = "INSERT INTO `laboratorio`(`Nombre`, `Clave`) VALUES (?, ?)";

            
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             
             preparedStmt.setString   (1, lab.getNombre());
             preparedStmt.setString   (2, lab.getClave());

             if (preparedStmt.executeUpdate() == 1) {
                return true;
             }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public static boolean insertarUsuario(Usuario user) {
       String query = "";
        
        try {
            
            iniciarConexion();
            
             query = "INSERT INTO `usuarios`(`Matricula`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `Correo`) VALUES (?, ?, ?, ?, ?)";

            
             PreparedStatement preparedStmt = connection.prepareStatement(query);
             
             preparedStmt.setString   (1, user.getMatricula());
             preparedStmt.setString   (2, user.getNombre());
             preparedStmt.setString   (3, user.getApellidoPaterno());
             preparedStmt.setString   (4, user.getApellidoMaterno());
             preparedStmt.setString   (5, user.getCorreo());

             if (preparedStmt.executeUpdate() == 1) {
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
    public static String buscar(String nombre){
        String[] tablas = {"equipo", "material", "reactivo", "consumible"};
        
        try {
            iniciarConexion();
            for(String tabla : tablas) {
                String query = "SELECT * FROM "+ tabla + " WHERE Nombre = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString   (1, nombre);
                System.out.println("query buscar: " + query);
                ResultSet result = preparedStmt.executeQuery();
                while (result.next()) {
                    System.out.println("tabla hasta el momento:" + tabla);
                   return tabla;
                }
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    
    public static boolean modif(Forma form, String tipo, String operador) {
        //agarro la dispobinibilidad actual del inventario
        if(operador.equals("resta")){
        String disp =  "";
        String tabla = tipo;
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
        
        System.out.println("tabla en MODIF: " + tabla);
        
        try {
            Statement statement = connection.createStatement();
            query = "SELECT Disponibilidad FROM " + tabla + 
                    " WHERE Nombre = '" + form.getDesc() + "'";
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                disp = result.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //checo que haya suficientes
        System.out.println("DISP: " + disp);
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
    }else{
            String disp =  "";
        String tabla = tipo;
        String query = "";
        /*
        if(tipo.equals("alumnoMaterial") || tipo.equals("profeMaterial")) {
            tabla = "material";
        } else if (tipo.equals("profeEquipo") || tipo.equals("alumnoEquipo")) {
            tabla = "equipo";
        } else if (tipo.equals("profeConsumible")) {
            tabla = "consumible";
        } else if (tipo.equals("profeReactivo")) {
            tabla = "reactivo";
        }
        */
        System.out.println("tabla en MODIF: " + tabla);
        
        try {
            Statement statement = connection.createStatement();
            query = "SELECT Disponibilidad FROM " + tabla + 
                    " WHERE Nombre = '" + form.getDesc() + "'";
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                disp = result.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //checo que haya suficientes
        System.out.println("DISP: " + disp);
        int iDisp = Integer.parseInt(disp);
        int iCant = Integer.parseInt(form.getCant());
        iDisp = iDisp + iCant;
        //si no hay, regreso falso para fallar
       
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
    
    
     public static String[][] leerPedidos() {
       //saco el total de registros
        int cont = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM pedido");
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
            ResultSet result = statement.executeQuery("SELECT * FROM pedido");
            while (result.next()) {
                //leolos registros y los guardo cada uno en un renglon de la matriz
                System.out.println("ResultSet: " + result.getString(1));
                
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
    
     public static String[][] leerPrestados() {
       //saco el total de registros
        int cont = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM prestado");
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
            ResultSet result = statement.executeQuery("SELECT * FROM prestado");
            while (result.next()) {
                //leolos registros y los guardo cada uno en un renglon de la matriz
                System.out.println("ResultSet: " + result.getString(1));
                
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
     
       public static void eliminar(String vale) {
            String query = "";
        
            try {
                iniciarConexion();
                query = "DELETE FROM pedido WHERE Vale = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);

                preparedStmt.setInt   (1, Integer.parseInt(vale));
                preparedStmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
       
       public static String[] leerUsuarios() {
           //saco el total de registros
        int cont = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM usuarios");
            while (result.next()) {
             cont++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //matriz para guardar los registros
           String[] usuarios = new String[cont];
           cont = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM usuarios");
            while (result.next()) {
                //leolos registros y los guardo cada uno en un renglon de la matriz
                System.out.println("ResultSet: " + result.getString(1));                
                usuarios[cont] = result.getString(1);
                cont++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //regreso reporte completo
          return usuarios;
       }
       
       public static void eliminarUsuario(String mat) {
           String query = "";
        
            try {
                iniciarConexion();
                query = "DELETE FROM usuarios WHERE Matricula = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);

                preparedStmt.setString (1, mat);
                preparedStmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
       
       
       public static String[] checarCantidades() {
        
        int contador = 0;
        String[] tablas = {"equipo", "material", "reactivo", "consumible"};
        
        try {
            iniciarConexion();
            for(String tabla : tablas) {
                Statement statement = connection.createStatement();
                String query = "SELECT * FROM "+ tabla + " WHERE Disponibilidad < 5";
                ResultSet result = statement.executeQuery(query);
                while (result.next()) {
                    contador ++;
                }
            } 
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] resultado = new String[contador];
        int i = 0;
        try {
            iniciarConexion();
            for(String tabla : tablas) {
                Statement statement = connection.createStatement();
                String query = "SELECT Nombre FROM "+ tabla + " WHERE Disponibilidad < 5";
                ResultSet result = statement.executeQuery(query);
                while (result.next()) {
                    resultado[i] = result.getString(1);
                    i ++;
                }
            }
             return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            String[] resultadoAux = new String[1];
            resultadoAux[0] = "Hay suficientes";
            return resultadoAux;
       } 
       
       public static void eliminarDevueltos(String vale) {
            String query = "";
        
            try {
                iniciarConexion();
                query = "DELETE FROM prestado WHERE Vale = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);

                preparedStmt.setInt   (1, Integer.parseInt(vale));
                preparedStmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ManejoBasesDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
       
}
