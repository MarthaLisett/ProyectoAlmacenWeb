<%-- 

/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar Usuarios</title>
        <link href="style/tablasFormas.css" rel="stylesheet" type="text/css"/>
        
<!--
RESPONSTABLE 2.0 by jordyvanraaij
  Designed mobile first!
If you like this solution, you might also want to check out the 1.0 version:
  https://gist.github.com/jordyvanraaij/9069194
-->
    </head>
    <body>
        <h1>Borrar Usuarios</h1>
    <form action="ControladorInventario">
        <table class="responstable">
            <tr>
                <th>Matrícula</th>
                <th>Eliminar</th>
            </tr>
              <%
                String[] usuarios = (String[])request.getAttribute("usuarios");
                
                for(String usuario : usuarios) {
                    out.println("<form action=\"ControladorInventario\">");
                    out.println("<tr>");
                    out.print("<td>" + usuario + "</td>");
                    out.println("<td><button type=\"submit\">Eliminar</button></td>");
                    out.println("</tr>");
                    
                    //out.println("<tr>");
                    //out.println("<td><input name=\"matricula\" value=\"" +  usuario  + " \"> </td>");
                    //out.println("<td><button type=\"submit\">Eliminar</button></td>");
                    //out.println("</tr>");
                    out.println("<input type=\"hidden\"  name=\"matricula\" value=\"" +  usuario  + "\">");
                    out.println("<input type=\"hidden\"  name=\"tipo\" value=\"eliminar\">");
                    out.println("</form>");
                }
            %>
        </table>
    </form>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html>
