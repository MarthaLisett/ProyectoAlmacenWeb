<%-- 
    Document   : Informacion
    Created on : Oct 30, 2016, 9:33:21 PM
    Author     : MarthaLisett
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
            Matricula: <input type="text" id="matricula" name="matricula" value="<%= usuario.getMatricula() %>"><br>
            Nombre: <input type="text" id="nombre" name="nombre" value="<%= usuario.getNombre() %>"><br>
            Apellido Paterno: <input type="text" id="apellidoPat" name="paterno" value="<%= usuario.getApellidoPaterno() %>"><br>
            Apellido Materno: <input type="text" id="apellidoMat" name="materno" value="<%= usuario.getApellidoMaterno() %>"><br>
            Email: <input type="text" id="correo" name="correo" value="<%= usuario.getCorreo() %>"><br>
        </form>
    </body>
</html>
