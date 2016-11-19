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
public class Equipo {
    String id, nombre, marca, inventario, localizacion, disponibilidad;

    public Equipo(String id, String nombre, String marca, String inventario, String localizacion, String disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.inventario = inventario;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setInventario(String inventario) {
        this.inventario = inventario;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getInventario() {
        return inventario;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
    
    
}
