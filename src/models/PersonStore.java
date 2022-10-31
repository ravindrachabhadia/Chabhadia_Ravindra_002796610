/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Ravindra
 */
public class PersonStore {
    
    private ArrayList<Person> store; 
   
   public PersonStore() {
       this.store = new ArrayList<Person>();
   }

    public ArrayList<Person> getStore() {
        return store;
    }

    public void setStore(ArrayList<Person> store) {
        this.store = store;
    }
   
    public Person addNewResource(){
        
        Person newResource = new Person();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(Person resource) {
        store.remove(resource);
    }
    
}
