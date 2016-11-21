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
        <title>Alta de Usuarios</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">     
        <h1 style="background-color:#848484; height:50px; padding-top: 3px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Alta Usuario
        </h1>
        <form action="ControladorInventario">       
            <div style="border-bottom: 1px solid  #848484; 
                 border-right: 1px solid  #848484;" 
                 class="col-2">
                <label>
                    Nombre
                    <input placeholder="Nombre del usuario" name="nombre">
                </label>
            </div>    
            <div style="border-bottom: 1px solid  #848484;" class="col-2">
                <label>
                    Matrícula
                    <input placeholder="Matrícula" name="matricula">
                </label>
            </div>   
            <div class="col-3">
                <label>
                    Apellido Paterno
                    <input placeholder="Apellido Paterno" 
                           name="apellidoPat">
                </label>
            </div>   

            <div class="col-3">
                <label>
                    Apellido Materno
                    <input placeholder="Apellido Materno" 
                           name="apellidoMat">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Correo
                    <input placeholder="Correo" name="correo">
                    <input type="hidden" placeholder="Correo" 
                           name="tipo" value="usuario">
                </label>
            </div>
            <button style="height: 34px;" type="submit">Agregar</button>
        </form>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html>
