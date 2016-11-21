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
        <title>Baja de Usuarios</title>
<!--
RESPONSTABLE 2.0 by jordyvanraaij
  Designed mobile first!
If you like this solution, you might also want to check out the 1.0 version:
  https://gist.github.com/jordyvanraaij/9069194
-->
<style>
.responstable {
  margin: 1em 0;
  width: 100%;
  overflow: hidden;
  background: #FFF;
  color: black;
  border-radius: 5px;
  border: 1px solid black;
}
.responstable tr {
  border: 1px solid black;
}
.responstable tr:nth-child(odd) {
  background-color: #F2F2F2;
}
.responstable th {
  display: none;
  background-color: #848484;
  color: #FFF;
}
.responstable th:first-child {
  display: table-cell;
  text-align: center;
}
.responstable th:nth-child(2) {
  display: table-cell;
}
.responstable th:nth-child(2) span {
  display: none;
}
.responstable th:nth-child(2):after {
  content: attr(data-th);
}
@media (min-width: 480px) {
  .responstable th:nth-child(2) span {
    display: block;
  }
  .responstable th:nth-child(2):after {
    display: none;
  }
}
.responstable td {
  display: block;
  word-wrap: break-word;
  max-width: 7em;
}
.responstable td:first-child {
  display: table-cell;
  text-align: center;
}
@media (min-width: 480px) {
  .responstable td {
  }
}
.responstable td {
  text-align: center;
  margin: .5em .5em;
}
@media (min-width: 480px) {
  .responstable th, .responstable td {
    display: table-cell;
    padding: .5em;
  }
}
body {
  padding: 0 2em;
  font-family: Arial, sans-serif;
  color: #024457;
  background: #E0E6F8;
}
h1 {
  background-color:#848484;
  height:50px;
  padding-top: 10px; 
  color:#FFFFFF;
  border-radius: 10px;
  font-family: "Roboto", sans-serif;
  text-align: center;
  font-weight: normal;
}
h1 span {
  color: #167F92;
}
th, td{
    align: center;
    font-size: 1vw;
}
.button {
                outline: 0;
                background: #848484;
                width: 200px;
                border: 0;
                padding: 15px;
                border-radius: 3px;;
                color: #FFFFFF;
                font-size: 16px;
                -webkit-transition: all 0.3 ease;
                transition: all 0.3 ease;
                cursor: pointer;
                text-align: center;
                margin: 0 auto;
                position: relative;
}
</style>
    </head>
    <body>
        <h1 style="background-color:#848484; height:50px; padding-top: 10px; 
            color:#FFFFFF; border-radius: 10px" align="center">Dar de Baja Usuarios
        </h1>
        <table class="responstable">
            <tr>
                <th>Matrícula</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Articulo Rentado</th>
                <th>Cantidad</th>
                <th>Fecha</th>
                <th>Número de Vale</th>
                <th>Eliminar</th>
            </tr>
            <tr>
                <td>A01280126</td>
                <td>Pedro</td>
                <td>Esparza</td>
                <td>Matraz</td>
                <td>1</td>
                <td>16/11/2016</td>
                <td>3</td>
                <td><input type="checkbox" ></button></td>
            </tr>
            <tr>
                <td>A01280115</td>
                <td>Martiwuis</td>
                <td>Benavides</td>
                <td>Tubo de ensayo</td>
                <td>3</td>
                <td>16/11/2016</td>
                <td>4</td>
                <td><input type="checkbox" ></button></td>               
            </tr>
        </table>
        <div style="text-align:center;">
            <button class="button" type="button" 
                    onclick="alert('Se han eliminado los usuarios')">
                Eliminar</button></div>
          <br><br>
          <p style="background-color:#848484; height:30px; padding-top: 6px; 
            color:#FFFFFF; border-radius: 3px; width: 500px; margin: 0 auto" 
            align="center"><font size="3">Para volver al <b>Menú</b> dar clic 
            en el botón <b><i>Regresar</i></b> del Navegador</font></p>
    </body>
</html>
