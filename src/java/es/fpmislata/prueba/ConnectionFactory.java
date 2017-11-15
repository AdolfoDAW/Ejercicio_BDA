/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.fpmislata.prueba;

import java.sql.Connection;

/**
 *
 * @author Alumno
 */
public interface ConnectionFactory {

    public Connection getConnection();
    
    public void closeConnection(Connection connection);
}
