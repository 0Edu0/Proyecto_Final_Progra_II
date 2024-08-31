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
public class HabilidadesElectrico {
    public static void habilidadesElectrico(String[] args) {
        // Instancias de ataques de tipo eléctrico de la primera generación

        Habilidades Impactrueno = new Habilidades("Impactrueno", "Eléctrico", "Lanza una descarga eléctrica que puede paralizar al objetivo.", 30, 40);
        System.out.println("Nombre: " + Impactrueno.getNombreHabilidad());
        System.out.println("Tipo: " + Impactrueno.getTipo());
        System.out.println("Efecto: " + Impactrueno.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Impactrueno.getCantidadPp());
        System.out.println("Potencia: " + Impactrueno.getPotencia());

        Habilidades Trueno = new Habilidades("Trueno", "Eléctrico", "Lanza un rayo poderoso que puede paralizar al objetivo.", 10, 110);
        System.out.println("Nombre: " + Trueno.getNombreHabilidad());
        System.out.println("Tipo: " + Trueno.getTipo());
        System.out.println("Efecto: " + Trueno.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Trueno.getCantidadPp());
        System.out.println("Potencia: " + Trueno.getPotencia());

        Habilidades Rayo = new Habilidades("Rayo", "Eléctrico", "Lanza una potente descarga eléctrica que puede paralizar al objetivo.", 15, 90);
        System.out.println("Nombre: " + Rayo.getNombreHabilidad());
        System.out.println("Tipo: " + Rayo.getTipo());
        System.out.println("Efecto: " + Rayo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Rayo.getCantidadPp());
        System.out.println("Potencia: " + Rayo.getPotencia());

        Habilidades Onda_Trueno = new Habilidades("Onda Trueno", "Eléctrico", "Lanza una onda eléctrica que paraliza al objetivo.", 20, 0);
        System.out.println("Nombre: " + Onda_Trueno.getNombreHabilidad());
        System.out.println("Tipo: " + Onda_Trueno.getTipo());
        System.out.println("Efecto: " + Onda_Trueno.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Onda_Trueno.getCantidadPp());
        System.out.println("Potencia: " + Onda_Trueno.getPotencia());

        Habilidades Chispazo = new Habilidades("Chispazo", "Eléctrico", "Emite una chispa eléctrica que daña a todos los Pokémon cercanos.", 20, 65);
        System.out.println("Nombre: " + Chispazo.getNombreHabilidad());
        System.out.println("Tipo: " + Chispazo.getTipo());
        System.out.println("Efecto: " + Chispazo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Chispazo.getCantidadPp());
        System.out.println("Potencia: " + Chispazo.getPotencia());
    }
}