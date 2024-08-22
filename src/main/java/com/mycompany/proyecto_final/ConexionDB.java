
package com.mycompany.proyecto_final;

import java.sql.Connection;
import javax.swing.JOptionPane;



public class ConexionDB {
    
    Connection conectar = null;
    String usuario = "root";
    String contraseña = "1423";
    String bd = "proyectofinalprogra";
    String ip = "localhost";
    String puerto = "3306";
     
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.jdb.Driver");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base de datos, error: "+ e.toString());
        }    
    }   
}
