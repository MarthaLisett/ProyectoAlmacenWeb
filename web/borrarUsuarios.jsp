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
                <th>Apellido</th>
                <th>Articulo Rentado</th>
                <th>Cantidad</th>
                <th>Fecha</th>
                <th>Numero de vale</th>
                <th>Eliminar</th>
            </tr>
            <tr>
                <td>A01280126</td>
                <td>Pedro</td>
                <td>Esparza</td>
                <td>Matraz</td>
                <td>1</td>
                <td>16/11/2016</td>
                <td>3</td>
                <td><input type="checkbox" ></button></td>
            </tr>
            <tr>
                <td>A01280115</td>
                <td>Martiwuis</td>
                <td>Benavides</td>
                <td>Tubo de ensayo</td>
                <td>3</td>
                <td>16/11/2016</td>
                <td>4</td>
                <td><input type="checkbox" ></button></td>               
            </tr>
        </table>
          <td><button type="button" onclick="alert('Se an eliminado los usuarios')">Eliminar</button></td>               
    </body>
</html>
