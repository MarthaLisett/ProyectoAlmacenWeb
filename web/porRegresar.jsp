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
        <title>Artículos por Regresar</title>
        <!--
RESPONSTABLE 2.0 by jordyvanraaij
  Designed mobile first!
If you like this solution, you might also want to check out the 1.0 version:
  https://gist.github.com/jordyvanraaij/9069194
-->
<style>
.responstable {
  margin: 1em 0;
  width: 100%;
  overflow: hidden;
  background: #FFF;
  color: black;
  border-radius: 5px;
  border: 1px solid black;
}
.responstable tr {
  border: 1px solid black;
}
.responstable tr:nth-child(odd) {
  background-color: #F2F2F2;
}
.responstable th {
  display: none;
  background-color: #848484;
  color: #FFF;
}
.responstable th:first-child {
  display: table-cell;
  text-align: center;
}
.responstable th:nth-child(2) {
  display: table-cell;
}
.responstable th:nth-child(2) span {
  display: none;
}
.responstable th:nth-child(2):after {
  content: attr(data-th);
}
@media (min-width: 480px) {
  .responstable th:nth-child(2) span {
    display: block;
  }
  .responstable th:nth-child(2):after {
    display: none;
  }
}
.responstable td {
  display: block;
  word-wrap: break-word;
  max-width: 7em;
}
.responstable td:first-child {
  display: table-cell;
  text-align: center;
}
@media (min-width: 480px) {
  .responstable td {
  }
}
.responstable td {
  text-align: center;
  margin: .5em .5em;
}
@media (min-width: 480px) {
  .responstable th, .responstable td {
    display: table-cell;
    padding: .5em;
  }
}
body {
  padding: 0 2em;
  font-family: Arial, sans-serif;
  color: #024457;
  background: #E0E6F8;
}
h1 {
  background-color:#848484;
  height:50px;
  padding-top: 10px; 
  color:#FFFFFF;
  border-radius: 10px;
  font-family: "Roboto", sans-serif;
  text-align: center;
  font-weight: normal;
}
h1 span {
  color: #167F92;
}
th, td{
    align: center;
    font-size: .9vw;
}
</style>
    </head>
    <body>
        <h1>Artículos por Regresar</h1>
    <form action="ControladorInventario">
        <table class="responstable">
            <tr>
                <th>Matrícula</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Correo</th>
                <th>Laboratorio</th>
                <th>Profesor</th>
                <th>Artículo Rentado</th>
                <th>Cantidad</th>
                <th>Capacidad</th>
                <th>Marca</th>
                <th>Observaciones</th>
                <th>Fecha</th>
                <th>Número de Vale</th>
                <th>Localización</th>
                <th>Regresado</th>
                <th>Destruido</th>
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
                <td name = "regresado"><button type="Submit" onclick="alert('Se ha regresado')">Regresado</button></td>
                <td name = "destruido"><button type="Submit" onclick="alert('Se ha roto')">Destruido</button></td>
            </tr>
        </table>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html>