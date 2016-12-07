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
import informacion.Consumible;
import informacion.Equipo;
import informacion.Forma;
import informacion.Laboratorio;
import informacion.Material;
import informacion.Profesor;
import informacion.Reactivo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorInventario extends HttpServlet {

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

        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        
        

        String matricula = request.getParameter("matricula");
        String marca = request.getParameter("marca");
        String presentacion = request.getParameter("presentacion");
        String contenido = request.getParameter("contenido");
        String localizacion = request.getParameter("localizacion");
        String disponibilidad = request.getParameter("disponibilidad");
        String inventario = request.getParameter("inventario");
        String clave = request.getParameter("clave");
        String correo = request.getParameter("correo");
        String capacidad = request.getParameter("capacidad");
        String tipo = request.getParameter("tipo");
        String observaciones = request.getParameter("observaciones");
        String cantidad = request.getParameter("cantidad");
        String status = request.getParameter("status");
        String fecha = request.getParameter("fecha");
        String profe = request.getParameter("profesor");
        
        String estado = request.getParameter("estado");
        String seleccionado = request.getParameter("seleccionado");
        String botonSeleccionado = "";
        
        if(request.getParameter("submit") != null) {
            botonSeleccionado = request.getParameter("submit");
        }

        id = "1";
        //url de que algo fallo
        String url="/error.jsp";
        //si es material, hago un material nuevo, lo inserto en la base de datos y su un exito
        if(botonSeleccionado.equals("cancelar") && !tipo.equals("checar")) {
             url="/exito.jsp";
             ManejoBasesDatos.cancelarPedido(descripcion);
        } else if(tipo.equals("material")){
            Material mat = new Material("1", nombre, marca, localizacion, capacidad, disponibilidad);
            if(ManejoBasesDatos.insertarMaterial(mat))
             url="/exito.jsp";
        //si es reactivo, hago un reactivo nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("reactivo")){
            Reactivo reac = new Reactivo(id, nombre, marca, presentacion, contenido, localizacion, disponibilidad);
            if(ManejoBasesDatos.insertarReactivo(reac))
             url="/exito.jsp";
        //si es consumible, hago un consumible nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("consumible")){
            Consumible cons = new Consumible(id, nombre, marca, presentacion, contenido, localizacion, disponibilidad);
            if(ManejoBasesDatos.insertarConsumible(cons))
             url="/exito.jsp";
        //si es equipo, hago un equipo nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("equipo")){
            Equipo  eq = new Equipo(id, nombre, marca, inventario, localizacion, disponibilidad);
            if(ManejoBasesDatos.insertarEquipo(eq))
             url="/exito.jsp";        
        //si es lab, hago un lab nuevo, lo inserto en la base de datos y su un exito
        }else if(tipo.equals("laboratorio")) {
            Laboratorio lab = new Laboratorio(nombre, clave);
            if(ManejoBasesDatos.insertarLab(lab))
             url="/exito.jsp";
        } else if(tipo.equals("prestado")) {
            
            Forma forma1 = new Forma("1", fecha, "1", matricula, correo, localizacion, profe, descripcion, 
                    capacidad, marca, cantidad, status, observaciones, localizacion);
            
            ManejoBasesDatos.insertarPrestado(forma1);
            
            String tabla = ManejoBasesDatos.buscar(descripcion);
            ManejoBasesDatos.modif(forma1, tabla, "resta");
            ManejoBasesDatos.eliminar(seleccionado);
            url = "/exito.jsp";
            
        } else if(tipo.equals("devuelto")) {
            Forma forma = new Forma("1", fecha, "1", matricula, correo, localizacion, profe, descripcion, 
                    capacidad, marca, cantidad, status, observaciones, localizacion);
             String tabla = ManejoBasesDatos.buscar(descripcion);
             
             if(estado.equals("devuelto")) {
                 ManejoBasesDatos.modif(forma, tabla, "suma");
             }
            ManejoBasesDatos.eliminarDevueltos(seleccionado);
            ManejoBasesDatos.insertarReporte(forma);
            url = "/exito.jsp";

        } else if (tipo.equals("eliminar")) {
            ManejoBasesDatos.eliminarUsuario(matricula);
            url = "/exito.jsp";
        } 
        
        if (!tipo.equals("checar")) {
           RequestDispatcher dispatcher
                   = getServletContext().getRequestDispatcher(url);
           dispatcher.forward(request, response);
           
        } else {
            String[] data2 = ManejoBasesDatos.checarCantidades();
            StringBuilder resultado = new StringBuilder();
            for (String data21 : data2) {
                resultado.append(data21);
                resultado.append("\n");
            }
            response.getWriter().write(resultado.toString());
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
