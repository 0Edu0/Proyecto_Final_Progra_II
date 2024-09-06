package com.mycompany.proyecto_final;
import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    public void getTodosLosPokemon() {
    QuerysMysql_Pokedex querymysql = new QuerysMysql_Pokedex();
    String query = "SELECT * FROM proyectofinalprograii.todos;";
    List<Pokemon> pokemones = querymysql.realizarConsulta(query);
    
    if (pokemones != null && !pokemones.isEmpty()){
        for (Pokemon pokemon : pokemones){
            querymysql. imprimirDetallesPokemon(pokemon);
        }
    }else {
            System.out.println("No se ha registrado ningun Pokemon");
          }
    }
}