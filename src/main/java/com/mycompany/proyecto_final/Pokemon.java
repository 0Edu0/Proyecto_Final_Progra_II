
package com.mycompany.proyecto_final;

import java.util.ArrayList;

public class Pokemon {
    
    String nombre;
    int nivel;
    String genero;
    int puntosVida;
    int puntosPoder;
    String no_pokedex;
    String hp_base;
    String pp_base;
    String primer_movimiento;
    String evolucion;
    String nivel_evolucion;
    String movimientos;
    ArrayList<String>habilidades;
    String descripcion;

    public Pokemon(String no_pokedex, String nombre, String hp_base, String pp_base, String primer_movimiento, String evolucion, String nivel_evolucion, String movimientos, String descripcion) {
        this.no_pokedex = no_pokedex;
        this.nombre = nombre;
        this.hp_base = hp_base;
        this.pp_base = pp_base;
        this.primer_movimiento = primer_movimiento;
        this.evolucion = evolucion;
        this.nivel_evolucion = nivel_evolucion;
        this.movimientos = movimientos;
        this.descripcion = descripcion;
    }

    public Pokemon (){
    
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNo_pokedex() {
        return no_pokedex;
    }

    public void setNo_pokedex(String no_pokedex) {
        this.no_pokedex = no_pokedex;
    }

    public String getHp_base() {
        return hp_base;
    }

    public void setHp_base(String hp_base) {
        this.hp_base = hp_base;
    }

    public String getPp_base() {
        return pp_base;
    }

    public void setPp_base(String pp_base) {
        this.pp_base = pp_base;
    }

    public String getPrimer_movimiento() {
        return primer_movimiento;
    }

    public void setPrimer_movimiento(String primer_movimiento) {
        this.primer_movimiento = primer_movimiento;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getNivel_evolucion() {
        return nivel_evolucion;
    }

    public void setNivel_evolucion(String nivel_evolucion) {
        this.nivel_evolucion = nivel_evolucion;
    }

    public String getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String movimientos) {
        this.movimientos = movimientos;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
}
