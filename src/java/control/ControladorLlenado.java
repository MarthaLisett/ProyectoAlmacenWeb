/*
* Proyecto Desarrollo de Aplicaciones Web
* José González Ayerdi A01036121
* Pedro Mauricio Esparza García A01280126
* Martha Lisett Benavides Martínez A01280115
* Adrián Martínez Quiroga A01280252
* 21 Noviembre 2016
*/
package control;

import informacion.Usuario;
import basesDatos.ManejoBasesDatos;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class ControladorLlenado extends HttpServlet {
    // variables
    private String   url;
    private String   matricula;
    private String   destino;
    private String   datos;
    private String[] partes;
    private Date     fechaActual;
    private String   fechaConFormato;
    private Usuario  usuario;
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
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException,
            SQLException {
        matricula       = request.getParameter("usuario");
        destino         = request.getParameter("destino");
        datos           = ManejoBasesDatos.obtenerDatos(matricula).toString();
        partes          = datos.split("-");
        url             = "/" + destino;
        fechaActual     = new Date();
        usuario         = new Usuario(matricula);
        fechaConFormato = new
                SimpleDateFormat("yyyy-MM-dd',' HH:mm").format(fechaActual);
        
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
