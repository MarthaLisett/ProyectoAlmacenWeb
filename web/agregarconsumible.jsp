<%-- 
    Document   : agregarConsumible
    Created on : 19/11/2016, 07:08:35 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de Consumible</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">     
        <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Alta Consumible</h1>
        <form action="ControladorInventario">       
            <div class="col-3">
                <label>
                    Nombre
                    <input placeholder="Nombre del consumible" name="nombre">
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Marca
                    <input placeholder="Marca del consumible" name="marca">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Presentación
                    <input placeholder="Presentación del consumible" name="presentacion">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Contenido
                    <input placeholder="Contenido del consumible" name="contenido">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Localización
                    <input placeholder="Ubicación del consumible" name="localizacion">
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Disponibilidad
                    <input placeholder="Disponibilidad del consumible" name="disponibilidad">
                </label>
            </div>
            <button type="submit">Agregar</button>
        </form>
    </body>
</html>

