<%-- 
    Document   : porRegresar
    Created on : 16/11/2016, 09:21:04 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Borrar Usuarios</h1>
        <table>
            <tr>
                <th>Matricula</th>
                <th>Nombre</th>
                <th>Apellido Materno</th>
                <th>Apellido Paterno</th>
                <th>Correo</th>
            </tr>
            <tr>
                <td><input type="text" name="iD" placeholder="Matricula"></td>
                <td><input type="text" name="name" placeholder="Nombre"></td>
                <td><input type="text" name="apellidoPat" placeholder="Apellido Paterno"></td>
                <td><input type="text" name="apellidoMat" placeholder="Apellido Materno"></td>
                <td><input type="text" name="correo" placeholder="Correo"></td>
            </tr>
        </table>
          <button type="button" onclick="alert('Se a agregado el usuario')">Agregar</button>           
    </body>
</html>
