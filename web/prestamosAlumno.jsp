<%-- 
    Document   : prestamosAlumno
    Created on : 2/11/2016, 08:41:42 AM
    Author     : Pedro
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link href="../src/java/style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="../src/java/style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="../src/java/scripts/switchery.min.js" type="text/javascript"></script>
    </head>
<body bgcolor="gray">
    
    
    <h1> Prestamos de Material y Equipo a Alumnos</h1>
<form action="ControladorFormas">
    <div class="col-4"></div>  
            <div class="col-4"></div> 

            <div class="col-4">
                <label>
                    Fecha
                    <input placeholder="Fecha" type="date" id="fecha" name="fecha" tabindex="1">
                </label>
            </div>
            <div class="col-4">
                <label>
                    Folio
                    <input placeholder="Folio" id="vale" name="folio" tabindex="2">
                </label>
            </div>

            <div class="col-3">
                <label>
                    Matrícula
                    <input placeholder="Matrícula" id="vale" name="matricula" tabindex="3">
                </label>
            </div>        
            <div class="col-3">
                <label>
                    Nombre
                    <input placeholder="Nombre" id="vale" name="nombre" tabindex="4">
                </label>
            </div>

            <div class="col-3">
                <label>
                    Correo
                    <input placeholder="Correo" id="vale" name="correo" tabindex="5">
                </label>
            </div>


            <div class="col-3">
                <label>
                    Laboratorio
                    <select tabindex="6">
                        <option>Química Experimental</option>
                        <option>Química Orgánica General</option>
                        <option>Semana i</option>
                    </select>
                </label>
            </div>
            <div class="col-3">
                <label>
                    Clave
                    <input placeholder="Clave" id="vale" name="clave" tabindex="7">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Profesor
                    <select tabindex="8" id="profesor">
                        <option></option>
                        <option>Prof1</option>
                        <option>Prof2</option>
                        <option>Prof3</option>
                    </select>
                </label>
            </div>
            
            
            <div class="col-8">
                <label>
                    Descripción del Material
                    <input placeholder="Descripción" id="vale" name="descripcion" tabindex="9">
                </label>
            </div>
            <div class="col-8">
                <label>
                    Ubicación
                    <select tabindex="10" id="ubicacion">
                        <option>E1</option>
                        <option>R2</option>
                    </select>
                </label>
            </div>
            <div class="col-8">
                <label>
                    Capacidad
                    <select tabindex="11" id="capacidad">
                        <option>25 ml.</option>
                        <option>50 ml.</option>
                        <option>125 ml.</option>
                        <option>250 ml.</option>
                    </select>
                </label>
            </div>
            <div class="col-8">
                <label>
                    Marca
                    <select tabindex="12" id="marca">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                </label>
            </div>
            <div class="col-8">
                <label>
                    Cantidad
                    <input placeholder="Cantidad" id="vale" name="cantidad" tabindex="13">
                </label>
            </div>
            <div class="col-8">
                <label>
                    Inventario
                    <input placeholder="Inventario" id="vale" name="inventario" tabindex="14">
                </label>
            </div>
             <div class="col-8">
                <label>
                    Status
                    <select tabindex="15" id="status">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                </label>
            </div>
            <div class="col-8">
                <label>
                    Observaciones
                    <input placeholder="Observaciones" id="vale" name="observaciones" tabindex="16">
                          <input type="hidden" name="tipo" value="Alumno">
                </label>
            </div>
            <button type="submit">Agregar</button>
        </form>
    
    
    <!--
<table border="1" bgcolor="red">
<tr>
<td> <input type="text" name="fecha" placeholder="Fecha">
</td>
<td>  <input type="text" name="vale" placeholder="Vale">
</td>
  </tr>
</table>
<table border="1" bgcolor="red">
<tr>
<td> <input type="text" name="usuario" placeholder="Usuario">
</td>
<td>  <input type="text" name="correo" placeholder="Correo">
</td>
<td>  <input type="text" name="lab" placeholder="Laboratorio">
</td>
<td>  <input type="text" name="profe" placeholder="Profesor">
</td>
</tr>
</table>
<table border="1" bgcolor="red">
<tr>
<td>  <input type="text" name="id" placeholder="ID">
</td></td><td><textarea name="desc" placeholder="Descripcion" size="80" rows="5"></textarea></td>
<td>  <input type="text" name="cap" placeholder="Capacidad">
</td>
<td>  <input type="text" name="marca" placeholder="Marca">
</td>
<td>  <input type="text" name="cant" placeholder="Cantidad">
</td>
<td>  <input type="text" name="estatus" value="prestamo" >
</td>
</tr>
</table>
<table border="1" bgcolor="red">
<tr>
<td><textarea name="observ" placeholder="Observaciones" size="80" rows="5"></textarea></td>
<tr>
</table>
</form>
</body>
</html>
