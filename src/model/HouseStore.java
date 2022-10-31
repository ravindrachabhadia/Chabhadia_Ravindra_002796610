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
public class HouseStore {
    
   private ArrayList<House> store; 
   
   public HouseStore() {
       this.store = new ArrayList<House>();
   }

    public ArrayList<House> getStore() {
        return store;
    }

    public void setStore(ArrayList<House> store) {
        this.store = store;
    }
   
    public House addNewResource(){
        
        House newResource = new House();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(House resource) {
        store.remove(resource);
    }
    
}
