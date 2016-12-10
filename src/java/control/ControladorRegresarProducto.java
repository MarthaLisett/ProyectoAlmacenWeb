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

public class ControladorRegresarProducto extends HttpServlet {
    // variables
    private String descripcion;
    private String matricula;
    private String marca;
    private String localizacion;
    private String correo;
    private String capacidad;
    private String observaciones;
    private String cantidad;
    private String status;
    private String fecha;
    private String profe;
    private String seleccionado;
    private String estado;
    private String tabla;
    private Forma  forma;
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
        
        response.setContentType( "text/html; charset=iso-8859-1" );
        
        descripcion     = request.getParameter("descripcion");
        matricula       = request.getParameter("matricula");
        marca           = request.getParameter("marca");
        localizacion    = request.getParameter("localizacion");
        correo          = request.getParameter("correo");
        capacidad       = request.getParameter("capacidad");
        observaciones   = request.getParameter("observaciones");
        cantidad        = request.getParameter("cantidad");
        status          = request.getParameter("status");
        fecha           = request.getParameter("fecha");
        profe           = request.getParameter("profesor");
        seleccionado    = request.getParameter("seleccionado");
        estado          = request.getParameter("estado");
        tabla           = ManejoBasesDatos.buscar(descripcion);
        forma           = new Forma("1", fecha, "1", matricula, correo,
                localizacion, profe, descripcion, capacidad, marca, cantidad,
                status, observaciones, localizacion);
        
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(
                        modificarBase(estado, tabla, forma));
        dispatcher.forward(request, response);
    }
    
     /**
     * modificarBase
     * 
     * valida todas las consultas a la base de datos
     * 
     * @param estado estado de dvolucion
     * @param tabla tabla a editar
     * @param forma forma con los datos para registrar en el reporte general
     * 
     * @return url para saber si la ejecucion tuvo exito o no 
     */
    public String modificarBase(String estado, String tabla, Forma forma) {
      switch (estado) {
            case "devuelto":
                if(ManejoBasesDatos.modif(forma, tabla, "suma")) {
                    if(ManejoBasesDatos.eliminarDevueltos(seleccionado)) {
                        if(ManejoBasesDatos.insertarReporte(forma)) {
                            return "/exito.jsp";
                        } else {
                            return "/error.jsp";
                        }
                    } else {
                        return "/error.jsp";
                    }
                } else {
                    return"/error.jsp";
                }
            case "roto":
                if(ManejoBasesDatos.eliminarDevueltos(seleccionado)) {
                    if(ManejoBasesDatos.insertarReporte(forma)) {
                        return "/exito.jsp";
                    } else {
                        return "/error.jsp";
                    }
                } else {
                    return"/error.jsp";
                }
            default:
                return "/error.jsp";
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
