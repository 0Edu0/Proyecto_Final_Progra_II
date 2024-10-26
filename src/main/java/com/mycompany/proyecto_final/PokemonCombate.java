package com.mycompany.proyecto_final;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PokemonCombate {
    private String nombre;
    private int hp;
    private int pp;
    private ArrayList<Movimiento> movimientos;
    private int combatesGanados;
    private boolean evolucionado;
    private ConexionDB conexionDB;

    public PokemonCombate(String nombre, int hp, int pp, ArrayList<Movimiento> movimientos) {
        this.nombre = nombre;
        this.hp = hp;
        this.pp = pp;
        this.movimientos = movimientos;
        this.combatesGanados = 0;
        this.evolucionado = false;
        this.conexionDB = new ConexionDB();
    }

    public boolean isEvolucionado() {
        return evolucionado;
    }

    public void setEvolucionado(boolean evolucionado) {
        this.evolucionado = evolucionado;
    }

    public int getCombatesGanados() {
        return combatesGanados;
    }

    public void setCombatesGanados(int combatesGanados) {
        this.combatesGanados = combatesGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
    
    public void incrementarCombatesGanados(){
        this.combatesGanados++;
        System.out.println("Combates ganados incrementados a " + this.combatesGanados);
        actualizarCombatesGanadosEnDB();
    }
    
    public void evolucionar(){
        if (!evolucionado && obtenerCombatesGanadosDesdeDB() >= 1){
            System.out.println(nombre + " ha evolucionado!");
            this.nombre = "Evolución de " + this.nombre;
            this.hp += 50;
            this.pp += 20;
            this.evolucionado = true;
            actualizarEvolucionEnDB();
        }
    }
    
    public int obtenerCombatesGanadosDesdeDB(){
        int combatesGanadosDB = 0;
            try (Connection conn = conexionDB.estableceConexion();
                 PreparedStatement stmt = conn.prepareStatement("SELECT combates_ganados FROM todos_pokemones WHERE nombre = ?")) {
                stmt.setString(1, this.nombre);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    combatesGanadosDB = rs.getInt("combates_ganados");
                }
            } catch (Exception e) {
                System.out.println("Error al obtener combates ganados desde la base de datos: " + e.getMessage());
            }
            return combatesGanadosDB;
    }
    
    private void actualizarCombatesGanadosEnDB(){
        try (Connection conn = conexionDB.estableceConexion();
                PreparedStatement stmt = conn.prepareStatement("UPDATE todos_pokemones SET combates_ganados = ? WHERE nombre = ?")){
                    stmt.setInt(1, this.combatesGanados);
                    stmt.setString(2, this.nombre);
                    stmt.executeUpdate();
                } catch (Exception e){
                    System.out.println("Error al actualizar combates ganados: " + e.getMessage());
                }
    }
    
    private void actualizarEvolucionEnDB() {
        try (Connection conn = conexionDB.estableceConexion();
                PreparedStatement stmt = conn.prepareStatement("UPDATE todos_pokemones SET evolucionado = ? WHERE nombre = ?")){
            stmt.setBoolean(1, this.evolucionado);
            stmt.setString(2, this.nombre);
            stmt.executeUpdate();
        } catch (Exception e){
            System.out.println("Error al actualizar combates ganados: " + e.getMessage());
        }
    }

    public void mostrarMovimientos() {
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.println((i + 1) + ". " + movimientos.get(i).getNombre() + " (Poder: " + movimientos.get(i).getPoder() + ")");
        }
    }

    public void recibirDanio(int danio) {
        this.hp -= danio;
        if (hp < 0) {
            hp = 0;
        }
    }
}
