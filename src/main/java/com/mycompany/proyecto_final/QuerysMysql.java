package com.mycompany.proyecto_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class QuerysMysql {

    // Constructor vacío para la clase
    public QuerysMysql() {
    }

    // Método para consultas básicas (solo no_pokedex y nombre)
    public List<Pokemon> realizarConsultaBasica(String query) {
        ConexionDB conexionDB = new ConexionDB();
        Connection conn = conexionDB.estableceConexion();
        List<Pokemon> listaPokemones = new ArrayList<>();  // Lista para almacenar los Pokemones

        if (conn != null) {
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    Pokemon pokemon = new Pokemon();
                    pokemon.setNo_pokedex(rs.getString("no_pokedex"));
                    pokemon.setNombre(rs.getString("nombre"));
                    listaPokemones.add(pokemon);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }

        return listaPokemones;
    }

    // Método para consultas detalladas (todos los campos)
    public List<Pokemon> realizarConsultaDetallada(String query) {
        ConexionDB conexionDB = new ConexionDB();
        Connection conn = conexionDB.estableceConexion();
        List<Pokemon> listaPokemones = new ArrayList<>();  // Lista para almacenar los Pokemones

        if (conn != null) {
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(query)) {

                while (rs.next()) {
                    Pokemon pokemon = new Pokemon();
                    pokemon.setNo_pokedex(rs.getString("no_pokedex"));
                    pokemon.setNombre(rs.getString("nombre"));
                    pokemon.setHp_base(rs.getString("hp_base"));
                    pokemon.setPp_base(rs.getString("pp_base"));
                    pokemon.setPrimer_movimiento(rs.getString("primer_movimiento"));
                    pokemon.setEvolucion(rs.getString("evolucion"));
                    pokemon.setNivel_evolucion(rs.getString("nivel_evolucion"));
                    pokemon.setMovimientos(rs.getString("movimientos"));
                    listaPokemones.add(pokemon);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }

        return listaPokemones;
    }

    // Método para imprimir detalles básicos
    public void imprimirDetallesPokemonBasico(Pokemon pokemon) {
        StringBuilder detalles = new StringBuilder();
        detalles.append("No_pokedex: ").append(pokemon.getNo_pokedex()).append("\n");
        detalles.append("Nombre: ").append(pokemon.getNombre()).append("\n");
        detalles.append("-------------------------------");

        System.out.println(detalles.toString());
    }

    // Método para imprimir detalles completos
    public void imprimirDetallesPokemonDetallado(Pokemon pokemon) {
        StringBuilder detalles = new StringBuilder();
        detalles.append("No_pokedex: ").append(pokemon.getNo_pokedex()).append("\n");
        detalles.append("Nombre: ").append(pokemon.getNombre()).append("\n");
        detalles.append("Hp_Base: ").append(pokemon.getHp_base()).append("\n");
        detalles.append("PP_Base: ").append(pokemon.getPp_base()).append("\n");
        detalles.append("Primer Movimiento: ").append(pokemon.getPrimer_movimiento()).append("\n");
        detalles.append("Evolución: ").append(pokemon.getEvolucion()).append("\n");
        detalles.append("Nivel Evolución: ").append(pokemon.getNivel_evolucion()).append("\n");
        detalles.append("Movimientos: ").append(pokemon.getMovimientos()).append("\n");
        detalles.append("-------------------------------");

        System.out.println(detalles.toString());
    }
}

