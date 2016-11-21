<%-- 
/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Información del Usuario</title>
    </head>
    <body>
        <h1>Información Ingresada</h1>
        <%@ page import="informacion.Usuario" %>
        <% Usuario usuario = (Usuario) request.getAttribute("usuario"); %>
        <form>
            Matricula: <input type="text" id="matricula" name="matricula" 
                              value="<%= usuario.getMatricula() %>"><br>
            Nombre: <input type="text" id="nombre" name="nombre" 
                           value="<%= usuario.getNombre() %>"><br>
            Apellido Paterno: <input type="text" id="apellidoPat" name="paterno" 
                                     value="<%= usuario.getApellidoPaterno()%>">
            <br>
            Apellido Materno: <input type="text" id="apellidoMat" name="materno" 
                                     value="<%= usuario.getApellidoMaterno()%>">
            <br>
            Email: <input type="text" id="correo" name="correo" 
                          value="<%= usuario.getCorreo()%>"><br>
        </form>
    </body>
</html>
