/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;

/**
 *
 * @author bruiz9
 */
public class Conexion {

    private Connection conexion = null;

    public Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        if (conexion == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/unica", "root", "123");
                System.out.println("Conexion: " + conexion);
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return conexion;
    }

    public void cerrar() throws SQLException {
        if (conexion != null) {
            conexion.close();
        }
    }
}
