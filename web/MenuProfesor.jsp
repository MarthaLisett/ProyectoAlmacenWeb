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
    <title>Menú Principal</title>
    <link href="style/menuProfesor.css" rel="stylesheet" type="text/css"/>
        
<body>
    <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">Menú Principal
    </h1>
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
         <p>Salir</p>
        <input type="hidden" name="usuario" value="${usuario.getMatricula()}">
        <input type="hidden">
    </form>
    </span>
</body>
</html>