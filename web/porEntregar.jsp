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
    <form action="ControladorInventario">
        
        <table>
       
        </table>
        <table>
            <tr>
                <th>Matricula</th>
                <th>Fecha</th>
                <th>Numero de vale</th>
                <th>Correo</th>
                <th>Localización</th>
                <th>Nombre</th>
                <th>Capacidad</th>
                <th>Marca</th>
                <th>Cantidad</th>
                <th>Status</th>
                <th>Observaciones</th>
            </tr>
              <%
                String[][] pedidos = (String[][])request.getAttribute("pedidos");
                for(String[] elements : pedidos) {
                    out.println("</tr>");
                    for(String innerElements : elements) {
                        out.print("<td text>" + innerElements + "</td>");
                    }
                    out.println("</tr>");
                }   
            %>
        </table>
    </body>
</html>