package org.example.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String baseDatos;
    public static org.example.persistencia.Conexion _instance;
    private Connection connection;

    private Conexion(String baseDatos) {
        this.baseDatos = baseDatos;
        try {
            Class.forName("tacitnessMetroCDMXDB.db"); //****
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static org.example.persistencia.Conexion getInstance(String baseDatos){
        if (_instance == null){
            _instance = new org.example.persistencia.Conexion(baseDatos);
        }else{
            System.out.println("Ya fue creada");
        }
        return _instance;
    }


    public Connection getConnection() {
        return connection;
    }


}


