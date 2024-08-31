/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

import java.util.ArrayList;

/**
 *
 * @author eduli
 */
public class PokemonCombate {
    String nombre;
    String genero;
    int hp_base;
    int pp_base;
    int nivel;
    int puntos_exp;
    ArrayList<Habilidades> habilidades;
    String descripcion;

    public PokemonCombate() {
    }

    public PokemonCombate(String nombre, String genero, int hp_base, int pp_base, int nivel, int puntos_exp, ArrayList<Habilidades> habilidades, String descripcion) {
        this.nombre = nombre;
        this.genero = genero;
        this.hp_base = hp_base;
        this.pp_base = pp_base;
        this.nivel = nivel;
        this.puntos_exp = puntos_exp;
        this.habilidades = habilidades;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getpuntos_exp() {
    return puntos_exp;
    }
    
    public String getGenero() {
        return genero;
    }

    public int getHp_base() {
        return hp_base;
    }

    public int getPp_base() {
        return pp_base;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<Habilidades> getHabilidades() {
        return habilidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setHp_base(int hp_base) {
        this.hp_base = hp_base;
    }

    public void setPp_base(int pp_base) {
        this.pp_base = pp_base;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setHabilidades(ArrayList<Habilidades> habilidades) {
        this.habilidades = habilidades;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPuntos_exp(int puntos_exp) {
    this.puntos_exp = puntos_exp;
    }
}
