package com.mycompany.proyecto_final;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {

    private int cantPokemonGuardados; 
    private ArrayList<Pokemon> listadoPokemons;

    // Constructor
    public Pokedex() {
        this.cantPokemonGuardados = 0;
        this.listadoPokemons = new ArrayList<>();
    }

    // Getters y Setters
    public int getCantPokemonGuardados() {
        return cantPokemonGuardados;
    }

    public void setCantPokemonGuardados(int cantPokemonGuardados) {
        this.cantPokemonGuardados = cantPokemonGuardados;
    }

    public ArrayList<Pokemon> getListadoPokemons() {
        return listadoPokemons;
    }

    public void setListadoPokemons(ArrayList<Pokemon> listadoPokemons) {
        this.listadoPokemons = listadoPokemons;
    }

    // Método para obtener todos los Pokémon
    public void getTodosLosPokemon() {
        QuerysMysql_Pokedex querymysql = new QuerysMysql_Pokedex();
        String query = "SELECT * FROM proyectofinalprograii.todos;";
        
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
                querymysql.imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No se ha registrado ningún Pokémon.");
        }
    }

    // Método para obtener una lista básica de Pokémon
    public void getTodosPokemones() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT no_pokedex, nombre FROM todos_pokemones";  // Usando la vista

        List<Pokemon> pokemones = querymysql.realizarConsultaBasica(query);

        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
                querymysql.imprimirDetallesPokemonBasico(pokemon);
            }
        } else {
            System.out.println("No se encontraron Pokémon en la base de datos.");
        }
    }
}