<%-- 
    Document   : MenuAlumno
    Created on : 16/11/2016, 09:17:38 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1>Menu principal Alumno</h1>
<table border="1" cellspacing="10">
<tr>
<td><a href="controladorLlenado"></td>

<p>El usuario es: ${usuario.getMatricula()} </p>

<form action="ControladorLlenado" name="someForm">
<a href="#" onclick="document.someForm.submit();"><img src="imagenes/rentaMaterial.JPG" alt="Rentar equipo y material" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
<input type="hidden" name="destino" value="prestamosAlumno.jsp">
</form>


<form action="ControladorLlenado" name="someForm2">
<a href="#" onclick="document.someForm2.submit();"><img src="imagenes/rentaEquipo.JPG" alt="Rentar equipo y material" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
<input type="hidden" name="destino" value="prestamosAlumnoCons.jsp"> 
</form>

</tr>
</table>
</body>
</html>
