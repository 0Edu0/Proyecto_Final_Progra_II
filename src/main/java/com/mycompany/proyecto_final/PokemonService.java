package com.mycompany.proyecto_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PokemonService {
    private ConexionDB conexionDB;

    public PokemonService() {
        this.conexionDB = new ConexionDB();
    }

    // Mostrar todos los Pokémon de la tabla especificada por tipo
    public List<PokemonCombate> obtenerPokemonesPorTipo(String tipo) {
        List<PokemonCombate> pokemones = new ArrayList<>();
        String query = "";

        switch (tipo.toLowerCase()) {
            case "agua":
                query = "SELECT * FROM pokemon_agua";
                break;
            case "fuego":
                query = "SELECT * FROM pokemon_fuego";
                break;
            case "planta":
                query = "SELECT * FROM pokemon_planta";
                break;
            case "electrico":
                query = "SELECT * FROM pokemon_electrico";
                break;
            case "hielo":
                query = "SELECT * FROM pokemon_hielo";
                break;
            case "normal":
                query = "SELECT * FROM pokemon_normal";
                break;
            default:
                System.out.println("Tipo de Pokémon no válido.");
                return pokemones;
        }

        try (Connection conn = conexionDB.estableceConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int hpBase = rs.getInt("hp_base");
                int ppBase = rs.getInt("pp_base");
                String movimientosStr = rs.getString("movimientos");

                // Convertir los movimientos de la base de datos (cadena separada por comas)
                ArrayList<Movimiento> movimientos = obtenerMovimientosDesdeCadena(movimientosStr);

                PokemonCombate pokemonCombate = new PokemonCombate(nombre, hpBase, ppBase, movimientos);
                pokemones.add(pokemonCombate);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener Pokémon: " + e.getMessage());
        }
        return pokemones;
    }

    // Mostrar todos los Pokémon (modificado para devolver PokemonCombate también)
    public List<PokemonCombate> obtenerTodosLosPokemones() {
        List<PokemonCombate> pokemones = new ArrayList<>();
        String query = "SELECT * FROM todos_pokemones";

        try (Connection conn = conexionDB.estableceConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int hpBase = 100;  // Default value if no specific HP in todos_pokemones
                int ppBase = 40;   // Default value if no specific PP in todos_pokemones
                String movimientosStr = "Placaje";  // Default movement, adjust as necessary

                ArrayList<Movimiento> movimientos = obtenerMovimientosDesdeCadena(movimientosStr);

                PokemonCombate pokemonCombate = new PokemonCombate(nombre, hpBase, ppBase, movimientos);
                pokemones.add(pokemonCombate);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener todos los Pokémon: " + e.getMessage());
        }
        return pokemones;
    }

    // Función para convertir una cadena de movimientos en una lista de objetos Movimiento
    private ArrayList<Movimiento> obtenerMovimientosDesdeCadena(String movimientosStr) {
        ArrayList<Movimiento> movimientos = new ArrayList<>();
        if (movimientosStr != null && !movimientosStr.isEmpty()) {
            String[] movimientosArray = movimientosStr.split(",");
            for (String mov : movimientosArray) {
                // Crear un movimiento con un poder predeterminado (puedes ajustar esto)
                movimientos.add(new Movimiento(mov.trim(), 50)); // Ejemplo: poder de 50 para todos los movimientos
            }
        }
        return movimientos;
    }
}
