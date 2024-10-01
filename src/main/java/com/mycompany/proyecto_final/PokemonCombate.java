package com.mycompany.proyecto_final;

import java.util.ArrayList;

public class PokemonCombate {
    private String nombre;
    private int hp;
    private int pp;
    private ArrayList<Movimiento> movimientos;

    public PokemonCombate(String nombre, int hp, int pp, ArrayList<Movimiento> movimientos) {
        this.nombre = nombre;
        this.hp = hp;
        this.pp = pp;
        this.movimientos = movimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void mostrarMovimientos() {
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.println((i + 1) + ". " + movimientos.get(i).getNombre() + " (Poder: " + movimientos.get(i).getPoder() + ")");
        }
    }

    public void recibirDanio(int danio) {
        this.hp -= danio;
        if (hp < 0) {
            hp = 0;
        }
    }
}
