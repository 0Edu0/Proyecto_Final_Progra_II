
package com.mycompany.proyecto_final;

public class Combate {
    
    Entrenador entrenador;
    Entrenador contrincante;
    String turnoActual;

    public Combate(Entrenador entrenador, Entrenador contrincante, String turnoActual) {
        this.entrenador = entrenador;
        this.contrincante = contrincante;
        this.turnoActual = turnoActual;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Entrenador getContrincante() {
        return contrincante;
    }

    public void setContrincante(Entrenador contrincante) {
        this.contrincante = contrincante;
    }

    public String getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(String turnoActual) {
        this.turnoActual = turnoActual;
    }
}
