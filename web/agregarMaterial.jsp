<%-- 
    Document   : agregarMaterial
    Created on : 19/11/2016, 07:08:35 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de Material</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">     
        <h1 style="background-color:#848484; height:50px; padding-top: 3px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Alta Material</h1>
        <form action="ControladorInventario">       
            <div class="col-2" style="border-bottom: 1px solid  #848484; 
                 border-right: 1px solid  #848484;">
                <label>
                    Nombre
                    <input placeholder="Nombre del material" name="nombre">
                </label>
            </div>    
            <div class="col-2" style="border-bottom: 1px solid  #848484;">
                <label>
                    Marca
                    <input placeholder="Marca del material" name="marca">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Capacidad
                    <input placeholder="Capacidad del material" name="capacidad">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Localización
                    <input placeholder="Localización del material" name="localizacion">
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Disponibilidad
                    <input placeholder="Disponibilidad del material" name="disponibilidad">
                    <input type="hidden" placeholder="Correo del usuario" name="tipo" value="material">
                </label>
            </div>
            <button type="submit">Agregar</button>
        </form>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>

    </body>
</html>
