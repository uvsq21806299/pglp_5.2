/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_5;

/**
 *
 * @author andri
 */
public abstract class DAOFactory {
    public static final int DERBY = 1;
    
    public abstract PersonnelDAO getPersonnelDAO();
    
    public static DAOFactory getDAOFactory(int f){
        switch(f){
            case DERBY:
                return new DerbyDAOFactory();
            default:
                return null;
        }
    }
    
}
