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
public abstract class DAO<T> {
    
    public abstract T create (T obj ) ; 
    public abstract T find ( String id ) ; 
    public abstract T update(T obj ) ; 
    public abstract void delete (T obj ) ;
    
}
