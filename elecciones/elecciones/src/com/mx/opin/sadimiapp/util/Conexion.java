/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.opin.sadimiapp.util;

//import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.Resultset;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
/**
 *
 * @author krn
 */
public class Conexion implements Serializable {

    public Connection con = null;

    public Conexion() {
        con = Conexion.conectar();
    }

    public Connection getCon() {
        return con;
    }

    public static Connection conectar() {
        Connection c = null;
        String url = "jdbc:mysql://localhost/registro";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(url, username, password);
           // Statement statement = c.createStatement();
            
        } catch (SQLException e) {
            System.out.println("error " + e);
        } catch (ClassNotFoundException ex) {
            System.out.println("error 2: " + ex);
        }
        return c;
    }

    public boolean ejecutarSql(PreparedStatement sentencia) {
        try {
            sentencia.execute();
            sentencia.close();
            return true;
        } catch (Exception e) {
            System.out.println("error al ejecutar: " + e);
            return false;
        }
    }

    public Resultset ejecutarSQLSelect(String sql) {
        Resultset resultado;
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            resultado = (Resultset) sentencia.executeQuery();
            return resultado;
        } catch (Exception e) {
            System.out.println("error al ejecutar consulta " + e);
            return null;
        }
    }

    
    public static Connection conectars() {
		Connection con = null;
		
		String password = "";
		String usuario = "";
		String url = "jdbc:mysql://localhost:3306/registro=" + usuario
				+ "&password=" + password;
		try {
			con = DriverManager.getConnection(url);
			if (con != null) {
				System.out.println("Conectado");
			}
		} catch (SQLException e) {
			System.out.println("No se pudo conectar a la base de datos");
			e.printStackTrace();
		}
		return con;
	}
    
}
