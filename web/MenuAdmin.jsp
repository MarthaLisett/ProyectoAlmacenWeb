<%-- 
    Document   : MenuAdmin
    Created on : 16/11/2016, 09:17:26 AM
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
                color:#FFFFFF; border-radius: 10px" align="center">Menú Principal</h1>
        <span>
            <form>            
                <a href="porEntregar.jsp">
                <div class="thumbnail"><img src="imagenes/Reloj.png"/></div>
                <p>Artículos por Entregar</p>
            </form>
            <form>
                <a href="porRegresar.jsp">
                <div class="thumbnail"><img src="imagenes/Return.png"/></div>
                <p>Artículos por Regresar</p>
            </form>
            <form>
                <a href="agregarUsuario.jsp">
                <div class="thumbnail"><img src="imagenes/Usuario.png"/></div>
                <p>Agregar Usuarios</p>
            </form>
            <form>
                <a href="borrarUsuarios.jsp">
                <div class="thumbnail"><img src="imagenes/Borrar.png"/></div>
                <p>Borrar Usuarios</p>
            </form> 
            <form>
                <a href="agregarMaterial.jsp">
                <div class="thumbnail"><img src="imagenes/Material.png"/></div>
                <p>Agregar Material</p>
            </form>
            <form>
                <a href="agregarEquipo.jsp">
                <div class="thumbnail"><img src="imagenes/Mechero.png"/></div>
                <p>Agregar Equipo</p>
            </form>
            <form>
                <a href="agregarReactivo.jsp">
                <div class="thumbnail"><img src="imagenes/Atom.png"/></div>
                <p>Agregar Reactivo</p>
            </form>
            <form>
                <a href="agregarConsumible.jsp">
                <div class="thumbnail"><img src="imagenes/Jeringa.png"/></div>
                <p>Agregar Consumible</p>
            </form>
            <form>
                <a href="agregarLab.jsp">
                <div class="thumbnail"><img src="imagenes/Lab.png"/></div>
                <p>Agregar Laboratorio</p>
            </form>
            <form action="ControladorLlenado" name="someForm5">
                <a href="index.html" onclick="document.someForm5.submit();">
                <div class="thumbnail"><img src="imagenes/Cancel.png"/></div>
                <p>Cancelar</p>
            </form>
        </span>
    </body>
</html>