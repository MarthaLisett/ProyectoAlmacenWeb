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
        <h1>Articulos por prestar</h1>
    <form action="ControladorInventario">
        <table>
            <tr>
                <th>Matricula</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Correo</th>
                <th>Lab</th>
                <th>Profesor</th>
                <th>Articulo Rentado</th>
                <th>Cantidad</th>
                <th>Capacidad</th>
                <th>Marca</th>
                <th>Observaciones</th>
                <th>Fecha</th>
                <th>Numero de vale</th>
                <th>Localización</th>
            </tr>
            <tr>
                <td name ="matricula" >A01280126</td>
                <td name ="nombre" >Pedro</td>
                <td namme = "apellido">Esparza</td>
                <td namme = "correo">Esparza</td>
                <td namme = "lab">Esparza</td>
                <td namme = "profesor">Esparza</td>
                <td name = "descripcion">Matraz</td>
                <td name ="cantidad">1</td>
                <td namme = "capacidad">Esparza</td>
                <td namme = "marca">Esparza</td>
                <td namme = "obs">Esparza</td>
                <td name = "fecha">16/11/2016</td>
                <td name = "vale">3</td>
                <td name="loc">Estante 1</td>
                <td name = "regresado"><button type="Submit" onclick="alert('Se a regresado')">Regresado</button></td>
                <td name = "destruido"><button type="Submit" onclick="alert('Se a roto')">Destruido</button></td>
            </tr>
        </table>
    </body>
</html>
