package com.mycompany.proyecto_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

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
                int combatesGanados = rs.getInt("combates_ganados");
                boolean evolucionado = rs.getBoolean("evolucionado");

                // Convertir los movimientos de la base de datos (cadena separada por comas)
                ArrayList<Movimiento> movimientos = obtenerMovimientosDesdeCadena(movimientosStr);

                PokemonCombate pokemonCombate = new PokemonCombate(nombre, hpBase, ppBase, movimientos);
                pokemonCombate.setCombatesGanados(combatesGanados);
                pokemonCombate.setEvolucionado(evolucionado);
                pokemones.add(pokemonCombate);
            }
        } catch (Exception e) {
            System.out.println("Error al obtener Pokémon: " + e.getMessage());
        }
        return pokemones;
    }
    
        // Método para evolucionar un Pokémon usando una piedra
    public void evolucionarConPiedra(String tipoPiedra, String nombrePokemon) {
        try (Connection conn = conexionDB.estableceConexion();
             PreparedStatement stmt = conn.prepareStatement("SELECT evolucion FROM todos_pokemones WHERE nombre = ? AND piedra_evolutiva = ?")) {
            stmt.setString(1, nombrePokemon);
            stmt.setString(2, tipoPiedra);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombreEvolucion = rs.getString("evolucion");
                System.out.println(nombrePokemon + " ha evolucionado a " + nombreEvolucion + " usando una " + tipoPiedra + "!");
                actualizarEvolucionEnDB(nombrePokemon, nombreEvolucion);
            } else {
                System.out.println(nombrePokemon + " no puede evolucionar con una " + tipoPiedra + ".");
            }
        } catch (Exception e) {
            System.out.println("Error al evolucionar con piedra: " + e.getMessage());
        }
    }
    
        private void actualizarEvolucionEnDB(String nombrePokemon, String nombreEvolucion) {
        try (Connection conn = conexionDB.estableceConexion();
             PreparedStatement stmt = conn.prepareStatement("UPDATE todos_pokemones SET nombre = ? WHERE nombre = ?")) {
            stmt.setString(1, nombreEvolucion);
            stmt.setString(2, nombrePokemon);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al actualizar evolución: " + e.getMessage());
        }
    }
    
    /*public List<Evolucion_Piedras> obtenerPokemonPiedraPorTipo(String tipo) {
        List<Evolucion_Piedras> pokemon = new ArrayList<>();
        String query = "";
        
        switch(tipo.toLowerCase()){
            case "agua":
                query = "SELECT nombre FROM pokemon_agua WHERE nombre = 'Poliwhirl'";
                query = "SELECT nombre FROM pokemon_agua WHERE nombre = 'Shellder'";
                query = "SELECT nombre FROM pokemon_agua WHERE nombre = 'Staryu'";
                query = "SELECT nombre FROM pokemon_agua WHERE nombre = 'Eevee'";
            break;
            case "fuego":
                query = "SELECT nombre FROM pokemon_fuego WHERE nombre = 'Vulpix'";
                query = "SELECT nombre FROM pokemon_fuego WHERE nombre = 'Growlithe'";
                query = "SELECT nombre FROM pokemon_fuego WHERE nombre = 'Eevee'";
                break;
            case "planta":
                query = "SELECT nombre FROM pokemon_planta WHERE nombre = 'Gloom'";
                query = "SELECT nombre FROM pokemon_planta WHERE nombre = 'Weepinbell'";
                query = "SELECT nombre FROM pokemon_planta WHERE nombre = 'Exeggcute'";
                break;
            case "electrico":
                query = "SELECT nombre FROM pokemon_electrico WHERE nombre = 'Pikachu'";
                query = "SELECT nombre FROM pokemon_electrico WHERE nombre = 'Eevee'";
                break;
            case "normal":
                query = "SELECT nombre FROM pokemon_normal WHERE nombre = 'Nidorina'";
                query = "SELECT nombre FROM pokemon_normal WHERE nombre = 'Nidorino'";
                query = "SELECT nombre FROM pokemon_normal WHERE nombre = 'Clefairy'";
                query = "SELECT nombre FROM pokemon_normal WHERE nombre = 'Jigglypuff'";
                break;
            default:
                System.out.println("Tipo de Pokémon no válido.");
                return pokemon;
        }
        try (Connection conn = conexionDB.estableceConexion();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)){
            
            while (rs.next()){
                String nombreStr = rs.getString("nombre");
                int hpBase = rs.getInt("hp_base");
                int ppBase = rs.getInt("pp_base");
                
                ArrayList<Nombre> nombres = obtenerNombresDesdeCadena(nombreStr);
                
                Evolucion_Piedras evolucionPiedras = new Evolucion_Piedras(nombres, hpBase, ppBase);
                pokemon.add(evolucionPiedras);
            }
        }   catch (Exception e){
            System.out.println("Error al obtener Pokemon: " + e.getMessage());
        }
        return pokemon;
    }
*/
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
