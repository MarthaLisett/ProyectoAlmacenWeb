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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MarthaLisett
 */
public class Controlador extends HttpServlet {
    /**
     * processRequest
     * 
     * Le da acceso al usuario dependiendo de qué tipo es: alumno, profesor
     * o administrador.
     *
     * @param request es la petición que se hace al servlet, mandando la
     * matrícula que se recibe del usuario.
     * @param response es la respuesta que se recibe del servlet de acuerdo
     * al usuario que se envio.
     * @throws ServletException cuando ocurre un error de servlet
     * @throws IOException cuando ocurre un error de input/output
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException, 
            SQLException {
        ManejoBasesDatos.iniciarConexion();
        String url = "";
        String matricula = request.getParameter("matricula");
         // Crear nuevo usuario
        matricula = matricula.toLowerCase();
        System.out.println(matricula);
        Usuario usuario = new Usuario(matricula.toLowerCase());

        if (ManejoBasesDatos.existe(usuario)){
           // Checar que tipo de usuario es para darle acceso
           String mat = usuario.getMatricula().substring(0,1);
           mat = mat.toLowerCase();
           if (usuario.getMatricula().equals("adminquimica")){
               url = "/MenuAdmin.jsp";
           }
           else {
            switch(mat) {
                case "a":
                    url = "/MenuAlumno.jsp";
                    break;
                case "l":
                    url = "/MenuProfesor.jsp";
                    break;
                    default:
                        url = "/index.html";
                    break;
            }
           }
        } else {
            url = "/index.html";
        }
       
        request.setAttribute("usuario", usuario);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, 
                    null, ex);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse 
            response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, 
                    null, ex);
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
