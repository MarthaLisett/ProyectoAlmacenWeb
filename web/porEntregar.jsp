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
        <title>JSP Page</title>
        
        <style>
             table, th, td {
             border: 1px solid black;
            }
        </style>
        
    </head>
    <body>
        <h1>Articulos por Entregar</h1>
        <table>
            <tr>
                <th>Matricula</th>
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