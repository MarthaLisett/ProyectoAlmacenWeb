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
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Préstamo de Equipo</title>
        <link rel="shortcut icon" href="http://static.tmimgcdn.com/img/favicon.ico">
        <link rel="icon" href="http://static.tmimgcdn.com/img/favicon.ico">      
        <link href="style/styles.css" rel="stylesheet" type="text/css"/>
        <link href="style/switchery.min.css" rel="stylesheet" type="text/css"/>
        <script src="scripts/switchery.min.js" type="text/javascript"></script>
        <script src="scripts/validar.js" type="text/javascript"></script>
        <script>
            var xhr = new XMLHttpRequest();
            xhr.onreadystatechange = function() {
                if (xhr.readyState === 4) {
                    var data = xhr.responseText;
                    if(data.length > 0) {
                        crearSelect(data);
                    }
                }
            };
            xhr.open('GET', 'ControladorSelectProductos?tipo=equipo', true);
            xhr.send(null);

            function crearSelect(productos) {
                var nombres = productos.split(' ');
                for(var i = 0; i < nombres.length - 1; i++) {
                    node = document.createElement("OPTION");
                    node.setAttribute("value", nombres[i]);
                    txt = document.createTextNode(nombres[i]);
                    node.appendChild(txt);
                    document.getElementById("descripcion").appendChild(node);
                }
            }
        </script>
    </head>
    <body bgcolor="gray">


        <h1 style="background-color:#848484; height:50px; padding-top: 3px; 
            color:#FFFFFF; border-radius: 10px" align="center">
            Préstamo de Equipo a Alumnos</h1>
        <form action="ControladorFormas" name="formaEquipo" id="form">
            <div class="col-4"></div>  
            <div class="col-4"></div> 
            <div class="col-4"></div> 
            <div class="col-4">
                <label>
                    Fecha
                    <input placeholder="Fecha" type="date" name="fecha"
                            value="${fecha}" id="fecha" readonly>
                </label>
            </div>
            <!--    
            <div class="col-4">
                <label>
                    Folio
                    <input  readonly placeholder="Folio" name="folio" id="folio">
                </label>
            </div>
            -->
            <div class="col-3">
                <label>
                    Matrícula
                    <input placeholder="Matrícula" name="matricula" id="matricula"
                           value="${usuario.getMatricula().toUpperCase()}" readonly>
                </label>
            </div>        
            <div class="col-3">
                <label>
                    Nombre
                    <input placeholder="Nombre" name="nombre" id="nombre"
                           value="${usuario.getNombre()} ${usuario.getApellidoPaterno()} ${usuario.getApellidoMaterno()}" readonly>
                </label>
            </div>

            <div class="col-3">
                <label>
                    Correo
                    <input placeholder="Correo" name="correo" id="correo"
                           value="${usuario.getCorreo()}" readonly>
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
                        <option>Prof1</option>
                        <option>Prof2</option>
                        <option>Prof3</option>
                    </select>
                </label>
            </div>
            <div class="col-4">
                <label>
                    Descripción del Equipo
                    <select  name="descripcion" id="descripcion"></select>
                </label>
            </div>

            <div class="col-8">
                <label>
                    Marca
                    <select  name="marca" id="marca">
                        <option>Marca 1</option>
                        <option>Marca 2</option>
                        <option>Marca 3</option>
                    </select>
                </label>
            </div>
            <div class="col-8">
                <label>
                    Cantidad
                    <input placeholder="Cantidad" name="cantidad" id="cantidad">
                </label>
            </div>
            <div class="col-8">
                <label>
                    Status
                    <select name="status" id="status">
                        <option>Préstamo</option>
                        <option>Cancelación devolución</option>
                        <option>Cancelación por ticket</option>
                    </select>
                </label>
            </div>
            <div class="col-4">
                <label>
                    Observaciones
                    <input placeholder="Observaciones" name="observaciones" 
                           id="observaciones">
                </label>
            </div>

            <input type="hidden" name="tipo" value="alumnoEquipo">
            <input type="hidden" name="capacidad">
            <input type="hidden" name="ubicacion">
            <input type="hidden" name="inventario">
            
            <input type="button" value="Agregar" onclick ="validar()">
        </form>
        <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html>