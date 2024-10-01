package com.mycompany.proyecto_final;

import java.util.List;
import java.util.Scanner;

public class Pokedex {
    private PokemonService pokemonService;

    public Pokedex() {
        this.pokemonService = new PokemonService();
    }

    public void mostrarPokedex() {
        System.out.println("1. Ver Pokémon de tipo Agua");
        System.out.println("2. Ver Pokémon de tipo Fuego");
        System.out.println("3. Ver Pokémon de tipo Planta");
        System.out.println("4. Ver Pokémon de tipo Eléctrico");
        System.out.println("5. Ver Pokémon de tipo Hielo");
        System.out.println("6. Ver Pokémon de tipo Normal");
        System.out.println("7. Ver todos los Pokémon");

        int opcion = new Scanner(System.in).nextInt();

        switch (opcion) {
            case 1:
                mostrarPokemones("agua");
                break;
            case 2:
                mostrarPokemones("fuego");
                break;
            case 3:
                mostrarPokemones("planta");
                break;
            case 4:
                mostrarPokemones("electrico");
                break;
            case 5:
                mostrarPokemones("hielo");
                break;
            case 6:
                mostrarPokemones("normal");
                break;
            case 7:
                List<PokemonCombate> todosPokemones = pokemonService.obtenerTodosLosPokemones();
                for (PokemonCombate p : todosPokemones) {
                    System.out.println(p.getNombre());
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private void mostrarPokemones(String tipo) {
        List<PokemonCombate> pokemones = pokemonService.obtenerPokemonesPorTipo(tipo);
        for (PokemonCombate p : pokemones) {
            System.out.println(p.getNombre());
        }
    }
}
