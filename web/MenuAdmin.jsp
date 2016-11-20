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
            color:#FFFFFF; border-radius: 10px" align="center">Menu Principal</h1>
<a href="porEntregar.jsp">
    <img src="../src/java/imagenes/porEntregar.png" alt="Por Entregar" style="width:304px;height:228px;">
<a href="porRegresar.jsp">
    <img src="../imagenes/porRegresar.png" alt="Por Regresar" style="width:304px;height:228px;">

<a href="agregarUsuarios.jsp">
    <img src="../imagenes/porEntregar.png" alt="Agregar Usuarios" style="width:304px;height:228px;">
<a href="borrarUsuarios.jsp">
    <img src="../imagenes/porEntregar.png" alt="Borrar Usuarios" style="width:304px;height:228px;">

<a href="agregarMaterial.jsp">
    <img src="" alt="Agregar Material" style="width:304px;height:228px;">
<a href="agregarEquipo.jsp">
    <img src="" alt="Agregar Equipo" style="width:304px;height:228px;">
<a href="agregarReactivo.jsp">
    <img src="" alt="Agregar Reactivo" style="width:304px;height:228px;">
<a href="agregarconsumible.jsp">
    <img src="" alt="Agregar Consumible" style="width:304px;height:228px;">
<a href="agregarProfe.jsp">
    <img src="" alt="Agregar Profesor" style="width:304px;height:228px;">
<a href="agregarLab.jsp">
    <img src="" alt="Agregar Laboratorio" style="width:304px;height:228px;">

</body>
</html>