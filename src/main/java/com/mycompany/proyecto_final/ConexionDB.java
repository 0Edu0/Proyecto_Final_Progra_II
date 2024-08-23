
package com.mycompany.proyecto_final;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class ConexionDB {
    
    Connection conectar = null;
    String usuario = "root";
    String contrasenia = "1423";
    String bd = "proyectofinalprogra";
    String ip = "localhost";
    String puerto = "3306";
     
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, contrasenia);
            JOptionPane.showMessageDialog(null, "Se conecto a la base de datos");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base de datos, error: "+ e.toString());
        }    
        return conectar;
    }   
}
