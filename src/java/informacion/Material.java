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
public class Material {
    String id, nombre, marca, localizacion, capacidad, disponibilidad;

    public Material(String id, String nombre, String marca, String localizacion, String capacidad, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.localizacion = localizacion;
        this.capacidad = capacidad;
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

    public String getLocalizacion() {
        return localizacion;
    }

    public String getCapacidad() {
        return capacidad;
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

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
