/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

public class Equipo {

    String nombre, marca, inventario, localizacion, disponibilidad;

    /**
     * Equipo
     *
     * Método constructor para crear el objeto Equipo usando todos sus datos
     *
     * @param nombre es el <code>nombre</code> del objeto.
     * @param marca es la <code>marca</code> del objeto.
     * @param inventario es el <code>inventario</code> del objeto.
     * @param localizacion es la <code>localizacion</code> del objeto.
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public Equipo(String nombre, String marca, String inventario,
            String localizacion, String disponibilidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.inventario = inventario;
        this.localizacion = localizacion;
        this.disponibilidad = disponibilidad;
    }

    /**
     * getNombre
     *
     * Método que obtiene el nombre del objeto Equipo
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getMarca
     *
     * Método que obtiene la marca del objeto Equipo
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Equipo
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
     * Método usado para asignar la marca del objeto Equipo
     *
     * @param marca es la <code>marca</code> del objeto.
     *
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * setInventario
     *
     * Método usado para asignar el inventario del objeto Equipo
     *
     * @param inventario es el <code>inventario</code> del objeto.
     *
     */
    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    /**
     * setLocalizacion
     *
     * Método usado para asignar la localizacion del objeto Equipo
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
     * Método usado para asignar la disponibilidad del objeto Equipo
     *
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * getInventario
     *
     * Método que obtiene el inventario del objeto Equipo
     *
     */
    public String getInventario() {
        return inventario;
    }

    /**
     * getLocalizacion
     *
     * Método que obtiene la localizacion del objeto Equipo
     *
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * getDisponibilidad
     *
     * Método que obtiene la disponibilidad del objeto Equipo
     *
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }
}
