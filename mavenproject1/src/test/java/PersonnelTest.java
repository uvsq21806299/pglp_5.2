/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fr.uvsq.pglp_5.DAOFactory;
import fr.uvsq.pglp_5.Personnel;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author andri
 */
public class PersonnelTest {
    
    @Test
    public void PersonnelNom(){
        DAOFactory derby = DAOFactory.getDAOFactory(2);
        Personnel personnel1 = new Personnel.PersonnelBuilder("RAMAROSON", "Andritsalama").build();
        assertTrue("Verifier que ", ("RAMAROSON".equals(personnel1.getNom())));
    }
    
    @Test
    public void PersonnelPrenom(){
        DAOFactory derby = DAOFactory.getDAOFactory(2);
        Personnel personnel1 = new Personnel.PersonnelBuilder("RAMAROSON", "Andritsalama").build();
        assertTrue("Verifier que ", ("Andritsalama".equals(personnel1.getPrenom())));
    }
}
