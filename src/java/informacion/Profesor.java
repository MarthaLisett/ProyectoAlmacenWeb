/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

public class Profesor {

    String nombre, correo;
    /**
     * Profesor
     *
     * Método constructor para crear el objeto Profesor usando todos sus datos
     *
     * @param nombre es el <code>nombre</code> del objeto.
     * @param correo es el <code>correo</code> del objeto.
     *
     */
    public Profesor(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    /**
     * getNombre
     *
     * Método que obtiene el nombre del objeto Reactivo
     *
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * getCorreo
     *
     * Método que obtiene el correo del objeto Reactivo
     *
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Profesor
     *
     * @param nombre es el <code>nombre</code> del objeto.
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * setCorreo
     *
     * Método usado para asignar el correo del objeto Profesor
     *
     * @param correo es el <code>correo</code> del objeto.
     *
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
