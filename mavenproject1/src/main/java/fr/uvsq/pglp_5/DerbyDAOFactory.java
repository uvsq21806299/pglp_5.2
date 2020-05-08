/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andri
 */
public class DerbyDAOFactory extends DAOFactory{
    
    //public static final String DBURL = "jdbc:derby:/Users/andri/Personnels";
    public static final String DBURL = "jdbc:derby:/Users/andri/Personnels";
    

    public static Connection creeConnection() throws SQLException
    {
        Connection connection = DriverManager.getConnection(DBURL);
        return connection;
    }
    
    
    
    public PersonnelDAO getPersonnelDAO(){
        return new PersonnelDAO();
    }
    
    
}
