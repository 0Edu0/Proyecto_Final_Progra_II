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
public class HabilidadesNormal {
    public static void habilidadesNormal(String[] args) {
        // Instancias de ataques de tipo normal de la primera generación

        Habilidades Placaje = new Habilidades("Placaje", "Normal", "Ataca al objetivo embistiéndolo con el cuerpo.", 35, 40);
        System.out.println("Nombre: " + Placaje.getNombreHabilidad());
        System.out.println("Tipo: " + Placaje.getTipo());
        System.out.println("Efecto: " + Placaje.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Placaje.getCantidadPp());
        System.out.println("Potencia: " + Placaje.getPotencia());

        Habilidades Golpe_Cuerpo = new Habilidades("Golpe Cuerpo", "Normal", "Ataca al objetivo embistiéndolo con todo el cuerpo, puede causar parálisis.", 15, 85);
        System.out.println("Nombre: " + Golpe_Cuerpo.getNombreHabilidad());
        System.out.println("Tipo: " + Golpe_Cuerpo.getTipo());
        System.out.println("Efecto: " + Golpe_Cuerpo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Golpe_Cuerpo.getCantidadPp());
        System.out.println("Potencia: " + Golpe_Cuerpo.getPotencia());

        Habilidades Destructor = new Habilidades("Destructor", "Normal", "Ataca al objetivo con una fuerza moderada.", 35, 50);
        System.out.println("Nombre: " + Destructor.getNombreHabilidad());
        System.out.println("Tipo: " + Destructor.getTipo());
        System.out.println("Efecto: " + Destructor.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Destructor.getCantidadPp());
        System.out.println("Potencia: " + Destructor.getPotencia());

        Habilidades Hiperrayo = new Habilidades("Hiperrayo", "Normal", "Lanza un rayo devastador, pero el usuario debe recargar en el siguiente turno.", 5, 150);
        System.out.println("Nombre: " + Hiperrayo.getNombreHabilidad());
        System.out.println("Tipo: " + Hiperrayo.getTipo());
        System.out.println("Efecto: " + Hiperrayo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Hiperrayo.getCantidadPp());
        System.out.println("Potencia: " + Hiperrayo.getPotencia());

        Habilidades Golpe_Karate = new Habilidades("Golpe Karate", "Normal", "Ataca al objetivo con un golpe rápido, alta probabilidad de golpe crítico.", 25, 50);
        System.out.println("Nombre: " + Golpe_Karate.getNombreHabilidad());
        System.out.println("Tipo: " + Golpe_Karate.getTipo());
        System.out.println("Efecto: " + Golpe_Karate.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Golpe_Karate.getCantidadPp());
        System.out.println("Potencia: " + Golpe_Karate.getPotencia());

        Habilidades Doble_Filo = new Habilidades("Doble Filo", "Normal", "Ataca al objetivo con gran potencia, pero también daña al usuario.", 15, 120);
        System.out.println("Nombre: " + Doble_Filo.getNombreHabilidad());
        System.out.println("Tipo: " + Doble_Filo.getTipo());
        System.out.println("Efecto: " + Doble_Filo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Doble_Filo.getCantidadPp());
        System.out.println("Potencia: " + Doble_Filo.getPotencia());

        Habilidades Chirrido = new Habilidades("Chirrido", "Normal", "Emite un sonido agudo que reduce drásticamente la defensa del objetivo.", 40, 0);
        System.out.println("Nombre: " + Chirrido.getNombreHabilidad());
        System.out.println("Tipo: " + Chirrido.getTipo());
        System.out.println("Efecto: " + Chirrido.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Chirrido.getCantidadPp());
        System.out.println("Potencia: " + Chirrido.getPotencia());

        Habilidades Ataque_Rapido = new Habilidades("Ataque Rápido", "Normal", "Ataca al objetivo con velocidad, siempre golpea primero.", 30, 40);
        System.out.println("Nombre: " + Ataque_Rapido.getNombreHabilidad());
        System.out.println("Tipo: " + Ataque_Rapido.getTipo());
        System.out.println("Efecto: " + Ataque_Rapido.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Ataque_Rapido.getCantidadPp());
        System.out.println("Potencia: " + Ataque_Rapido.getPotencia());
    }
}