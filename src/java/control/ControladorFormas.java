/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import informacion.Usuario;
import basesDatos.ManejoBasesDatos;
import static basesDatos.ManejoBasesDatos.insertarProfe;
import informacion.Forma;
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
public class ControladorFormas extends HttpServlet {

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
        String fecha = request.getParameter("fecha");
        String vale = request.getParameter("vale");
        String usuario = request.getParameter("usuario");
        String correo = request.getParameter("correo");
        String claveLab = request.getParameter("lab");
        String profe = request.getParameter("profe");
        String descripcion = request.getParameter("desc");
        String capacidad = request.getParameter("cap");
        String marca = request.getParameter("marca");
        String cantidad = request.getParameter("cant");
        String status = request.getParameter("status");
        String observaciones = request.getParameter("observ");
        String localizacion = request.getParameter("local");
        String tipo = request.getParameter("tipo");
        
        Forma forma1 = new Forma(fecha, vale, usuario, correo, claveLab, profe, descripcion,
         capacidad, marca, cantidad, status, observaciones, localizacion);
        String url="";
        if(tipo.equals("Profesor")){
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
        }
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
