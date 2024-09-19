/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

/**
 *
 * @author eduli
 */
public class Habilidades {
    String nombreHabilidad;
    String tipo;
    String efectoEnCombate;
    int cantidadPp;
    int potencia;

    public Habilidades() {
    }

    public Habilidades(String nombreHabilidad, String tipo, String efectoEnCombate, int cantidadPp, int potencia) {
        this.nombreHabilidad = nombreHabilidad;
        this.tipo = tipo;
        this.efectoEnCombate = efectoEnCombate;
        this.cantidadPp = cantidadPp;
        this.potencia = potencia;
    }

    public String getNombreHabilidad() {
        return nombreHabilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEfectoEnCombate() {
        return efectoEnCombate;
    }

    public int getCantidadPp() {
        return cantidadPp;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setNombreHabilidad(String nombreHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEfectoEnCombate(String efectoEnCombate) {
        this.efectoEnCombate = efectoEnCombate;
    }

    public void setCantidadPp(int cantidadPp) {
        this.cantidadPp = cantidadPp;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}


