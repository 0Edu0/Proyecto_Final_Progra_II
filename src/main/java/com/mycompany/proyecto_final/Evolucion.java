package com.mycompany.proyecto_final;

public class Evolucion {
    private Pokemon pokemon;
    private String piedraEvolutiva; // Si es que evoluciona por piedra
    private int nivelRequerido;      // Si es que evoluciona por nivel

    public Evolucion(Pokemon pokemon, int nivelRequerido, String piedraEvolutiva) {
        this.pokemon = pokemon;
        this.nivelRequerido = nivelRequerido;
        this.piedraEvolutiva = piedraEvolutiva;
    }

    public boolean puedeEvolucionar() {
        // Lógica para verificar si el Pokémon puede evolucionar
        return pokemon.getNivel() >= nivelRequerido || piedraEvolutiva != null;
    }

    public void evolucionar() {
        if (puedeEvolucionar()) {
            System.out.println(pokemon.getNombre() + " está evolucionando!");
            // Aquí podrías incluir la lógica para cambiar el Pokémon a su evolución
            // Por ejemplo, cambiar el nombre o crear un nuevo objeto Pokémon
        } else {
            System.out.println(pokemon.getNombre() + " no puede evolucionar.");
        }
    }
}
