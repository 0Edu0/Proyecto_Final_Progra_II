
package com.mycompany.proyecto_final;

import java.util.ArrayList;

public class Pokemon {
    
    String nombre;
    int nivel;
    String genero;
    int puntosVida;
    int puntosPoder;
    ArrayList<String>habilidades;

    public Pokemon(String nombre, int nivel, String genero, int puntosVida, int puntosPoder, ArrayList<String> habilidades) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.genero = genero;
        this.puntosVida = puntosVida;
        this.puntosPoder = puntosPoder;
        this.habilidades = habilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getPuntosPoder() {
        return puntosPoder;
    }

    public void setPuntosPoder(int puntosPoder) {
        this.puntosPoder = puntosPoder;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }
    
    
    
    
}
