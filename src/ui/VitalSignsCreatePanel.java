/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Community;
import models.CommunityStore;
import models.Doctor;
import models.DoctorStore;
import models.Hospital;
import models.HospitalStore;
import models.Patient;
import models.PatientStore;
import models.Person;
import models.PersonStore;
import models.SystemAdmin;
import models.VitalSigns;
import models.VitalSignsStore;

/**
 *
 * @author Ravindra
 */
public class VitalSignsCreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsCreatePanel
     */
    VitalSignsStore vitalSignsStore;
    DoctorStore doctorStore;
    HospitalStore hospitalStore;
    PersonStore personStore;
    PatientStore patientStore; 
    SystemAdmin systemAdmin;
    CommunityStore communityStore;
 
    public VitalSignsCreatePanel(VitalSignsStore vitalSignsStore,  DoctorStore doctorStore, HospitalStore hospitalStore, PersonStore personStore,
    PatientStore patientStore, SystemAdmin systemAdmin, CommunityStore communityStore ) {
        initComponents();
        
        this.vitalSignsStore = vitalSignsStore;
        this.doctorStore = doctorStore;
        this.hospitalStore = hospitalStore;
        this.personStore = personStore;
        this.patientStore = patientStore;
        this.systemAdmin = systemAdmin;
        this.communityStore = communityStore;
        
        initCombos();
        getInitDetails();
    }
    
    private void initCombos() {
        
        ArrayList<String> communities = new ArrayList<>();
        
        for (Community resource : communityStore.getStore()) {
            
            String tempCommunity = String.valueOf(resource.getCommunityId());
            communities.add(tempCommunity);
        }
        
        
        String[] comRoles = new String[communities.size()];
        
        for (int i = 0; i < communities.size(); i++) {
            comRoles[i] = communities.get(i);
        }
        communityCombo.setModel(new DefaultComboBoxModel<>(comRoles));
    }
    
    private void getInitDetails() {
        
        String userIdInSystem = String.valueOf(systemAdmin.getCurrentUserId());
        
        for (Person personResource : personStore.getStore()) {
           
            if(userIdInSystem.matches(String.valueOf(personResource.getPid()))) {
                TextPersonId.setText(String.valueOf(personResource.getPid()));
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextVitalSignId = new javax.swing.JTextField();
        TextPersonId = new javax.swing.JTextField();
        TextVitalSignsTemperature = new javax.swing.JTextField();
        TextVitalSignsBloodPressure = new javax.swing.JTextField();
        TextVitalSignsPulse = new javax.swing.JTextField();
        TextVitalSignsRespirationRate = new javax.swing.JTextField();
        TextVitalSignsDate = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TextPatientId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        communityCombo = new javax.swing.JComboBox<>();
        hospitalComboBox = new javax.swing.JComboBox<>();
        doctorComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Vital Signs");

        jLabel2.setText("Vital Sign ID");

        jLabel3.setText("Person ID");

        jLabel4.setText("Hospital ID");

        jLabel5.setText("Doctor ID");

        jLabel6.setText("Temperature");

        jLabel7.setText("Blood Pressure");

        jLabel8.setText("Pulse");

        jLabel9.setText("Respiration Rate");

        jLabel10.setText("Date");

        TextPersonId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPersonIdActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(255, 102, 102));
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel11.setText("Patient ID");

        jLabel12.setText("Community Id");

        communityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityComboActionPerformed(evt);
            }
        });

        hospitalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPersonId))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextVitalSignsTemperature))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextVitalSignsBloodPressure))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextVitalSignsPulse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextVitalSignsRespirationRate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextVitalSignId)
                            .addComponent(TextPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextVitalSignsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(communityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(TextPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVitalSignId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVitalSignsTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVitalSignsBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVitalSignsPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVitalSignsRespirationRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVitalSignsDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextPersonIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPersonIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPersonIdActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        VitalSigns resource = vitalSignsStore.addNewResource();
        Patient patientresource = patientStore.addNewResource();
        
        String userIdInSystem = String.valueOf(systemAdmin.getCurrentUserId());
        
        for (Person personResource : personStore.getStore()) {
           
            if(userIdInSystem.matches(String.valueOf(personResource.getPid()))) {
                 patientresource.setFirstName(personResource.getFirstName());
                 patientresource.setLastName(personResource.getFirstName());
                 patientresource.setGender(personResource.getGender());
                 patientresource.setDOB(personResource.getDOB());
                 patientresource.setCommunityId(personResource.getCommunityId());
                 patientresource.setEmail(personResource.getEmail());
                 patientresource.setHouseId(personResource.getHouseId());
                 patientresource.setPhone(personResource.getPhone());
            }
                
        }
        
        resource.setVitalSignsId(Integer.parseInt(TextVitalSignId.getText()));
        patientresource.setVitalSignsId(Integer.parseInt(TextVitalSignId.getText()));
        
        resource.setDoctorId(Integer.parseInt(doctorComboBox.getItemAt(doctorComboBox.getSelectedIndex())));
        
        patientresource.setPatientId(Integer.parseInt(TextPatientId.getText()));
        resource.setHospitalId(Integer.parseInt(hospitalComboBox.getItemAt(hospitalComboBox.getSelectedIndex())));
        resource.setPid(Integer.parseInt(TextPersonId.getText()));       
        resource.setPulse(Integer.parseInt(TextVitalSignsPulse.getText()));
        resource.setRespirationRate(Integer.parseInt(TextVitalSignsRespirationRate.getText()));
        
        resource.setBloodPressure(Double.parseDouble(TextVitalSignsBloodPressure.getText()));
        resource.setTemperature(Double.parseDouble(TextVitalSignsTemperature.getText()));
        
        resource.setDate(TextVitalSignsDate.getText());
        
        JOptionPane.showMessageDialog(this,"Successfully added");
        
        TextVitalSignId.setText("");
        TextPersonId.setText("");
        TextVitalSignsPulse.setText("");
        TextVitalSignsRespirationRate.setText("");
        TextVitalSignsBloodPressure.setText("");
        TextVitalSignsTemperature.setText("");
        TextVitalSignsDate.setText("");
        TextPatientId.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void communityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityComboActionPerformed
        
        String selectedCommunityId = communityCombo.getItemAt(communityCombo.getSelectedIndex());
        
        ArrayList<String> hospitalInCommunity = new ArrayList<>();
        
        for (Hospital resource : hospitalStore.getStore()) {
            if(selectedCommunityId.matches(String.valueOf(resource.getCommunityId()))) {
                String tempHospital = String.valueOf(resource.getHospitalId());
                hospitalInCommunity.add(tempHospital);
            }
        }
        
        
        String[] comRoles = new String[hospitalInCommunity.size()];
        
        for (int i = 0; i < hospitalInCommunity.size(); i++) {
            comRoles[i] = hospitalInCommunity.get(i);
        }
        hospitalComboBox.setModel(new DefaultComboBoxModel<>(comRoles));
        
        
    }//GEN-LAST:event_communityComboActionPerformed

    private void hospitalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalComboBoxActionPerformed
        
        String selectedHospitalId = hospitalComboBox.getItemAt(hospitalComboBox.getSelectedIndex());
        
        ArrayList<String> doctorsInHospital = new ArrayList<>();
        
        for (Doctor resource : doctorStore.getStore()) {
            
            if(selectedHospitalId.matches(String.valueOf(resource.getDid()))) {
                String tempDoctor = String.valueOf(resource.getDid());
                doctorsInHospital.add(tempDoctor);
            }
            
        }
        
        
        String[] comRoles = new String[doctorsInHospital.size()];
        
        for (int i = 0; i < doctorsInHospital.size(); i++) {
            comRoles[i] = doctorsInHospital.get(i);
        }
        doctorComboBox.setModel(new DefaultComboBoxModel<>(comRoles));
        
    }//GEN-LAST:event_hospitalComboBoxActionPerformed

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
        
        btnSubmit.setForeground(Color.blue);
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        // TODO add your handling code here:
        
        btnSubmit.setForeground(Color.black);
    }//GEN-LAST:event_btnSubmitMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextPatientId;
    private javax.swing.JTextField TextPersonId;
    private javax.swing.JTextField TextVitalSignId;
    private javax.swing.JTextField TextVitalSignsBloodPressure;
    private javax.swing.JTextField TextVitalSignsDate;
    private javax.swing.JTextField TextVitalSignsPulse;
    private javax.swing.JTextField TextVitalSignsRespirationRate;
    private javax.swing.JTextField TextVitalSignsTemperature;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> communityCombo;
    private javax.swing.JComboBox<String> doctorComboBox;
    private javax.swing.JComboBox<String> hospitalComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
