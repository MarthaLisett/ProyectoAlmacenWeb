<%-- 
    Document   : exito
    Created on : 17/11/2016, 10:12:30 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vale Exitoso</title>
        <style>
            body{
                background-color: #E0E6F8;
                font-family: "Roboto", sans-serif;
                -webkit-font-smoothing: antialiased;
                -moz-osx-font-smoothing: grayscale;
            }
            form {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 300px;
                margin: 0 auto 100px;
                padding: 10px 30px 10px 30px;
                border-radius: 10px;
                text-align: center;
            }
            input {
                outline: 0;
                background: #E0E6F8;
                width: 100%;
                border: 0;
                margin: 0 0 15px;
                padding: 15px;
                border-radius: 3px;
                box-sizing: border-box;
                font-size: 14px;
            }
            .button {
                outline: 0;
                background: #848484;
                width: 100%;
                border: 0;
                padding: 15px;
                border-radius: 3px;;
                color: #FFFFFF;
                font-size: 14px;
                -webkit-transition: all 0.3 ease;
                transition: all 0.3 ease;
                cursor: pointer;
            }
            .thumbnail {
                background: #848484;
                width: 150px;
                height: 150px;
                margin: 0 auto 30px;
                padding: 27px 30px;
                border-radius: 100%;
                box-sizing: border-box;
            }
            .thumbnail img {
                display: block;
                width: 100%;
            }
            .message {
                margin: 15px 0 0;
                color: #b3b3b3;
                font-size: 12px;
            }
    </style>
    </head>
    <body>    
        <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">¡Tu reporte se 
            registró con éxito ${usuario.getMatricula()}!</h1>
        <form action="ControladorLlenado" name="someForm3">
                <div class="thumbnail"><img src="imagenes/Correcto.png"/></div>
                <a hred="index.html"><button class="button">Regresar a la pantalla Principal</button><a>
        </form>
        <br>
        <div>
            <img src="imagenes/logoTecGris.png" height= "100" width="300"/>
        </div>
        <p class="message">Departamento de Química</p>
    </body>
</html>
