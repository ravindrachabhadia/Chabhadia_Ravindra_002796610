/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sagred
 */
public class Encounter {
    
    private int pid;
    private int doctorId;
    private int viralSingsId;
    private String date;
    private String details;
    private String suggestions;
    private String nextEnounter;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getViralSingsId() {
        return viralSingsId;
    }

    public void setViralSingsId(int viralSingsId) {
        this.viralSingsId = viralSingsId;
    }
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public String getNextEnounter() {
        return nextEnounter;
    }

    public void setNextEnounter(String nextEnounter) {
        this.nextEnounter = nextEnounter;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    @Override
    public String toString() {
        return String.valueOf(pid) ;
    }
}
