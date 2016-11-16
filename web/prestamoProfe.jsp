<%-- 
    Document   : prestamosAlumno
    Created on : 2/11/2016, 08:41:42 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body bgcolor="gray">
    <h1> Prestamos de Material y Equipo a Profesores</h1>
<form>
<table border="1" bgcolor="red">
<tr>
<td> <input type="text" name="fecha" placeholder="Fecha">
</td>
<td>  <input type="text" name="vale" placeholder="Vale">
</td>
  </tr>
</table>
<table border="1" bgcolor="red">
<tr>
<td> <input type="text" name="usuario" placeholder="Usuario">
</td>
<td>  <input type="text" name="correo" placeholder="Correo">
</td>
<td>  <input type="text" name="lab" placeholder="Laboratorio">
</td>
</tr>
</table>
<table border="1" bgcolor="red">
<tr>
<td>  <input type="text" name="id" placeholder="ID">
</td></td><td><textarea name="desc" placeholder="Descripcion" size="80" rows="5"></textarea></td>
<td>  <input type="text" name="cap" placeholder="Capacidad">
</td>
<td>  <input type="text" name="marca" placeholder="Marca">
</td>
<td>  <input type="text" name="cant" placeholder="Cantidad">
</td>
<td>  <input type="text" name="estatus" value="prestamo" >
</td>
</tr>
</table>
<table border="1" bgcolor="red">
<tr>
<td><textarea name="observ" placeholder="Observaciones" size="80" rows="5"></textarea></td>
<tr>
</table>
    <button type="button" onclick="alert('Se a agregado el prestamos')">Agregar</button>
</form>
</body>
</html>
