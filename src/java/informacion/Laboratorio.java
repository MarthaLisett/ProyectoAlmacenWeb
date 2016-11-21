/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

public class Laboratorio {

    String nombre, clave;

    /**
     * Laboratorio
     *
     * Método constructor para crear el objeto Laboratorio usando todos sus
     * datos
     *
     * @param nombre es el <code>nombre</code> del objeto.
     * @param clave es la <code>clave</code> del objeto.
     *
     */
    public Laboratorio(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    /**
     * getNombre
     *
     * Método que obtiene el nombre del objeto Laboratorio
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getClave
     *
     * Método que obtiene la clave del objeto Laboratorio
     *
     */
    public String getClave() {
        return clave;
    }

    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Laboratorio
     *
     * @param nombre es el <code>nombre</code> del objeto.
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * setClave
     *
     * Método usado para asignar la clave del objeto Laboratorio
     *
     * @param clave es la <code>clave</code> del objeto.
     *
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
}
