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
     * processRequest
     * 
     * Manda los datos de la forma y envía al usuario a la página de éxito
     * si funcionó o la página de fallo si hubo un error.
     *
     * @param request es la petición que se hace al servlet, recibiendo los
     * datos de la forma que el usuario llenó
     * @param response es la respuesta que se recibe del servlet de acuerdo
     * a si llenó bien la forma o no.
     * @throws ServletException cuando ocurre un error de servlet
     * @throws IOException cuando ocurre un error de input/output
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        //tomo todos los valores que puede haber en una forma
        String fecha = request.getParameter("fecha");
        String usuario = request.getParameter("matricula");
        String correo = request.getParameter("correo");
        String claveLab = request.getParameter("laboratorio");
        String profe = request.getParameter("profesor");
        // TODO: modificar sistema de id
        String cantidad = request.getParameter("cantidad");
        String descripcion = request.getParameter("descripcion");
        String capacidad = request.getParameter("capacidad");
        String marca = request.getParameter("marca");
        String status = request.getParameter("status");
        String observaciones = request.getParameter("observaciones");
        String localizacion = ManejoBasesDatos.buscaLocalizacion(descripcion);
        
        
        //creo la forma con los valores
        Forma forma1 = new Forma("1", fecha, "1", usuario, correo, claveLab, 
                profe, descripcion, capacidad, marca, cantidad, status, 
                observaciones, localizacion);
        //creo el url de que algo salio mal
        String url="fallo.jsp";
       
        //si se puede modificar la base de datos
        if(ManejoBasesDatos.insertarPedido(forma1)){
            //inserto la forma en el registro de pedidos
        //el url es ahora de exito
             url="exito.jsp";
        }    
        url = "/exito.jsp";
        //me voy al url
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);   
    }

    /**
     * doGet
     * 
     * Maneja el método <code>GET</code> de HTTP.
     *
     * @param request es la petición que se hace al servlet
     * @param response es la respuesta que se recibe del servlet
     * @throws ServletException cuando ocurre un error de servlet
     * @throws IOException cuando ocurre un error de input/output
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse 
            response) throws ServletException, IOException {
        processRequest(request, response);    
    }

    /**
     * doPost
     * 
     * Maneja el método <code>POST</code> de HTTP.
     *
     * @param request es la petición que se hace al servlet
     * @param response es la respuesta que se recibe del servlet
     * @throws ServletException cuando ocurre un error de servlet
     * @throws IOException cuando ocurre un error de input/output
     */
    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * getServletInfo
     * 
     * Regresa una descripción corta del servlet
     *
     * @return una string con la descripción del servlet
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
