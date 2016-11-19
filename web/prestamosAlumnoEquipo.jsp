<%-- 
    Document   : prestamosAlumnoEquipo
    Created on : 19/11/2016, 01:01:37 AM
    Author     : Adrian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">      
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
    </head>
    <body bgcolor="gray">


        <h1> Prestamos de Equipo a Alumnos</h1>
        <form action="ControladorFormas" name="formaEquipo">
            <div class="col-4"></div>  
            <div class="col-4"></div> 

            <div class="col-4">
                <label>
                    Fecha
                    <input placeholder="Fecha" type="date" name="fecha"
                            value="${fecha}">
                </label>
            </div>
            <div class="col-4">
                <label>
                    Folio
                    <input placeholder="Folio" name="folio">
                </label>
            </div>

            <div class="col-3">
                <label>
                    Matrícula
                    <input placeholder="Matrícula" name="matricula"
                           value="${usuario.getMatricula().toUpperCase()}">
                </label>
            </div>        
            <div class="col-3">
                <label>
                    Nombre
                    <input placeholder="Nombre" name="nombre"
                           value="${usuario.getNombre()} ${usuario.getApellidoPaterno()} ${usuario.getApellidoMaterno()}">
                </label>
            </div>

            <div class="col-3">
                <label>
                    Correo
                    <input placeholder="Correo" name="correo"
                           value="${usuario.getCorreo()}">
                </label>
            </div>

            <div class="col-3">
                <label>
                    Laboratorio
                    <select name ="laboratorio">
                        <option>Química Experimental</option>
                        <option>Química Orgánica General</option>
                        <option>Semana i</option>
                    </select>
                </label>
            </div>
            <div class="col-3">
                <label>
                    Clave
                    <input placeholder="Clave" name="clave">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Profesor
                    <select name="profesor">
                        <option></option>
                        <option>Prof1</option>
                        <option>Prof2</option>
                        <option>Prof3</option>
                    </select>
                </label>
            </div>
            <div class="col-4">
                <label>
                    Descripción del Equipo
                    <input placeholder="Descripción" name="descripcion" >
                    <input name="descripcion1" value="nombre">
                    <input name="descripcion3">
                    <input name="descripcion4">
                    <input name="descripcion5">
                </label>
            </div>

            <div class="col-8">
                <label>
                    Marca
                    <select  name="marca">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                    <select  name="marca2">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                    <select  name="marca3">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                    <select  name="marca4">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                    <select  name="marca5">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                </label>
            </div>
            <div class="col-8">
                <label>
                    Cantidad
                    <input placeholder="Cantidad" name="cantidad" >
                    <input name="cantidad2" value="1" >
                    <input name="cantidad3" >
                    <input name="cantidad4" >
                    <input name="cantidad5" >
                </label>
            </div>
            <div class="col-8">
                <label>
                    Status
                    <select name="status">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                    <select name="status2">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                    <select name="status3">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                    <select name="status4">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                    <select name="status5">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                </label>
            </div>
            <div class="col-4">
                <label>
                    Observaciones
                    <input placeholder="Observaciones" name="observaciones" >
                    <input name="observaciones2" >
                    <input name="observaciones3" >
                    <input name="observaciones4" >
                    <input name="observaciones5" >
                </label>
            </div> 
            
            
            <button type="submit">Agregar</button>

            <input type="hidden" name="tipo" value="alumnoEquipo">
            
            <input type="hidden" name="capacidad">
            <input type="hidden" name="capacidad2">
            <input type="hidden" name="capacidad3">
            <input type="hidden" name="capacidad4">
            <input type="hidden" name="capacidad5">
            
            <input type="hidden" name="ubicacion">
            <input type="hidden" name="inventario">
        </form>