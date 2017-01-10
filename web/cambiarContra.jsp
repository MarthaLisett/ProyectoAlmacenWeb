<%-- 
    Document   : cambiarContra
    Created on : Jan 9, 2017, 2:30:28 PM
    Author     : MarthaLisett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <title>Cambiar Contraseña</title>
    </head>
    <body>
        <h1 style="background-color:#848484; height:50px; padding-top: 3px;
            color:#FFFFFF; border-radius: 10px" align="center">Cambia tu Contraseña</h1>
            <form action="ControladorCambioContra">
                <p style="text-align: center; font-size: 20px; padding-top: 80px; padding-bottom: 20px;">Nueva Contraseña: <input type="password" name="contra"></p>
                <p style="text-align: center; font-size: 20px; padding-bottom: 40px;">Repite la Contraseña <input type="password" name="contra2"></p>
                <div style="text-align: center; margin:0px auto; display:block; padding-bottom: 40px;">
                    <input type="submit" value="Hacer Cambio">
                </div>   
            </form>
    </body>
</html>
