/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

public class Reactivo {

    String nombre, marca, presentacion, contenido, localizacion,
            disponibilidad;

    /**
     * Reactivo
     *
     * Método constructor para crear el objeto Reactivo usando todos sus datos
     *
     * @param nombre es el <code>nombre</code> del objeto.
     * @param marca es la <code>marca</code> del objeto.
     * @param presentacion es la <code>presentacion</code> del objeto.
     * @param contenido es el <code>contenido</code> del objeto.
     * @param localizacion es la <code>localizacion</code> del objeto.
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     * 
     */
    public Reactivo(String nombre, String marca, String presentacion,
            String contenido, String localizacion, String disponibilidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.presentacion = presentacion;
        this.contenido = contenido;
        this.localizacion = localizacion;
        this.disponibilidad = disponibilidad;
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
     * getMarca
     *
     * Método que obtiene la marca del objeto Reactivo
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * getPresentacion
     *
     * Método que obtiene la presentacion del objeto Reactivo
     *
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * getId
     *
     * Método que obtiene el contenido del objeto Reactivo
     *
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * getLicalizacion
     *
     * Método que obtiene la localizacion del objeto Reactivo
     *
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * getDisponibilidad
     *
     * Método que obtiene la disponibilidad del objeto Reactivo
     *
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Reactivo
     *
     * @param nombre es el <code>nombre</code> del objeto.
     *
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * setMarca
     *
     * Método usado para asignar la marca del objeto Reactivo
     *
     * @param marca es la <code>marca</code> del objeto.
     *
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * setPresentacion
     *
     * Método usado para asignar la presentacion del objeto Reactivo
     *
     * @param presentacion es la <code>presentacion</code> del objeto.
     *
     */
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    /**
     * setContenido
     *
     * Método usado para asignar el contenido del objeto Reactivo
     *
     * @param contenido es el <code>contenido</code> del objeto.
     *
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * setLocalizacion
     *
     * Método usado para asignar la localizacion del objeto Reactivo
     *
     * @param localizacion es la <code>localizacion</code> del objeto.
     *
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * setDisponibilidad
     *
     * Método usado para asignar la disponibilidad del objeto Reactivo
     *
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
