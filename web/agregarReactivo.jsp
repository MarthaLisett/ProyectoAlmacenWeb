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
        <title>Alta de Reactivos</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
        <script src="scripts/validar.js" type="text/javascript"></script>
        <script>
            // muestra la lista de productos extraidos de la base de datos
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function() {
                if (xhr.readyState === 4) {
                    var data = xhr.responseText;
                    if(data.length > 0) {
                        crearSelectLaboratorios(data);
                    }
                }
            };
            xhr.open('GET', 'ControladorSelectLabs', true);
            xhr.send(null);

            function crearSelectLaboratorios(productos) {
                var nombres = productos.split(' ');
                for(var i = 0; i < nombres.length - 1; i++) {
                    node = document.createElement("OPTION");
                    node.setAttribute("value", nombres[i]);
                    txt = document.createTextNode(nombres[i]);
                    node.appendChild(txt);
                    document.getElementById("localizacion").appendChild(node);
                }
            }
        </script>
        
    </head>
    <body bgcolor="gray">     
        <h1 style="background-color:#848484; height:50px; padding-top: 3px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Alta Reactivo
        </h1>
        <form action="ControladorAgregarReactivo" id="form">       
            <div class="col-3">
                <label>
                    Nombre
                    <input placeholder="Nombre del reactivo" name="nombre"
                           id="nombre">
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Marca
                    <input placeholder="Marca del reactivo" name="marca"
                           id="marca">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Presentación
                    <input placeholder="Presentación del reactivo" 
                           name="presentacion" id="presentacion">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Contenido
                    <input placeholder="Contenido del reactivo" name="contenido"
                           id="contenido">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Localización
                   <!-- <input placeholder="Localización del material" 
                           name="localizacion" id="localizacion"> -->
                     <select name ="localizacion" id="localizacion">
                       
                    </select>
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Disponibilidad
                    <input placeholder="Disponibilidad del reactivo" 
                           name="disponibilidad" id="disponibilidad">
                </label>
            </div>
            <input type="hidden" placeholder="Correo del usuario" 
                           name="tipo" value="reactivo">
            <input type="button" value="Agregar" onclick ="validarConsReact()">
        </form>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html
<%
    }
%>