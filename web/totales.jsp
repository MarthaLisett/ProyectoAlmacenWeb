<%-- 
Referencia para el css = https://colorlib.com/wp/html5-and-css3-login-forms/
/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
--%>
<%
    Cookie[] cookies = request.getCookies();
    String cookieName = "entra";
    String cookieValue = "";
    for (int i=0; i<cookies.length; i++){
        Cookie cookie = cookies[i];
        if (cookieName.equals(cookie.getName()))
        cookieValue = cookie.getValue();
    }
    if(cookieValue.equals("admin")){
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Artículos por Entregar</title>
        <link href="style/tablasFormas.css" rel="stylesheet" type="text/css"/>
        
<!--
RESPONSTABLE 2.0 by jordyvanraaij
  Designed mobile first!
If you like this solution, you might also want to check out the 1.0 version:
  https://gist.github.com/jordyvanraaij/9069194
-->
<style>
th, td{
    align: center;
    font-size: .9vw;
}
</style>

</script>

<script>
    var xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4) {
            var data = xhr.responseText;
            if(data.length > 0) {
                desplegarInfo(data);
            }
        }
    };
    xhr.open('GET', 'ControladorCantidades', true);
    xhr.send(null);

    function desplegarInfo(productos) {
        var mensaje1 = "Los siguientes productos están por acabarse:\n";
        mensaje2 = mensaje1.concat(productos);
        alert(mensaje2);
    }
</script>

    </head>
    <body>
        <h1>Artículos por Entregar</h1>
        <form action="ControladorAceptarPedido">
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
              <%
                String[][] pedidos = (String[][])request.getAttribute("totales");
                
                for(String[] elements : pedidos) {
                    out.println("<form action=\"ControladorAceptarPedido\">");
                    out.println("<tr>");
                    for(int i = 0; i < elements.length; i++){
                         // si no es el ultimo elemento (no hay que imprimier el estado)
                         if (i != elements.length - 1) {
                         // si es el primer elemento (por que la matricula es la del color)
                            if (i == 0) {
                                // si el ultimo elemento es 1 (roto)
                                if(elements[elements.length - 1].equals("1")) {
                                    // imprime el fondo rojo
                                    out.print("<td bgcolor=\"red\">" + elements[0] + "</td>");
                                } else {
                                    // de lo contrario imprimelo normalmente
                                    out.print("<td>" + elements[0] + "</td>");
                                }
                            } else {
                                // si no es el primero (ni el ultimo) imprime normal 
                                out.print("<td>" + elements[i] + "</td>");
                            } 
                        }
                    }
                    out.println("</tr>");
                    out.println("<input type=\"hidden\"  name=\"matricula\" value=\"" +  elements[0]  + "\">");
                    out.println("<input type=\"hidden\"  name=\"tipo\" value=\"prestado\">");
                    out.println("<input type=\"hidden\"  name=\"descripcion\" value=\"" +  elements[5]  + "\">");
                    out.println("<input type=\"hidden\"  name=\"fecha\" value=\"" +  elements[1]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"seleccionado\" value=\"" +  elements[2]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"correo\" value=\"" +  elements[3]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"localizacion\" value=\"" +  elements[4]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"capacidad\" value=\"" +  elements[6]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"marca\" value=\"" +  elements[7]  +  "\">");
                    // TODO: tal vez ya no sea necesario desplegar la cantidad porque siempre sera 1
                    out.println("<input type=\"hidden\"  name=\"cantidad\" value=\"" +  elements[8]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"status\" value=\"prestado\">");
                    out.println("<input type=\"hidden\"  name=\"observaciones\" value=\"" +  elements[10]  +  "\">");
                    out.println("<input type=\"hidden\"  name=\"edo\" value=\"" +  elements[11]  +  "\">");
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
<%
    }
%>