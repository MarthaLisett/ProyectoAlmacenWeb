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

public class ControladorAceptarPedido extends HttpServlet {
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
    private String url;
    private String seleccionado;
    private String botonPresionado;
    private Forma forma;
    
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
        botonPresionado = request.getParameter("submit");
        forma           = new Forma("1", fecha, "1", matricula, correo,
                localizacion, profe, descripcion, capacidad, marca, cantidad,
                status, observaciones, localizacion);
        
        if(botonPresionado.equals("cancelar")) {
            ManejoBasesDatos.cancelarPedido(descripcion);
            url = "/exito.jsp";
        } else {
            ManejoBasesDatos.insertarPrestado(forma);
            String tabla = ManejoBasesDatos.buscar(descripcion);
            ManejoBasesDatos.modif(forma, tabla, "resta");
            ManejoBasesDatos.eliminar(seleccionado);
            url = "/exito.jsp";
        }
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
