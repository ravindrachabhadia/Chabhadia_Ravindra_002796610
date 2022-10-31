/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ravindra
 */
public class Patient extends Person {
    
    private int patientId;
    private int vitalSignsId;
    private int EncounterId;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getVitalSignsId() {
        return vitalSignsId;
    }

    public void setVitalSignsId(int vitalSignsId) {
        this.vitalSignsId = vitalSignsId;
    }

    public int getEncounterId() {
        return EncounterId;
    }

    public void setEncounterId(int EncounterId) {
        this.EncounterId = EncounterId;
    }
    
}
