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
                String[][] pedidos = (String[][])request.getAttribute("pedidos");
                
                for(String[] elements : pedidos) {
                    out.println("<form>");
                    out.println("<tr>");
                    for(String innerElements : elements) {
                        out.print("<td>" + innerElements + "</td>");
                    }
                    out.println("</tr>");
                    out.println("</form>");
                    
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
                   
                }

            %>
        </table>
    </form>
        <center>
<input type='button' onclick='window.print();' value='Imprimir' /></form>
              </center>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html>
