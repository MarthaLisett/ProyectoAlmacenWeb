/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;


public class Consumible {

    String nombre, marca, presentacion, contenido, localizacion,
            disponibilidad;
    /**
     * Consumible
     *
     * Método constructor para crear el objeto Consumible usando todos sus datos
     *
     * @param id es el <code>id</code> del objeto.
     * @param nombre es el <code>nombre</code> del objeto.
     * @param marca es la <code>marca</code> del objeto.
     * @param presentacion es la <code>presentacion</code> del objeto.
     * @param contenido es el <code>contenido</code> del objeto.
     * @param localizacion es la <code>localizacion</code> del objeto.
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public Consumible(String nombre, String marca,
            String presentacion, String contenido, String localizacion,
            String disponibilidad) {
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
     * Método que obtiene el nombre del objeto Consumible
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getMarca
     *
     * Método que obtiene la marca id del objeto Consumible
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * getPresentacion
     *
     * Método que obtiene la presentacion del objeto Consumible
     *
     */
    public String getPresentacion() {
        return presentacion;
    }

    /**
     * getContenido
     *
     * Método que obtiene el contenido del objeto Consumible
     *
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * getLocalizacion
     *
     * Método que obtiene la localizacion del objeto Consumible
     *
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * getDisponibilidad
     *
     * Método que obtiene la disponibilidad del objeto Consumible
     *
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }


    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Consumible
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
     * Método usado para asignar la marca del objeto Consumible
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
     * Método usado para asignar la presentacion del objeto Consumible
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
     * Método usado para asignar el contenido del objeto Consumible
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
     * Método usado para asignar la localizacion del objeto Consumible
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
     * Método usado para asignar la disponibilidad del objeto Consumible
     *
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
