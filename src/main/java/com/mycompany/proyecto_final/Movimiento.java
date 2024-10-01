package com.mycompany.proyecto_final;

public class Movimiento {
    private String nombre;
    private int poder;

    public Movimiento(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }
}
