/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

/**
 *
 * @author Pedro
 */
public class Consumible {
    String id, nombre, marca, presentacion, contenido, localizacion, disponibilidad;

    public Consumible(String id, String nombre, String marca, String presentacion, String contenido, String localizacion, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.presentacion = presentacion;
        this.contenido = contenido;
        this.localizacion = localizacion;
        this.disponibilidad = disponibilidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public String getContenido() {
        return contenido;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
