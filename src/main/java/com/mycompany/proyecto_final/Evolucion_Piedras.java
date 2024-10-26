/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_final;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author eduli
 */
public class Evolucion_Piedras {
    private String nombre;
    private int hp;
    private int pp;
    private ConexionDB conexionDB;

    public Evolucion_Piedras(String nombre, int hp, int pp) {
        this.nombre = nombre;
        this.hp = hp;
        this.pp = pp;
        this.conexionDB = new ConexionDB();
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public int getPp() {
        return pp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }
    
    
}


