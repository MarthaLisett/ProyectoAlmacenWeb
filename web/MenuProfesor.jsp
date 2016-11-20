<%-- 
    Document   : MenuProfesor
    Created on : 16/11/2016, 09:17:45 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h1>Menu principal Profesor</h1>

<table border="1" cellspacing="10">
<tr>

<td>
<form action="ControladorLlenado" name="someForm">
<a href="#" onclick="document.someForm.submit();"><img src="imagenes/rentaEquipo.JPG" alt="Rentar equipo" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
<input type="hidden" name="destino" value="prestamoProfeEquipo.jsp">
</form>
</td>

<td>
<form action="ControladorLlenado" name="someForm2">
<a href="#" onclick="document.someForm2.submit();"><img src="" alt="Rentar consumibles" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
<input type="hidden" name="destino" value="prestamoProfeCons.jsp">
</form>
</td>

<td>
<form action="ControladorLlenado" name="someForm3">
<a href="#" onclick="document.someForm3.submit();"><img src="imagenes/rentarReacctivos.JPG" alt="Rentar reactivos" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
<input type="hidden" name="destino" value="prestamoProfeReact.jsp">
</form>
</td>

<td>
<form action="ControladorLlenado" name="someForm4">
<a href="#" onclick="document.someForm4.submit();"><img src="imagenes/rentaMaterial.JPG" alt="Rentar material" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
<input type="hidden" name="destino" value="prestamoProfeMaterial.jsp">
</form>
</td>

<td>
<form action="ControladorLlenado" name="someForm5">
<a href="index.html" onclick="document.someForm5.submit();"><img src="" alt="Cancelar Pedido" style="width:304px;height:228px;">
<input type="hidden" name="usuario" value="${usuario.getMatricula()}">
</form>
</td>
</tr>

</table>



</body>
</html>