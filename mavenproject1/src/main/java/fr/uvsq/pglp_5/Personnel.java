/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uvsq.pglp_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author andri
 */
public class Personnel extends PersonnelList implements java.io.Serializable{
    
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private ArrayList<Integer> numeroTel;
    private Iterator iterator = numeroTel.iterator();
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setDateNaiss(LocalDate dateNaiss){
        this.dateNaiss = dateNaiss;
    }

    public LocalDate getDateNaiss(){
        return dateNaiss;
    }
    
    public void setNumeroTel(ArrayList<Integer> numeroList){
        numeroList = numeroList;
    }
    
    public ArrayList<Integer> getnumeroTel(){
        return numeroTel;
    }
    
    public static class PersonnelBuilder{
        private String nom;
        private String prenom;
        private LocalDate dateNaiss;
        ArrayList<Integer> numeroTel = new ArrayList<Integer>();
        Iterator iterator = numeroTel.iterator();
        
        
        public PersonnelBuilder(String nom, String prenom){
            this.nom = nom;
            this.prenom = prenom;
        }
        
        public PersonnelBuilder setDateNaiss(LocalDate dateNaiss){
            this.dateNaiss = dateNaiss;
            return this;
        }
        
        public PersonnelBuilder NumeroTel(ArrayList<Integer> nmeroTel){
            this.numeroTel = numeroTel;
            return  this;
        }
        
        public Personnel build(){
            return new Personnel(this);
        }
        
    }
    
    
    private Personnel(PersonnelBuilder personnelBuilder){
        
        nom = personnelBuilder.nom;
        prenom = personnelBuilder.prenom;
    }
    
    @Override
    public void list() {
        // TODO Auto-generated method stub
    }
    
    
    
    
    
}
