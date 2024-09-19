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
public class HabilidadesFuego {
    public static void habilidadesFuego(String[] args) {
        // Instancias de ataques de tipo fuego de la primera generación

        Habilidades Ascuas = new Habilidades("Ascuas", "Fuego", "Lanza pequeñas llamas que pueden quemar al objetivo.", 25, 40);
        System.out.println("Nombre: " + Ascuas.getNombreHabilidad());
        System.out.println("Tipo: " + Ascuas.getTipo());
        System.out.println("Efecto: " + Ascuas.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Ascuas.getCantidadPp());
        System.out.println("Potencia: " + Ascuas.getPotencia());

        Habilidades Lanzallamas = new Habilidades("Lanzallamas", "Fuego", "Emite un poderoso chorro de fuego que puede quemar al objetivo.", 15, 90);
        System.out.println("Nombre: " + Lanzallamas.getNombreHabilidad());
        System.out.println("Tipo: " + Lanzallamas.getTipo());
        System.out.println("Efecto: " + Lanzallamas.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Lanzallamas.getCantidadPp());
        System.out.println("Potencia: " + Lanzallamas.getPotencia());

        Habilidades Anillo_Ígneo = new Habilidades("Anillo Ígneo", "Fuego", "Crea un anillo de fuego que rodea y daña al objetivo.", 15, 70);
        System.out.println("Nombre: " + Anillo_Ígneo.getNombreHabilidad());
        System.out.println("Tipo: " + Anillo_Ígneo.getTipo());
        System.out.println("Efecto: " + Anillo_Ígneo.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Anillo_Ígneo.getCantidadPp());
        System.out.println("Potencia: " + Anillo_Ígneo.getPotencia());

        Habilidades Llamarada = new Habilidades("Llamarada", "Fuego", "Lanza una explosión de fuego que inflige gran daño y puede quemar al objetivo.", 5, 110);
        System.out.println("Nombre: " + Llamarada.getNombreHabilidad());
        System.out.println("Tipo: " + Llamarada.getTipo());
        System.out.println("Efecto: " + Llamarada.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Llamarada.getCantidadPp());
        System.out.println("Potencia: " + Llamarada.getPotencia());

        Habilidades Giro_Fuego = new Habilidades("Giro Fuego", "Fuego", "Atrapa al objetivo en un remolino de fuego que causa daño durante 4-5 turnos.", 15, 35);
        System.out.println("Nombre: " + Giro_Fuego.getNombreHabilidad());
        System.out.println("Tipo: " + Giro_Fuego.getTipo());
        System.out.println("Efecto: " + Giro_Fuego.getEfectoEnCombate());
        System.out.println("Cantidad PP: " + Giro_Fuego.getCantidadPp());
        System.out.println("Potencia: " + Giro_Fuego.getPotencia());
    }
}