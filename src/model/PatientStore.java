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
public class PatientStore {
    
   private ArrayList<Patient> store; 
   
   public PatientStore() {
       this.store = new ArrayList<Patient>();
   }

    public ArrayList<Patient> getStore() {
        return store;
    }

    public void setStore(ArrayList<Patient> store) {
        this.store = store;
    }
   
    public Patient addNewResource(){
        
        Patient newResource = new Patient();
        store.add(newResource);
        return newResource;
    }
    
    public void deleteResource(Patient resource) {
        store.remove(resource);
    }
    
}
