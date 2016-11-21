<%-- 
    Document   : porEntregar
    Created on : 16/11/2016, 09:21:04 AM
    Author     : Pedro
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
        <h1>Artículos por Entregar</h1>
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
            </tr>
            </table>
              <%
                String[][] pedidos = (String[][])request.getAttribute("pedidos");
                
                for(String[] elements : pedidos) {
                   
                    out.println("<form action=\"ControladorInventario\">");
                    out.println("<table>");
                    out.println("<tr>");
                    for(String innerElements : elements) {
                        out.print("<td>" + innerElements + "</td>");
                    }
                    out.println("<td><button type=\"submit\">Autorizar</button></td>");

                    out.println("</tr>");
                    out.println("</table>");
                    out.println("<input type=\"hidden\"  name=\"matricula\" value=\"" +  elements[0]  + "\">");
                    out.println("<input type=\"hidden\"  name=\"tipo\" value=\"prestado\">");
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
        
       
    </form>
    </body>
</html>
