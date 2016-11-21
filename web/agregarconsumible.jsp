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
        <title>Alta de Consumible</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
        <script src="scripts/validar.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">     
        <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Alta Consumible
        </h1>
        <form action="ControladorInventario" id="form">       
            <div class="col-3">
                <label>
                    Nombre
                    <input placeholder="Nombre del consumible" name="nombre"
                           id="nombre">
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Marca
                    <input placeholder="Marca del consumible" name="marca"
                           id="marca">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Presentación
                    <input placeholder="Presentación del consumible" 
                           name="presentacion" id="presentacion">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Contenido
                    <input placeholder="Contenido del consumible" 
                           name="contenido" id="contenido">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Localización
                    <input placeholder="Ubicación del consumible" 
                           name="localizacion" id="localizacion">
                </label>
            </div>    
            <div class="col-3">
                <label>
                    Disponibilidad
                    <input placeholder="Disponibilidad del consumible" 
                           name="disponibilidad" id="disponibilidad">
                </label>
            </div>
            <input type="hidden" placeholder="Correo del usuario" 
                           name="tipo" value="consumible">
            <input type="button" value="Agregar" onclick ="validarConsReact()">
        </form>
    </body>
</html>