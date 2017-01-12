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
<%
    Cookie[] cookies = request.getCookies();
    String cookieName = "entra";
    String cookieValue = "";
    for (int i=0; i<cookies.length; i++){
        Cookie cookie = cookies[i];
        if (cookieName.equals(cookie.getName()))
        cookieValue = cookie.getValue();
    }
    if(cookieValue.equals("admin")){
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="style/menuAdmin.css" rel="stylesheet" type="text/css"/>
    <title>Menú Principal</title>
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
            <form action="cambiarContra.jsp" name="someForm11">
                <a href="#" onclick="document.someForm11.submit();">
                <div class="thumbnail"><img src="imagenes/Candado.png"/></div>
                <p>Cambiar Contraseña</p>
                <input type="hidden" name="destino" value="cambiarContra.jsp">
            </form>
            <form action="ControladorAdmin" name="someForm12">
                <a href="#" onclick="document.someForm12.submit();">
                <div class="thumbnail"><img src="imagenes/Candado.png"/></div>
                <p>Mostrar Reportes</p>
                <input type="hidden" name="destino" value="totales.jsp">
            </form>
            <form action="ControladorLlenado" name="someForm10">
                <a href="index.html" onclick="document.someForm10.submit();">
                <div class="thumbnail"><img src="imagenes/Cancel.png"/></div>
                <p>Salir</p>
            </form>
        </span>
    </body>
</html>
<%
    }
%>