/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Familia Niño
 */
public class Singleton {
    private static Singleton instance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/jdbc";
    private String username = "postgres";
    private String password = "123456";
    private Singleton() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("La creacion de la base de datos ha fallado : " + ex.getMessage());
        }
    }
    public Connection getConnection() {
        return connection;
    }
    
    public static Singleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new Singleton();
        } else if (instance.getConnection().isClosed()) {
            instance = new Singleton();
        }
        return instance;
    }
}
