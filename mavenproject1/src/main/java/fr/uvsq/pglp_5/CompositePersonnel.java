/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andri
 */
public class CompositePersonnel extends PersonnelList implements java.io.Serializable{
    
    public ArrayList<PersonnelList> list = new ArrayList<PersonnelList>();
    private final Iterator iterator = list.iterator();
    
    public CompositePersonnel(String name){
        this.name = name;
    }
    
    /**
     *
     */
    @Override
    public void list(){
        System.out.println("Ceci est la Fonction :  " + name );
    }
    
    public void add(PersonnelList personnel){
        list.add(personnel);
    }
    
    public void remove(PersonnelList personnel){
        list.remove(personnel);
    }
    
    public void getElements(){
        while(iterator.hasNext()){
            CompositePersonnel composite = (CompositePersonnel) iterator.next();
            System.out.println(composite.name);
        }
    }
    
}
