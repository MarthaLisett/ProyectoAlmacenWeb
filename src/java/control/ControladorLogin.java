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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorLogin extends HttpServlet {
    // variables
    private String  url;
    private String  matricula;
    private Usuario usuario;
    private String  matPrimerCaracter;
    private String entra = "";
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
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException,
            SQLException {
        // pasar matricula a letras minusculas para hacer la busqueda
        matricula = request.getParameter("matricula").toLowerCase();
        usuario   = new Usuario(matricula);

        // revisar si el usuario existe
        if (ManejoBasesDatos.existe(usuario)){
            url = urlTipoUsuario(usuario);
        } else {
            url = "/index.html";
        }
        Cookie userIdCookie = new Cookie("entra", entra);
        userIdCookie.setMaxAge(60*60*24);
        userIdCookie.setPath("/");
        response.addCookie(userIdCookie); 
        request.setAttribute("usuario", usuario);
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
     /**
     * urlTipoUsuario
     * 
     * Revisa el tipo de usuario y regresa la pagina correspondiente.
     * 
     * @param usuario es el objeto usuario para obtener la matricula.
     * @return string con la pagina que corresponde al tipo de usuario ingresado.
     */
    public String urlTipoUsuario(Usuario usuario) {
        matPrimerCaracter = usuario.getMatricula().substring(0,1).toLowerCase();
        String real = ManejoBasesDatos.regresarAdmin();
        if (usuario.getMatricula().equals(real)){
            entra = "admin";
            return "/MenuAdmin.jsp";
        } else {
            switch(matPrimerCaracter) {
                case "a":
                   return "/MenuAlumno.jsp";
                case "l":
                    return "/MenuProfesor.jsp";
                default:
                    return "/index.html";
            }
        }
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
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE,
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
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE,
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
