<%-- 
    Document   : prestamosAlumnoMaterial
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
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
        <script src="scripts/validar.js" type="text/javascript"></script>
    </head>
    <body bgcolor="#848484">
        <h1 style="background-color:#848484; height:50px; padding-top: 3px; 
            color:#FFFFFF; border-radius: 10px" align="center"> Préstamo de Material a Alumnos</h1>
        <form action="ControladorFormas">
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
                    <select name ="laboratorio" id="laboratorio">
                        <option>Química Experimental</option>
                        <option>Química Orgánica General</option>
                        <option>Semana i</option>
                    </select>
                </label>
            </div>
            <div class="col-3">
                <label>
                    Clave
                    <input placeholder="Clave" name="clave" id="clave">
                </label>
            </div>
            <div class="col-3">
                <label>
                    Profesor
                    <select name="profesor" id="profesor">
                        <option></option>
                        <option>Prof1</option>
                        <option>Prof2</option>
                        <option>Prof3</option>
                    </select>
                </label>
            </div>

            <!--
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
                   Inventario
                   <input placeholder="Inventario" id="vale" name="inventario" tabindex="14">
               </label>
           </div>
            -->
            
            <div class="col-4">
                <label>
                    Descripción del Material
                    <input placeholder="Descripción" name="descripcion" >
                    <!-- TODO: quitar hardcodeo de value's -->
                    <input name="descripcion1"  value="nombre">
                    <input name="descripcion2">
                    <input name="descripcion3">
                    <input name="descripcion4">
                </label>
            </div>

            <div class="col-8">
                <label>
                    Capacidad
                    <select name="capacidad">
                        <option>25 ml.</option>
                        <option>50 ml.</option>
                        <option>125 ml.</option>
                        <option>250 ml.</option>
                    </select>
                    
                    <select name="capacidad2" >
                        <option>25 ml.</option>
                        <option>50 ml.</option>
                        <option>125 ml.</option>
                        <option>250 ml.</option>
                    </select>
                
                    <select name="capacidad3" >
                        <option>25 ml.</option>
                        <option>50 ml.</option>
                        <option>125 ml.</option>
                        <option>250 ml.</option>
                    </select>
                    <select name="capacidad4" >
                        <option>25 ml.</option>
                        <option>50 ml.</option>
                        <option>125 ml.</option>
                        <option>250 ml.</option>
                    </select>
                    <select name="capacidad5" >
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
                    <input placeholder="Cantidad" name="cantidad">
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
            
                <button type="submit" onClick="validar()">Agregar</button>

            <input type="hidden" name="tipo" value="alumnoMaterial">
            
            <input type="hidden" name="ubicacion">
            <input type="hidden" name="inventario">
        </form>