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
        <h1>Artículos por Devolver</h1>
    <form action="ControladorInventario">
        <table class="responstable">
            <tr>
                <th>Matrícula</th>
            </tr>
              <%
                String[] usuarios = (String[])request.getAttribute("usuarios");
                
                for(String usuario : usuarios) {
                   
                    out.println("<form action=\"ControladorInventario\">");
                    out.println("<tr>");
                    out.println("<td><input name=\"matricula\" value=\"" +  usuario  + "\"> </td>");
                    out.println("<td><button type=\"submit\">Eliminar</button></td>");
                    out.println("</tr>");
                    out.println("<input type=\"hidden\"  name=\"tipo\" value=\"eliminar\">");
                    out.println("</form>");
                }
            %>
        </table>
       
    </form>
    </body>
</html>
