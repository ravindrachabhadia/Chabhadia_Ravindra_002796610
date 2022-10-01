/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Chabhadia
 */
public class EmployeeHistory {
    private ArrayList<Manager>history;
    
    public EmployeeHistory(){
    this.history= new ArrayList<Manager>();
    
    }

    public ArrayList<Manager> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Manager> history) {
        this.history = history;
    }

    public Manager addNewManager() {
        
        Manager newManagers= new Manager();
        history.add(newManagers);
        return newManagers;
        
       }

    public Manager addNewManagers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    public void deleteManager(Manager m){
    
        history.remove(m);
    }
    
   
}
