package com.mycompany.proyecto_final;

import java.util.List;

public class TipoPokemon {

    public void getPokemonesDeAgua() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT * FROM proyectofinalprogra.pokemon_agua;";
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
               querymysql. imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No existen Pokemones de Agua");
        }
    }
    
     public void getPokemonesDeFuego() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT * FROM proyectofinalprogra.pokemon_fuego;";
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
               querymysql. imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No existen Pokemones de fuego");
        }
    }

      public void getPokemonesDeElectrico() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT * FROM proyectofinalprogra.pokemon_electrico;";
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
               querymysql. imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No existen Pokemones Electricos");
        }
    }
      
 
       public void getPokemonesDeHielo() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT * FROM proyectofinalprogra.pokemon_hielo;";
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
               querymysql. imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No existen Pokemones de huielo");
        }
    }
       
       
        public void getPokemonesDePlanta() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT * FROM proyectofinalprogra.pokemon_planta;";
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
               querymysql. imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No existen Pokemones planta");
        }
    }
     
          public void getPokemonesNormales() {
        QuerysMysql querymysql = new QuerysMysql();
        String query = "SELECT * FROM proyectofinalprogra.pokemon_normal;";
        List<Pokemon> pokemones = querymysql.realizarConsulta(query);
        
        if (pokemones != null && !pokemones.isEmpty()) {
            for (Pokemon pokemon : pokemones) {
               querymysql. imprimirDetallesPokemon(pokemon);
            }
        } else {
            System.out.println("No existen Pokemones Normales");
        }
    }
       
}
