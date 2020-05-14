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
public class Main {
    
    public static void main(String[] args){
        
        DAOFactory derbyFactory = DAOFactory.getDAOFactory(1);
        
        Personnel personnel1 = Personnel.PersonnelBuilder("RAMAROSON", "Andritsalama")
                .build();
        Personnel personnel2 = Personnel.PersonnelBuilder("RANDRIA", "Ando")
                .build();
        
        
        //derbyFactory.getPersonnelDAO();
    }
}
