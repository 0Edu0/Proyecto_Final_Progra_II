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
    
    // Método que realiza la consulta y devuelve un objeto Pokemon
    public List<Pokemon> realizarConsulta(String query) {
        ConexionDB conexionDB = new ConexionDB();
        Connection conn = conexionDB.estableceConexion();
       List<Pokemon> listaPokemones = new ArrayList<>();  // Lista para almacenar los Pokemones

        if (conn != null) {
            try {
                // Crear un objeto Statement para ejecutar la consulta
                Statement stmt = conn.createStatement();
                
                // Ejecutar la consulta y obtener los resultados
                ResultSet rs = stmt.executeQuery(query);
      
                // Iterar sobre los resultados utilizando un ciclo while
                while (rs.next()) {
                    // Crear un nuevo objeto Pokemon para cada registro
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
                
                // Cerrar los recursos
                rs.close();
                stmt.close();
                conn.close();
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No se pudo establecer la conexión a la base de datos.");
        }
        
        return listaPokemones;
       }
    
    public void imprimirDetallesPokemon(Pokemon pokemon) {
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

