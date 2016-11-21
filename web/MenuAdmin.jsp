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
                color:#FFFFFF; border-radius: 10px" align="center">Menú Principal
        </h1>
        <span>
            <form action="ControladorAdmin" name="someForm">
                <a href="#" onclick="document.someForm.submit();">
                <div class="thumbnail"><img src="imagenes/Reloj.png"/></div>
                <p>Artículos por Entregar</p>
                 <input type="hidden" name="destino" value="porEntregar.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm2">
                <a href="#" onclick="document.someForm2.submit();">
                <div class="thumbnail"><img src="imagenes/Return.png"/></div>
                <p>Artículos por Regresar</p>
                 <input type="hidden" name="destino" value="porRegresar.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm3">
                <a href="#" onclick="document.someForm3.submit();">
                <div class="thumbnail"><img src="imagenes/Usuario.png"/></div>
                <p>Agregar Usuarios</p>
                 <input type="hidden" name="destino" value="agregarUsuario.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm4">
                <a href="#" onclick="document.someForm4.submit();">
                <div class="thumbnail"><img src="imagenes/Borrar.png"/></div>
                 <input type="hidden" name="destino" value="borrarUsuarios.jsp">
                <p>Borrar Usuarios</p>
            </form> 
            <form action="ControladorAdmin" name="someForm5">
                <a href="#" onclick="document.someForm5.submit();">
                <div class="thumbnail"><img src="imagenes/Material.png"/></div>
                <p>Agregar Material</p>
                 <input type="hidden" name="destino" value="agregarMaterial.jsp">
            </form>
           <form action="ControladorAdmin" name="someForm6">
                <a href="#" onclick="document.someForm6.submit();">
                <div class="thumbnail"><img src="imagenes/Mechero.png"/></div>
                <p>Agregar Equipo</p>
                 <input type="hidden" name="destino" value="agregarEquipo.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm7">
                <a href="#" onclick="document.someForm7.submit();">
                <div class="thumbnail"><img src="imagenes/Atom.png"/></div>
                <p>Agregar Reactivo</p>
                 <input type="hidden" name="destino" value="agregarReactivo.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm8">
                <a href="#" onclick="document.someForm8.submit();">
                <div class="thumbnail"><img src="imagenes/Jeringa.png"/></div>
                <p>Agregar Consumible</p>
                 <input type="hidden" name="destino" value="agregarConsumible.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm9">
                <a href="#" onclick="document.someForm9.submit();">
                <div class="thumbnail"><img src="imagenes/Lab.png"/></div>
                <p>Agregar Laboratorio</p>
                 <input type="hidden" name="destino" value="agregarLab.jsp">
            </form>
            <form action="ControladorLlenado" name="someForm10">
                <a href="index.html" onclick="document.someForm10.submit();">
                <div class="thumbnail"><img src="imagenes/Cancel.png"/></div>
                <p>Salir</p>
            </form>
        </span>
    </body>
</html>