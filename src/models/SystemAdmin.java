/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Ravindra
 */
public class SystemAdmin {
    
    private String user = "system";
    private String password = "system";
    
    private String currentUser;
    private int currentUserId;
    private int currentCommunityId;
    private int currentHospitalId;
    private int currentHouseId;
    
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public int getCurrentCommunityId() {
        return currentCommunityId;
    }

    public void setCurrentCommunityId(int currentCommunityId) {
        this.currentCommunityId = currentCommunityId;
    }

    public int getCurrentHospitalId() {
        return currentHospitalId;
    }

    public void setCurrentHospitalId(int currentHospitalId) {
        this.currentHospitalId = currentHospitalId;
    }

    public int getCurrentHouseId() {
        return currentHouseId;
    }

    public void setCurrentHouseId(int currentHouseId) {
        this.currentHouseId = currentHouseId;
    }

    public int getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(int currentUserId) {
        this.currentUserId = currentUserId;
    }

   

    
    
    
}
