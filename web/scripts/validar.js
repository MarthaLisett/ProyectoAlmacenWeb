/**
 * validar
 * 
 * Verifica el contenido de los campos de una forma, excepto los select
 * que tienen un valor default. Si alguno está vacío despliega una alerta
 * y de lo contrario hace submit a la forma.
 * 
 */
function validar() {

    var fecha = document.getElementById("fecha").value;
    //var folio = document.getElementById("folio").value;
    var matricula = document.getElementById("matricula").value;
    var nombre = document.getElementById("nombre").value;
    var correo = document.getElementById("correo").value;
    var clave = document.getElementById("clave").value;
    var descripcion = document.getElementById("descripcion").value;
    var cantidad = document.getElementById("cantidad").value;
    var observaciones = document.getElementById("observaciones").value;
    cantidad = parseInt(cantidad);

    if (fecha == "" || matricula == "" || nombre == "" ||
            correo == "" || clave == "" || descripcion == "" ||
            cantidad == "" || observaciones == "") {
        alert("Llene todos los campos");
    } else if (isNaN(cantidad)) {
        alert("Introduzca un entero en la cantidad");
    } else {
        document.getElementById("form").submit();
    }
}

/**
 * validarConsReact
 * 
 * Verifica el contenido de de una forma de alta de consumible o reactivo.
 * Si alguno está vacío despliega una alerta y de lo contrario hace submit 
 * a la forma.
 * 
 */
function validarConsReact() {
    
    var nombre = document.getElementById("nombre").value;
    var marca = document.getElementById("marca").value;
    var presentacion = document.getElementById("presentacion").value;
    var contenido = document.getElementById("contenido").value;
    var localizacion = document.getElementById("localizacion").value;
    var disponibilidad = document.getElementById("disponibilidad").value;
    disponibilidad = parseInt(disponibilidad);
    
    if (nombre == "" || marca == "" || presentacion == "" || 
            contenido == "" || localizacion == "" || disponibilidad == "") {
        alert("Llena todos los campos");
    } else if (isNaN(disponibilidad)) {
        alert("Introduzca un entero en disponibilidad");
    } else {
        document.getElementById("form").submit();
    }
}

/**
 * validarUsuario
 * 
 * Verifica el contenido de los campos de una forma de alta de usuario.
 * Si alguno está vacío despliega una alerta y de lo contrario hace submit 
 * a la forma.
 * 
 */
function validarUsuario() {
    
    var nombre = document.getElementById("nombre").value;
    var matricula = document.getElementById("matricula").value;
    var apellidoPat = document.getElementById("apellidoPat").value;
    var apellidoMat = document.getElementById("apellidoMat").value;
    var correo = document.getElementById("correo").value;
    
    if (nombre == "" || matricula == "" || apellidoPat == "" || 
            apellidoMat == "" || correo == "") {
        alert("Llena todos los campos");
    } else {
        document.getElementById("form").submit();
    }
}


/**
 * validarMaterialEq
 * 
 * Verifica el contenido de una forma de alta de material o equipo.
 * Si algun campo está vacío despliega una alerta y de lo contrario hace submit 
 * a la forma.
 * 
 */
function validarMaterialEq() {
    
    var nombre = document.getElementById("nombre").value;
    var marca = document.getElementById("marca").value;
    var capacidad = document.getElementById("capacidad").value;
    var localizacion = document.getElementById("localizacion").value;
    var disponibilidad = document.getElementById("disponibilidad").value;
    var inventario = document.getElementById("inventario").value;
    disponibilidad = parseInt(disponibilidad);
    
    if (nombre == "" || marca == "" ||  capacidad == "" || localizacion == "" 
            || disponibilidad == "" || inventario == "") {
        alert("Llena todos los campos");
    } else if (isNaN(disponibilidad)) {
        alert("Introduzca un entero en disponibilidad");
    } else {
        document.getElementById("form").submit();
    }
}

/**
 * validarLab
 * 
 * Verifica el contenido de una forma de alta de laboratorio.
 * Si algun campo está vacío despliega una alerta y de lo contrario hace submit 
 * a la forma.
 * 
 */
function validarLab() {
    
    var nombre = document.getElementById("nombre").value;
    var clave = document.getElementById("clave").value;
    
    if (nombre == "" || clave == "") {
        alert("Llena todos los campos");
    } else {
        document.getElementById("form").submit();
    }
}