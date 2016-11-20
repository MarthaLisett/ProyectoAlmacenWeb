<%-- 
    Document   : agregarUsuario
    Created on : 19/11/2016, 07:08:45 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dar de alta Usuario</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">     
        <h1>Dar de alta Usuario</h1>
        <form action="ControladorInventario">       
            <div class="col-2">
                <label>
                    Nombre
                    <input placeholder="Nombre del usuario" name="nombre">
                </label>
            </div>    
            <div class="col-2">
                <label>
                    Matrícula
                    <input placeholder="Matrícula del usuario" name="matricula">
                </label>
            </div>   
            <div class="col-3">
                <label>
                    Apellido Paterno
                    <input placeholder="Apellido paterno del usuario" name="apellidoPat">
                </label>
            </div>   

            <div class="col-3">
                <label>
                    Apellido Materno
                    <input placeholder="Apellido materno del usuario" name="apellidoMat">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Correo
                    <input placeholder="Correo del usuario" name="correo">
                </label>
            </div>
            <button type="submit">Agregar</button>
        </form>
    </body>
</html>
