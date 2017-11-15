/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fpmislata.prueba;

import java.sql.*;

/**
 *
 * @author Alumno
 */
public class Estadisticas {

//    ConnectionFactory connectionFactory = new ConnectionImplDriverManager();
    ConnectionFactory connectionFactory = new ConnectionImplDataSource();

    public Estadisticas(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;

    }

//    Connection connection = connectionFactory.getConnection();
    public int getOfertas() {
        try {
            Connection connection = connectionFactory.getConnection();
            String consulta = "SELECT COUNT(*) AS 'ofertas' FROM OFERTA";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int resultado = rs.getInt("ofertas");
            connectionFactory.closeConnection(connection);
            return resultado;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int getTitulados() {
        try {
            Connection connection = connectionFactory.getConnection();
            String consulta = "SELECT COUNT(*) AS 'titulados' FROM TITULADO";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int resultado = rs.getInt("titulados");
            connectionFactory.closeConnection(connection);
            return resultado;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public int getCentros() {
        try {
            Connection connection = connectionFactory.getConnection();
            String consulta = "SELECT COUNT(*) AS 'centros' FROM CENTRO";
            PreparedStatement ps = connection.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int resultado = rs.getInt("centros");
            connectionFactory.closeConnection(connection);
            return resultado;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
