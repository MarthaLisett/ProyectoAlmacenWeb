/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import informacion.Usuario;
import basesDatos.ManejoBasesDatos;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author MarthaLisett
 */
public class ControladorLlenado extends HttpServlet {

    /**
     * processRequest
     * 
     * Busca la matrícula del usuario en la base de datos y llena de forma
     * automática el nombre, correo y fecha actual en la forma.
     *
     * @param request es la petición que se hace al servlet, pidiendo los datos
     * del usuario en base a su matrícula
     * @param response es la respuesta que se recibe del servlet de acuerdo
     * al usuario solicitado.
     * @throws ServletException cuando ocurre un error de servlet
     * @throws IOException cuando ocurre un error de input/output
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException,
            SQLException {
        
        String url = "";
        
        String matricula = request.getParameter("usuario");
        String destino = request.getParameter("destino");
        
        System.out.println("hola mundo");
        String datos = ManejoBasesDatos.obtenerDatos(matricula).toString();

        String[] partes = datos.split("-");
   
        url = "/" + destino;
   
        Date fechaActual = new Date();
        String fechaConFormato = new 
        SimpleDateFormat("yyyy-MM-dd',' HH:mm").format(fechaActual);
        
        Usuario usuario = new Usuario(matricula);
        usuario.setNombre(partes[1]);
        usuario.setApellidoPaterno(partes[2]);
        usuario.setApellidoMaterno(partes[3]);
        usuario.setCorreo(partes[4]);
        
        request.setAttribute("usuario", usuario);
        request.setAttribute("fecha", fechaConFormato);
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
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLlenado.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControladorLlenado.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
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
