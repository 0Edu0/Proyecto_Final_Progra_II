/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduli
 */
public class QuerysMysql_Pokedex {    
    // Constructor vacío para la clase
    public QuerysMysql_Pokedex() {
    }
    
    // Método que realiza la consulta y devuelve un objeto Pokemon
    public List<Pokemon> realizarConsulta(String query) {
        ConexionDB conexionDB = new ConexionDB();
        Connection conn = conexionDB.estableceConexion();
       List<Pokemon> listaPokemon = new ArrayList<>();  // Lista para almacenar los Pokemones

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
                    pokemon.setNo_pokedex(rs.getString("NumeroPokedex"));
                    pokemon.setNombre(rs.getString("Nombre"));
                    pokemon.setDescripcion(rs.getString("Descripcion"));
              
                     listaPokemon.add(pokemon);
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
        
        return listaPokemon;
       }
    
    public void imprimirDetallesPokemon(Pokemon pokemon) {
        StringBuilder detalles = new StringBuilder();
        detalles.append("NumeroPokedex: ").append(pokemon.getNo_pokedex()).append("\n");
        detalles.append("Nombre: ").append(pokemon.getNombre()).append("\n");
        detalles.append("Descripcion: ").append(pokemon.getDescripcion()).append("\n");
        detalles.append("-------------------------------");

        System.out.println(detalles.toString());
    }
}

