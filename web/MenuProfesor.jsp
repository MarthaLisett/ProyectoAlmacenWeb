<%-- 
    Document   : MenuProfesor
    Created on : 16/11/2016, 09:17:45 AM
    Author     : Pedro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
            display: inline-block;
            margin:20px;
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
        p{
            color: #848484;
        }
        span{
            display:block;
            text-align: center;
        }
    </style>
        
<body>
    <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">Menu Principal</h1>
    <span>            
    <form action="ControladorLlenado" name="someForm">
        <a href="#" onclick="document.someForm.submit();">
        <div class="thumbnail"><img src="imagenes/Mechero.png"/></div>
        <p>Rentar Equipo</p>
        <input type="hidden" name="usuario" value="${usuario.getMatricula()}">
        <input type="hidden" name="destino" value="prestamoProfeEquipo.jsp">
    </form>

    <form action="ControladorLlenado" name="someForm2">
        <a href="#" onclick="document.someForm2.submit();">
        <div class="thumbnail"><img src="imagenes/Jeringa.png"/></div>
        <p>Rentar Consumible</p>
        <input type="hidden" name="usuario" value="${usuario.getMatricula()}">
        <input type="hidden" name="destino" value="prestamoProfeCons.jsp">
        </form>

    <form action="ControladorLlenado" name="someForm3">
        <a href="#" onclick="document.someForm3.submit();">
        <div class="thumbnail"><img src="imagenes/Atom.png"/></div>
        <p>Rentar Reactivo</p>
        <input type="hidden" name="usuario" value="${usuario.getMatricula()}">
        <input type="hidden" name="destino" value="prestamoProfeReact.jsp">
    </form>

    <form action="ControladorLlenado" name="someForm4">
        <a href="#" onclick="document.someForm4.submit();">
        <div class="thumbnail"><img src="imagenes/Material.png"/></div>
        <p>Rentar Material</p>
        <input type="hidden" name="usuario" value="${usuario.getMatricula()}">
        <input type="hidden" name="destino" value="prestamoProfeMaterial.jsp">
    </form>

    <form action="ControladorLlenado" name="someForm5">
        <a href="index.html" onclick="document.someForm5.submit();">
        <div class="thumbnail"><img src="imagenes/Cancel.png"/></div>
         <p>Cancelar</p>
        <input type="hidden" name="usuario" value="${usuario.getMatricula()}">
        <input type="hidden">
    </form>
    </span>
</body>
</html>