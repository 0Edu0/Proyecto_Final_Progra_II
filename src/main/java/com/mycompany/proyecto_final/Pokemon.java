package com.mycompany.proyecto_final;

public class Pokemon {
    private int noPokedex;
    private String nombre;
    private int hpBase;
    private int ppBase;
    private String primerMovimiento;
    private String evolucion;
    private String nivelEvolucion;
    private String movimientos;
    private int nivel;

    public Pokemon(int noPokedex, String nombre, int hpBase, int ppBase, String primerMovimiento, String evolucion, String nivelEvolucion, String movimientos) {
        this.noPokedex = noPokedex;
        this.nombre = nombre;
        this.hpBase = hpBase;
        this.ppBase = ppBase;
        this.primerMovimiento = primerMovimiento;
        this.evolucion = evolucion;
        this.nivelEvolucion = nivelEvolucion;
        this.movimientos = movimientos;
    }

    // Getters
    public int getNoPokedex() { return noPokedex; }
    public String getNombre() { return nombre; }
    public int getHpBase() { return hpBase; }
    public int getPpBase() { return ppBase; }
    public String getPrimerMovimiento() { return primerMovimiento; }
    public String getEvolucion() { return evolucion; }
    public String getNivelEvolucion() { return nivelEvolucion; }
    public String getMovimientos() { return movimientos; }
    public int getNivel() {return nivel;}
}
