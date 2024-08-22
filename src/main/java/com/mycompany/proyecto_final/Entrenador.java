
package com.mycompany.proyecto_final;

import java.util.ArrayList;


public class Entrenador {
    
    String nombre;
    int cantidadPokemons;
    String ubicacionMapa;
    Pokedex pokedex;
    ArrayList<Pokemon>equipo;

    public Entrenador(String nombre, int cantidadPokemons, String ubicacionMapa, Pokedex pokedex, ArrayList<Pokemon> equipo) {
        this.nombre = nombre;
        this.cantidadPokemons = cantidadPokemons;
        this.ubicacionMapa = ubicacionMapa;
        this.pokedex = pokedex;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPokemons() {
        return cantidadPokemons;
    }

    public void setCantidadPokemons(int cantidadPokemons) {
        this.cantidadPokemons = cantidadPokemons;
    }

    public String getUbicacionMapa() {
        return ubicacionMapa;
    }

    public void setUbicacionMapa(String ubicacionMapa) {
        this.ubicacionMapa = ubicacionMapa;
    }

    public Pokedex getPokedex() {
        return pokedex;
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }
    
    
    
}
