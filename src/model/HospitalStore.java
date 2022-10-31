/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ravindra
 */
public class HospitalStore {
    
   private ArrayList<Hospital> store; 
   
   public HospitalStore() {
       this.store = new ArrayList<Hospital>();
   }

    public ArrayList<Hospital> getStore() {
        return store;
    }

    public void setStore(ArrayList<Hospital> store) {
        this.store = store;
    }
   
    public Hospital addNewResource(){
        
        Hospital newResource = new Hospital();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(Hospital resource) {
        store.remove(resource);
    }
    
}
