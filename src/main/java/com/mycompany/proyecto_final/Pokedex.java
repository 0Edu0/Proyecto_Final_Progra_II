
package com.mycompany.proyecto_final;

import java.util.ArrayList;

public class Pokedex {
    
    int CantPokemonGuardados;
    ArrayList<Pokemon>listadoPokemons;

    public Pokedex(int CantPokemonGuardados, ArrayList<Pokemon> listadoPokemons) {
        this.CantPokemonGuardados = CantPokemonGuardados;
        this.listadoPokemons = listadoPokemons;
    }

    public int getCantPokemonGuardados() {
        return CantPokemonGuardados;
    }

    public void setCantPokemonGuardados(int CantPokemonGuardados) {
        this.CantPokemonGuardados = CantPokemonGuardados;
    }

    public ArrayList<Pokemon> getListadoPokemons() {
        return listadoPokemons;
    }

    public void setListadoPokemons(ArrayList<Pokemon> listadoPokemons) {
        this.listadoPokemons = listadoPokemons;
    }
    
    
    
    
}
