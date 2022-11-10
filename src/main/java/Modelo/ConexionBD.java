/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author steven
 */
public class ConexionBD {

    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;

    public ConexionBD(Connection conectar, String BD, String usuario, String contra) {
        this.conectar = conectar;
        this.BD = BD;
        this.usuario = usuario;
        this.contra = contra;
    }

    public ConexionBD() {
        this.conectar = null;
        this.BD = "";
        this.usuario = "";
        this.contra = "";
    }

    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.BD = "jdbc:postgresql://ec2-44-207-253-50.compute-1.amazonaws.com:5432/d2n3hnc6l454vl";
            this.usuario = "xyscoabwpukdbk";
            this.contra = "aca4e9e08586d019949a97b129e46bde85d75399aa161de8a001784c62862e3f";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {
            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConexion() {
        return conectar;
    }
}
