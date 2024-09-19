/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final.Habilidades_Carpeta;
import com.mycompany.proyecto_final.Habilidades;

/**
 *
 * @author eduli
 */
public class HabilidadesHielo {
    public static void habilidadesHielo(String[] args) {
        // Instancias de ataques de tipo hielo de la primera generación

        Habilidades Rayo_Hielo = new Habilidades("Rayo Hielo", "Hielo", "Lanza un rayo de energía helada que puede congelar al objetivo.", 10, 90);
        System.out.println("Nombre: " + Rayo_Hielo.getNombreHabilidad());
        System.out.println("Tipo: " + Rayo_Hielo.getTipo());
        System.out.println("Efecto: " + Rayo_Hielo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Rayo_Hielo.getCantidadPp());
        System.out.println("Potencia: " + Rayo_Hielo.getPotencia());

        Habilidades Ventisca = new Habilidades("Ventisca", "Hielo", "Causa una poderosa tormenta de nieve que puede congelar al objetivo.", 5, 110);
        System.out.println("Nombre: " + Ventisca.getNombreHabilidad());
        System.out.println("Tipo: " + Ventisca.getTipo());
        System.out.println("Efecto: " + Ventisca.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Ventisca.getCantidadPp());
        System.out.println("Potencia: " + Ventisca.getPotencia());

        Habilidades Nieve_Polvo = new Habilidades("Nieve Polvo", "Hielo", "Lanza un pequeño chorro de nieve que puede dañar al objetivo.", 25, 40);
        System.out.println("Nombre: " + Nieve_Polvo.getNombreHabilidad());
        System.out.println("Tipo: " + Nieve_Polvo.getTipo());
        System.out.println("Efecto: " + Nieve_Polvo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Nieve_Polvo.getCantidadPp());
        System.out.println("Potencia: " + Nieve_Polvo.getPotencia());

        Habilidades Rayo_Aurora = new Habilidades("Rayo Aurora", "Hielo", "Lanza un rayo de luz que puede bajar el ataque del objetivo.", 20, 65);
        System.out.println("Nombre: " + Rayo_Aurora.getNombreHabilidad());
        System.out.println("Tipo: " + Rayo_Aurora.getTipo());
        System.out.println("Efecto: " + Rayo_Aurora.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Rayo_Aurora.getCantidadPp());
        System.out.println("Potencia: " + Rayo_Aurora.getPotencia());

        Habilidades Golpe_Hielo = new Habilidades("Golpe Hielo", "Hielo", "Golpea al objetivo con un puño helado, con alta probabilidad de golpe crítico.", 15, 75);
        System.out.println("Nombre: " + Golpe_Hielo.getNombreHabilidad());
        System.out.println("Tipo: " + Golpe_Hielo.getTipo());
        System.out.println("Efecto: " + Golpe_Hielo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Golpe_Hielo.getCantidadPp());
        System.out.println("Potencia: " + Golpe_Hielo.getPotencia());
    }
}