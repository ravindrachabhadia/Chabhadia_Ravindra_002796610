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
public class VitalSignsStore {
    
    private ArrayList<VitalSigns> vitalSignsStore;
    
    public VitalSignsStore() {
       this.vitalSignsStore = new ArrayList<VitalSigns>();
   }
    
   public ArrayList<VitalSigns> getStore() {
        return vitalSignsStore;
    }

    public void setStore(ArrayList<VitalSigns> vitalSignsStore) {
        this.vitalSignsStore = vitalSignsStore;
    }
   
    public VitalSigns addNewResource(){
        
        VitalSigns newVitalSign = new VitalSigns();
        vitalSignsStore.add(newVitalSign);
        return newVitalSign;
    }
    
    public void deleteResource(VitalSigns vital) {
        vitalSignsStore.remove(vital);
    }
    
}
