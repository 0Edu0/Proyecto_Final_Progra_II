
package com.mycompany.proyecto_final;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class EquipoPokemon {
    private List<Pokemon> pokemones;

    public EquipoPokemon() {
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        this.pokemones.add(pokemon);
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    // Métodos para interactuar con el equipo
}

