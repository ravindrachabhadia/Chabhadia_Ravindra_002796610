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
public class EncounterStore {
    
    private ArrayList<Encounter> store; 
   
   public EncounterStore() {
       this.store = new ArrayList<Encounter>();
   }

    public ArrayList<Encounter> getStore() {
        return store;
    }

    public void setStore(ArrayList<Encounter> store) {
        this.store = store;
    }
   
    public Encounter addNewResource(){
        
        Encounter newResource = new Encounter();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(Encounter resource) {
        store.remove(resource);
    }
    
}
