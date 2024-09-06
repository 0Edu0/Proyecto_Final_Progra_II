/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

import java.util.ArrayList;

/**
 *
 * @author eduli
 */
public class PokemonCombateAgua{
    public static void pokemonCombate_Agua(String[] args) {
        
        //Habilidades tipo agua
        Habilidades Pistola_Agua = new Habilidades("Pistola Agua", "Agua", "Lanza un chorro de agua que inflige daño a los Pokémon rivales a los que golpea.", 25, 100);
        Habilidades Hidrobomba = new Habilidades("Hidrobomba", "Agua", "Lanza un potente chorro de agua que inflige gran daño.", 5, 110);
        Habilidades Surf = new Habilidades("Surf", "Agua", "Genera una ola grande que golpea a todos los Pokémon rivales.", 15, 90);
        Habilidades Cascada = new Habilidades("Cascada", "Agua", "Ataca al objetivo con una poderosa corriente de agua.", 15, 80);

        //Squirtle
        ArrayList<Habilidades> habilidadesSquirtle = new ArrayList<>();
        habilidadesSquirtle.add(Pistola_Agua);
        habilidadesSquirtle.add(Hidrobomba);
        habilidadesSquirtle.add(Surf);
        habilidadesSquirtle.add(Cascada);
        
        PokemonCombate Squirtle = new PokemonCombate("Squirtle", "Masculino", 15, 20, 1, 0, habilidadesSquirtle, "Pokémon de tipo Agua. Fuerte defensa.");
        System.out.println("Nombre: " + Squirtle.getNombre());
        System.out.println("Género: " + Squirtle.getGenero());
        System.out.println("HP Base: " + Squirtle.getHp_base());
        System.out.println("PP Base: " + Squirtle.getPp_base());
        System.out.println("Nivel: " + Squirtle.getNivel());
        System.out.println("Descripción: " + Squirtle.getDescripcion());
        
        System.out.println("Habilidades:");
        for (Habilidades habilidad : Squirtle.getHabilidades()) {
            System.out.println(" - " + habilidad.getNombreHabilidad() + " (" + habilidad.getTipo() + "): " + habilidad.getEfectoEnCombate());
        }
    } 
}