function validar(){
	var lab = document.getElementById('laboratorio').value;
	if (lab==""){
		alert("Llena todos los campos");
		lab.focus();
		return false;
	}
}