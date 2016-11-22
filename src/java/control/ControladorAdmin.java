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
import informacion.Forma;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorAdmin extends HttpServlet {

    /**
     * processRequest
     * 
     * Manda al usuario a la página correspondiente de acuerdo a la opción
     * del menú a la que accedió.
     *
     * @param request es la petición que se hace al servlet, mandando al usuario
     * a la página correspondiente dependiendo del botón al que dio clic.
     * @param response es la respuesta que se recibe del servlet de acuerdo
     * a la página solicitada
     * @throws ServletException cuando ocurre un error de servlet
     * @throws IOException cuando ocurre un error de input/output
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        String url = "";
        
        String[][] pedidos = ManejoBasesDatos.leerPedidos();
        
        String[][] prestados = ManejoBasesDatos.leerPrestados();
        String[] usuarios = ManejoBasesDatos.leerUsuarios();

        System.out.println("PEDIDOS");
        String destino = request.getParameter("destino");
        
        url = "/" + destino;
        request.setAttribute("prestados", prestados);
        request.setAttribute("usuarios", usuarios);
        request.setAttribute("pedidos", pedidos);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse 
            response) throws ServletException, IOException {
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
