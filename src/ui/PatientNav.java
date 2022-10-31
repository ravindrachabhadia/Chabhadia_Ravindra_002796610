/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import models.CityStore;
import models.CommunityStore;
import models.DoctorStore;
import models.EncounterStore;
import models.HospitalStore;
import models.HouseStore;
import models.PatientStore;
import models.PersonStore;
import models.VitalSignsStore;

/**
 *
 * @author Ravindra
 */
public class PatientNav extends javax.swing.JPanel {

    /**
     * Creates new form PatientNav
     */
    javax.swing.JSplitPane SplitPane;
    CityStore cityStore;
    models.SystemAdmin systemAdmin;
    CommunityStore communityStore;
    HospitalStore hospitalStore;
    HouseStore houseStore;
    DoctorStore doctorStore;
    PersonStore personStore;
    EncounterStore encounterStore;
    VitalSignsStore vitalSignsStore;
    PatientStore patientStore;
    
    public PatientNav(javax.swing.JSplitPane SplitPane, 
        models.SystemAdmin systemAdmin,
        CityStore cityStore,
        CommunityStore communityStore,
        HospitalStore hospitalStore,
        HouseStore houseStore,
        DoctorStore doctorStore,
        PersonStore personStore,
        EncounterStore encounterStore,
        VitalSignsStore vitalSignsStore,
        PatientStore patientStore) {
        initComponents();
        
         this.SplitPane = SplitPane;
        this.cityStore = cityStore;
        this.systemAdmin = systemAdmin;
        this.communityStore = communityStore;
        this.hospitalStore = hospitalStore;
        this.houseStore = houseStore;
        this.doctorStore = doctorStore;
        this.personStore = personStore;
        this.encounterStore = encounterStore;
        this.vitalSignsStore = vitalSignsStore;
        this.patientStore = patientStore;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCreateVital = new javax.swing.JButton();
        btnViewVital = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bntViewEncounter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        labelLogo.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Vitals");

        btnCreateVital.setText("Create");
        btnCreateVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalActionPerformed(evt);
            }
        });

        btnViewVital.setText("View");
        btnViewVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Encounter");

        bntViewEncounter.setText("View");
        bntViewEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntViewEncounterActionPerformed(evt);
            }
        });

        jLabel3.setText("Hello,");

        lblName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblName.setText("Ravindra");

        btnLogout.setText("logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogo)
                            .addComponent(jLabel1)
                            .addComponent(btnCreateVital)
                            .addComponent(btnViewVital)
                            .addComponent(jLabel2)
                            .addComponent(bntViewEncounter)
                            .addComponent(jLabel3)
                            .addComponent(btnLogout))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblName)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateVital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewVital)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntViewEncounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bntViewEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntViewEncounterActionPerformed
        PatientEncounterPanel patientEncounterPanel = new PatientEncounterPanel(systemAdmin, encounterStore, doctorStore, vitalSignsStore);
        SplitPane.setRightComponent(patientEncounterPanel);
    }//GEN-LAST:event_bntViewEncounterActionPerformed

    private void btnCreateVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalActionPerformed
        VitalSignsCreatePanel vitalCreatePanel = new VitalSignsCreatePanel(vitalSignsStore, doctorStore, hospitalStore, personStore, patientStore, systemAdmin, communityStore);
        SplitPane.setRightComponent(vitalCreatePanel);
    }//GEN-LAST:event_btnCreateVitalActionPerformed

    private void btnViewVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalActionPerformed
        VitalSignsViewPanel vitalViewPanel = new VitalSignsViewPanel(vitalSignsStore, doctorStore, hospitalStore,systemAdmin);
        SplitPane.setRightComponent(vitalViewPanel);
    }//GEN-LAST:event_btnViewVitalActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginPanel loginPanel = new LoginPanel(SplitPane, systemAdmin,cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
        SplitPane.setRightComponent(loginPanel);
        SplitPane.setLeftComponent(null);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntViewEncounter;
    private javax.swing.JButton btnCreateVital;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewVital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
