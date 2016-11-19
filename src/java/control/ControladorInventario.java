/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import informacion.Usuario;
import basesDatos.ManejoBasesDatos;
import informacion.Consumible;
import informacion.Equipo;
import informacion.Forma;
import informacion.Laboratorio;
import informacion.Material;
import informacion.Profesor;
import informacion.Reactivo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MarthaLisett
 */
public class ControladorInventario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String marca = request.getParameter("marca");
        String presentacion = request.getParameter("presentacion");
        String contenido = request.getParameter("contenido");
        String localizacion = request.getParameter("localizacion");
        String disponibilidad = request.getParameter("disponibilidad");
        String inventario = request.getParameter("inventario");
        String clave = request.getParameter("clave");
        String correo = request.getParameter("correo");
        String capacidad = request.getParameter("capacidad");
        String tipo = request.getParameter("tipo");
        //url de que algo fallo
        String url="fallo.jsp";
        //si es material, hago un material nuevo, lo inserto en la base de datos y su un exito
        if(tipo.equals("material")){
            Material mat = new Material(id, nombre, marca, localizacion, capacidad, disponibilidad);
            ManejoBasesDatos.insertarMaterial(mat);
             url="exito.jsp";
        //si es reactivo, hago un reactivo nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("reactivo")){
            Reactivo reac = new Reactivo(id, nombre, marca, presentacion, contenido, localizacion, disponibilidad);
            ManejoBasesDatos.insertarReactivo(reac);
             url="exito.jsp";
        //si es consumible, hago un consumible nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("consumible")){
            Consumible cons = new Consumible(id, nombre, marca, presentacion, contenido, localizacion, disponibilidad);
            ManejoBasesDatos.insertarConsumible(cons);
             url="exito.jsp";
        //si es equipo, hago un equipo nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("equipo")){
            Equipo  eq = new Equipo(id, nombre, marca, inventario, localizacion, disponibilidad);
            ManejoBasesDatos.insertarEquipo(eq);
             url="exito.jsp";
        //si es profesor, hago un profesor nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("profesor")){
            Profesor profe = new Profesor(nombre, correo);
            ManejoBasesDatos.insertarProfe(profe);
            url="exito.jsp";
        //si es lab, hago un lab nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("laboratorio")){
            Laboratorio lab = new Laboratorio(nombre, clave);
            ManejoBasesDatos.insertarLab(lab);
             url="exito.jsp";
        }
         RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
       
        
        
        /*if(tipo.equals("Profesor")){
            //guardar base de datos de material y equipo
            if(ManejoBasesDatos.insertarProfe(forma1)){
                url= "exito.jsp";
            }
        }else if(tipo.equals("Profesor2")){
            //consumibles
            if(ManejoBasesDatos.insertarProfe2(forma1)){
                url= "exito.jsp";
            }
        }else if(tipo.equals("Profesor3")){
            //reactivos
            if(ManejoBasesDatos.insertarProfe3(forma1)){
                url= "exito.jsp";
            }
        }else if(tipo.equals("Alumno")){
            //material
            if(ManejoBasesDatos.insertarAlumno(forma1)){
                url= "exito.jsp";
            }
        }else if(tipo.equals("Alumno2")){
            //consumibles
            if(ManejoBasesDatos.insertarAlumno2(forma1)){
                url= "exito.jsp";
            }
        }else{
            url = "/error.jsp";
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        processRequest(request, response);
        
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
