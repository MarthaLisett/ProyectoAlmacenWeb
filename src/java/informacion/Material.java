/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

public class Material {

    private String nombre, marca, localizacion, capacidad, disponibilidad;

    /**
     * Material
     *
     * Método constructor para crear el objeto Material usando todos sus datos
     *
     * @param id es el <code>id</code> del objeto.
     * @param nombre es el <code>nombre</code> del objeto.
     * @param marca es la <code>marca</code> del objeto.
     * @param localizacion es la <code>localizacion</code> del objeto.
     * @param capacidad es la <code>capacidad</code> del objeto.
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public Material(String nombre, String marca, String localizacion,
            String capacidad, String disponibilidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.localizacion = localizacion;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
    }

    /**
     * getNombre
     *
     * Método que obtiene el nombre del objeto Material
     *
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * getMarca
     *
     * Método que obtiene la marca del objeto Material
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * getLocalizacion
     *
     * Método que obtiene la localizacion del objeto Material
     *
     */
    public String getLocalizacion() {
        return localizacion;
    }

    /**
     * getCapacidad
     *
     * Método que obtiene la capacidad del objeto Material
     *
     */
    public String getCapacidad() {
        return capacidad;
    }

    /**
     * getDisponibilidad
     *
     * Método que obtiene la disponibilidad del objeto Material
     *
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * setNombre
     *
     * Método usado para asignar el nombre del objeto Material
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
     * Método usado para asignar la marca del objeto Material
     *
     * @param marca es la <code>marca</code> del objeto.
     *
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * setLocalizacion
     *
     * Método usado para asignar la localizacion del objeto Material
     *
     * @param localizacion es la <code>localizacion</code> del objeto.
     *
     */
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * setCapacidad
     *
     * Método usado para asignar la capacidad del objeto Material
     *
     * @param capacidad es la <code>capacidad</code> del objeto.
     *
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * setDisponibilidad
     *
     * Método usado para asignar la disponibilidad del objeto Material
     *
     * @param disponibilidad es la <code>disponibilidad</code> del objeto.
     *
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
