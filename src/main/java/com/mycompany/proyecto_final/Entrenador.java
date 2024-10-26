package com.mycompany.proyecto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrenador {
    private String nombre;
    private List<PokemonCombate> equipo;
    private boolean esComputadora;

    public Entrenador(String nombre, boolean esComputadora) {
        this.nombre = nombre;
        this.esComputadora = esComputadora;
        this.equipo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<PokemonCombate> getEquipo() {
        return equipo;
    }

    public void agregarPokemon(PokemonCombate pokemon) {
        if (equipo.size() < 3) {
            equipo.add(pokemon);
        } else {
            System.out.println("El equipo ya tiene 3 Pokémon.");
        }
    }

    public boolean esComputadora() {
        return esComputadora;
    }

    public PokemonCombate seleccionarPokemonActivo() {
        for (PokemonCombate pokemon : equipo) {
            if (pokemon.getHp() > 0) {
                return pokemon;
            }
        }
        return null;
    }

    public boolean tienePokemonVivos() {
        for (PokemonCombate pokemon : equipo) {
            if (pokemon.getHp() > 0) {
                return true;
            }
        }
        return false;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo de " + nombre + ":");
        for (int i = 0; i < equipo.size(); i++) {
            PokemonCombate pokemon = equipo.get(i);
            System.out.println((i + 1) + ". " + pokemon.getNombre() + " (HP: " + pokemon.getHp() + ")");
        }
    }
    
    public void incrementarCombatesGanados(){
        for (PokemonCombate pokemon : equipo){
            pokemon.incrementarCombatesGanados();
        }
    }

    // Método para que el jugador seleccione su equipo
    public void seleccionarEquipo(Scanner scanner) {
        PokemonService pokemonService = new PokemonService();
        for (int i = 0; i < 3; i++) {
            System.out.println("Selecciona un tipo de Pokémon: agua, fuego, planta, electrico, hielo, normal");
            String tipo = scanner.nextLine().toLowerCase();

            List<PokemonCombate> pokemones = pokemonService.obtenerPokemonesPorTipo(tipo);
            if (pokemones.isEmpty()) {
                System.out.println("No hay Pokémon disponibles de este tipo.");
                i--;  // Reintentar si el tipo no tiene pokémones
                continue;
            }

            System.out.println("Elige un Pokémon de los siguientes:");
            for (int j = 0; j < pokemones.size(); j++) {
                PokemonCombate pokemon = pokemones.get(j);
                System.out.println((j + 1) + ". " + pokemon.getNombre() + " (HP: " + pokemon.getHp() + ")");
            }

            int opcionPokemon = scanner.nextInt();
            scanner.nextLine();
            PokemonCombate pokemonSeleccionado = pokemones.get(opcionPokemon - 1);
            agregarPokemon(pokemonSeleccionado);

            System.out.println("Has añadido a " + pokemonSeleccionado.getNombre() + " a tu equipo.");
        }
    }

    // Método para que la computadora seleccione su equipo aleatoriamente
    public void seleccionarEquipoAleatorio() {
        PokemonService pokemonService = new PokemonService();
        
        for (int i = 0; i < 3; i++) {
            // Seleccionar un tipo de Pokémon aleatorio
            String[] tipos = {"agua", "fuego", "planta", "electrico", "hielo", "normal"};
            String tipoSeleccionado = tipos[(int)(Math.random() * tipos.length)];
            
            List<PokemonCombate> pokemones = pokemonService.obtenerPokemonesPorTipo(tipoSeleccionado);

            if (pokemones.isEmpty()) {
                i--;  // Si no hay pokémones de este tipo, intentar de nuevo
                continue;
            }

            // Seleccionar un Pokémon aleatorio dentro del tipo seleccionado
            PokemonCombate pokemonSeleccionado = pokemones.get((int)(Math.random() * pokemones.size()));
            agregarPokemon(pokemonSeleccionado);
            
            System.out.println("La computadora ha añadido a " + pokemonSeleccionado.getNombre() + " (Tipo: " + tipoSeleccionado + ")");
        }
    }
}
