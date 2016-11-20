<%-- 
    Document   : agregarEquipo
    Created on : 19/11/2016, 07:08:45 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta de Equipo</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">     
        <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Alta Equipo</h1>
        <form action="ControladorInventario">       
            <div class="col-2">
                <label>
                    Nombre
                    <input placeholder="Nombre del equipo" name="nombre">
                </label>
            </div>    
            <div class="col-2">
                <label>
                    Marca
                    <input placeholder="Marca del equipo" name="marca">
                </label>
            </div>   
            <div class="col-3">
                <label>
                    Inventario
                    <input placeholder="Inventario del equipo" name="inventario">
                </label>
            </div>   

            <div class="col-3">
                <label>
                    Localización
                    <input placeholder="Localización del equipo" name="localizacion">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Disponibilidad
                    <input placeholder="Disponibilidad del equipo" name="disponibilidad">
                    <input type="hidden" placeholder="Correo del usuario" name="tipo" value="equipo">

                </label>
            </div>
            <button type="submit">Agregar</button>
        </form>
    </body>
</html>
