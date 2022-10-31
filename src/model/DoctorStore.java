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
public class DoctorStore {
    
    private ArrayList<Doctor> store; 
   
   public DoctorStore() {
       this.store = new ArrayList<Doctor>();
   }

    public ArrayList<Doctor> getStore() {
        return store;
    }

    public void setStore(ArrayList<Doctor> store) {
        this.store = store;
    }
   
    public Doctor addNewResource(){
        
        Doctor newResource = new Doctor();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(Doctor resource) {
        store.remove(resource);
    }
    
}
