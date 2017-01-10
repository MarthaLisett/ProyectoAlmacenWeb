/*
* Proyecto Desarrollo de Aplicaciones Web
* José González Ayerdi A01036121
* Pedro Mauricio Esparza García A01280126
* Martha Lisett Benavides Martínez A01280115
* Adrián Martínez Quiroga A01280252
* 21 Noviembre 2016
*/
package control;

import basesDatos.ManejoBasesDatos;
import informacion.Forma;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorFormas extends HttpServlet {
    // variables
    private String fecha;
    private String usuario;
    private String correo;
    private String claveLab;
    private String profe;
    private String cantidad;
    private String descripcion;
    private String capacidad;
    private String marca;
    private String status;
    private String observaciones;
    private String localizacion;
    private Forma forma;
    private String url;
    //creo la forma con los valores
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
        fecha         = request.getParameter("fecha");
        usuario       = request.getParameter("matricula");
        correo        = request.getParameter("correo");
        claveLab      = request.getParameter("laboratorio");
        profe         = request.getParameter("profesor");
        cantidad      = request.getParameter("cantidad");
        descripcion   = request.getParameter("descripcion");
        capacidad     = request.getParameter("capacidad");
        marca         = request.getParameter("marca");
        status        = request.getParameter("status");
        observaciones = request.getParameter("observaciones");
        localizacion  = ManejoBasesDatos.buscaLocalizacion(descripcion);
        forma         = new Forma("1", fecha, "1", usuario, correo, claveLab,
                profe, descripcion, capacidad, marca, cantidad, status,
                observaciones, localizacion);
        //si se puede modificar la base de datos
        if(ManejoBasesDatos.insertarPedido(forma)){
            url = "/exito.jsp";
        } else {
            url = "/error.jsp";
        }
        // me voy al url
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
