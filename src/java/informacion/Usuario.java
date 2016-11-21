/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

public class Usuario {

    private String matricula, nombre, apellidoPaterno, apellidoMaterno, correo;

    /**
     * Usuario
     *
     * Método constructor para crear el objeto Usuario usando todos sus datos
     *
     * @param matricula es la <code>matricula</code> del objeto.
     * @param nombre es el <code>nombre</code> del objeto.
     * @param apellidoPaterno es el <code>apellido paterno</code> del objeto.
     * @param apellidoMaterno es el <code>apellido materno</code> del objeto.
     * @param correo es el <code>correo</code> del objeto.
     */
    public Usuario(String matricula, String nombre, String apellidoPaterno, 
            String apellidoMaterno, String correo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
    }

    /**
     * Usuario
     *
     * Método constructor usado para crear el objeto Usuario usando su matricula
     *
     * @param matricula es la <code>matricula</code> del objeto.
     *
     */
    public Usuario(String matricula) {
        this.matricula = matricula;
    }

    /**
     * getMatricula
     *
     * Método que obtiene la matricula del objeto Usuario
     *
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * setMatricula
     *
     * Método usado para asignar la matricula del objeto Usuario
     *
     * @param matricula es la <code>matricula</code> del objeto.
     *
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * getNombre
     *
     * Método que obtiene el nombre del objeto Usuario
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Usuario
     *
     * @param nombre es la <code>nombre</code> del objeto.
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getApellidoPaterno
     *
     * Método que obtiene lel apellido paterno del objeto Usuario
     *
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * setApellidoPaterno
     *
     * Método usado para asignar el apellido paterno del objeto Usuario
     *
     * @param apellidoPaterno es el <code>apellido paterno</code> del objeto.
     *
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * getApellidoMaterno
     *
     * Método que obtiene el apellido materno del objeto Usuario
     *
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * setApellidoMaterno
     *
     * Método usado para asignar el apellido materno del objeto Usuario
     *
     * @param apellidoMaterno es el <code>apellido materno</code> del objeto.
     *
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * getCorreo
     *
     * Método que obtiene el correo del objeto Usuario
     *
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * setCorreo
     *
     * Método usado para asignar el correo paterno del objeto Usuario
     *
     * @param correo es el <code>apellido correo</code> del objeto.
     *
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
