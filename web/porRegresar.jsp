<%-- 
<<<<<<< HEAD
    Document   : porEntregar
    Created on : 16/11/2016, 09:21:04 AM
    Author     : Pedro
=======
/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
>>>>>>> 248b60f1ec697d6499746e1528dd2f406c1fd226
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artículos por Entregar</title>
        
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
        <h1>Artículos por Devolver</h1>
    <form action="ControladorInventario">
        <table class="responstable">
            <tr>
                <th>Matrícula</th>
                <th>Fecha</th>
                <th>Vale</th>
                <th>Correo</th>
                <th>Localización</th>
                <th>Nombre</th>
                <th>Capacidad</th>
                <th>Marca</th>
                <th>Cantidad</th>
                <th>Status</th>
                <th>Observaciones</th>
<<<<<<< HEAD
=======
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
                <td name = "regresado"><button type="Submit" 
                                               onclick="alert('Se ha regresado')">
                        Regresado</button></td>
                <td name = "destruido"><button type="Submit" 
                                               onclick="alert('Se ha roto')">
                        Destruido</button></td>
>>>>>>> 248b60f1ec697d6499746e1528dd2f406c1fd226
            </tr>
              <%
                String[][] prestado = (String[][])request.getAttribute("prestados");
                
                for(String[] elements : prestado) {
                   
                    out.println("<form action=\"ControladorInventario\">");
                    out.println("<tr>");
                    for(String innerElements : elements) {
                        out.print("<td>" + innerElements + "</td>");
                    }
                    out.println("<td><input type=\"radio\" name=\"estado\" value=\"roto\">Roto/Consumible<br><input type=\"radio\" name=\"estado\" value=\"devuelto\">Devuelto<br></td>");
                    out.println("<td><button type=\"submit\">Devolver</button></td>");
                    out.println("</tr>");
                    out.println("<input type=\"hidden\"  name=\"matricula\" value=\"" +  elements[0]  + "\">");
                    out.println("<input type=\"hidden\"  name=\"tipo\" value=\"devuelto\">");
                    out.println("<input type=\"hidden\"  name=\"descripcion\" value=\"" +  elements[5]  + "\">");
                    out.println("<input type=\"hidden\"  name=\"fecha\" value=\"" +  elements[1]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"seleccionado\" value=\"" +  elements[2]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"correo\" value=\"" +  elements[3]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"localizacion\" value=\"" +  elements[4]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"capacidad\" value=\"" +  elements[6]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"marca\" value=\"" +  elements[7]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"cantidad\" value=\"" +  elements[8]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"status\" value=\"prestado\">");
                    out.println("<input type=\"hidden\"  name=\"observaciones\" value=\"" +  elements[10]  +  "\">");
                    out.println("</form>");
                }
            %>
        </table>
       
    </form>
    </body>
</html>
