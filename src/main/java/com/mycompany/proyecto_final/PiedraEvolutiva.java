
package com.mycompany.proyecto_final;

public class PiedraEvolutiva {
    
   String nombre;
   String descripcion;
   Boolean disponibilidad;

    public PiedraEvolutiva(String nombre, String descripcion, Boolean disponibilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
   
   
    
}
