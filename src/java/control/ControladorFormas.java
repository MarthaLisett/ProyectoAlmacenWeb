/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import informacion.Usuario;
import basesDatos.ManejoBasesDatos;
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
        //tomo todos los valores que puede hbaer en una forma
        String fecha = request.getParameter("fecha");
        String vale = request.getParameter("vale");
        String usuario = request.getParameter("usuario");
        String correo = request.getParameter("correo");
        String claveLab = request.getParameter("lab");
        String profe = request.getParameter("profe");
        
        // TODO: modificar sistema de id
        String id = request.getParameter("id");
        String cantidad = request.getParameter("cantidad2");
        String descripcion = request.getParameter("descripcion1");
        
        String capacidad = request.getParameter("cap");
        String marca = request.getParameter("marca");
        String status = request.getParameter("status");
        String observaciones = request.getParameter("observ");
        String localizacion = request.getParameter("local");
        String tipo = request.getParameter("tipo");
        
        //creo la forma con los valores
        Forma forma1 = new Forma("1", fecha, vale, usuario, correo, claveLab, profe, descripcion,
         capacidad, marca, cantidad, status, observaciones, localizacion);
        //creo el url de que algo salio mal
        String url="fallo.jsp";
        //si se puede modificar la base de datos
        if(ManejoBasesDatos.modif(forma1, tipo)){
            //inserto la forma en el registro de pedidos
            ManejoBasesDatos.insertarPedido(forma1);
        //el url es ahora de exito
             url="exito.jsp";
        }
        
        url = "/exito.jsp";
        //me voy al url
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
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
