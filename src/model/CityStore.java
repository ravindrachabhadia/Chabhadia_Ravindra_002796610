/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sagred
 */public class CityStore {
    
    private ArrayList<City> store; 
   
   public CityStore() {
       this.store = new ArrayList<City>();
   }

    public ArrayList<City> getStore() {
        return store;
    }

    public void setStore(ArrayList<City> store) {
        this.store = store;
    }
   
    public City addNewResource(){
        
        City newResource = new City();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(City resource) {
        store.remove(resource);
    }
    
}
