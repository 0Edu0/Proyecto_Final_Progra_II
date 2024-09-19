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
public class HabilidadesPlanta {
    public static void habilidadesPlanta(String[] args) {
        // Instancias de ataques de tipo planta de la primera generación

        Habilidades Latigo_Cepa = new Habilidades("Látigo Cepa", "Planta", "Ataca al objetivo con un látigo hecho de cepas.", 25, 45);
        System.out.println("Nombre: " + Latigo_Cepa.getNombreHabilidad());
        System.out.println("Tipo: " + Latigo_Cepa.getTipo());
        System.out.println("Efecto: " + Latigo_Cepa.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Latigo_Cepa.getCantidadPp());
        System.out.println("Potencia: " + Latigo_Cepa.getPotencia());

        Habilidades Hoja_Afilada = new Habilidades("Hoja Afilada", "Planta", "Corta al objetivo con hojas afiladas, alta probabilidad de golpe crítico.", 25, 55);
        System.out.println("Nombre: " + Hoja_Afilada.getNombreHabilidad());
        System.out.println("Tipo: " + Hoja_Afilada.getTipo());
        System.out.println("Efecto: " + Hoja_Afilada.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Hoja_Afilada.getCantidadPp());
        System.out.println("Potencia: " + Hoja_Afilada.getPotencia());

        Habilidades Drenadoras = new Habilidades("Drenadoras", "Planta", "Planta semillas en el objetivo para drenar su energía cada turno.", 10, 0);
        System.out.println("Nombre: " + Drenadoras.getNombreHabilidad());
        System.out.println("Tipo: " + Drenadoras.getTipo());
        System.out.println("Efecto: " + Drenadoras.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Drenadoras.getCantidadPp());
        System.out.println("Potencia: " + Drenadoras.getPotencia());

        Habilidades Rayo_Solar = new Habilidades("Rayo Solar", "Planta", "Carga energía en el primer turno y ataca con un rayo solar en el segundo.", 10, 120);
        System.out.println("Nombre: " + Rayo_Solar.getNombreHabilidad());
        System.out.println("Tipo: " + Rayo_Solar.getTipo());
        System.out.println("Efecto: " + Rayo_Solar.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Rayo_Solar.getCantidadPp());
        System.out.println("Potencia: " + Rayo_Solar.getPotencia());

        Habilidades Somnifero = new Habilidades("Somnífero", "Planta", "Esparce esporas que hacen dormir al objetivo.", 15, 0);
        System.out.println("Nombre: " + Somnifero.getNombreHabilidad());
        System.out.println("Tipo: " + Somnifero.getTipo());
        System.out.println("Efecto: " + Somnifero.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Somnifero.getCantidadPp());
        System.out.println("Potencia: " + Somnifero.getPotencia());

        Habilidades Megaagotar = new Habilidades("Megaagotar", "Planta", "Absorbe la energía del objetivo, recuperando la mitad del daño causado.", 10, 40);
        System.out.println("Nombre: " + Megaagotar.getNombreHabilidad());
        System.out.println("Tipo: " + Megaagotar.getTipo());
        System.out.println("Efecto: " + Megaagotar.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Megaagotar.getCantidadPp());
        System.out.println("Potencia: " + Megaagotar.getPotencia());

        Habilidades Polvo_Veneno = new Habilidades("Polvo Veneno", "Planta", "Esparce polvo venenoso que envenena al objetivo.", 35, 0);
        System.out.println("Nombre: " + Polvo_Veneno.getNombreHabilidad());
        System.out.println("Tipo: " + Polvo_Veneno.getTipo());
        System.out.println("Efecto: " + Polvo_Veneno.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Polvo_Veneno.getCantidadPp());
        System.out.println("Potencia: " + Polvo_Veneno.getPotencia());
    }
}