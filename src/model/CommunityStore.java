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
public class CommunityStore {
    
    private ArrayList<Community> store; 
   
   public CommunityStore() {
       this.store = new ArrayList<Community>();
   }

    public ArrayList<Community> getStore() {
        return store;
    }

    public void setStore(ArrayList<Community> store) {
        this.store = store;
    }
   
    public Community addNewResource(){
        
        Community newResource = new Community();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(Community resource) {
        store.remove(resource);
    }
    
}
