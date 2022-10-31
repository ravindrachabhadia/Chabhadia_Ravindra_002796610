/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import models.CityStore;
import models.Community;
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
public class Navigation extends javax.swing.JPanel {

    /**
     * Creates new form Navigation
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
    
    public Navigation(javax.swing.JSplitPane SplitPane,
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
        
        initCombos();
        
    }
    
    private void initCombos() {
        
       if("Community Admin".matches(systemAdmin.getCurrentUser())) {
           hideCity();
       }
       
       if("Hospital Admin".matches(systemAdmin.getCurrentUser())) {
           hideCity();
           hideCommunity();
           hideHouseAndPerson();
       }
    }
    
    private void hideHouseAndPerson() {
        btnPersonCreate.hide();
        btnPersonView.hide();
        lblPerson.hide();
        
        btnHouseCreate.hide();
        btnHouseView.hide();
        lblHouse.hide();
        
       
    }
    
    private void hideCommunity() {
        btnComtCreate.hide();
        btnComtView.hide();
        lblCommunity.hide();
       
    }
    
    private void hideCity() {
        btnCreateCity.hide();
        btnViewCity.hide();
        lblCity.hide();
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnCreateCity = new javax.swing.JButton();
        btnViewCity = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        btnComtCreate = new javax.swing.JButton();
        btnComtView = new javax.swing.JButton();
        lblHospital = new javax.swing.JLabel();
        btnHospCreate = new javax.swing.JButton();
        btnHospView = new javax.swing.JButton();
        lblHouse = new javax.swing.JLabel();
        btnHouseCreate = new javax.swing.JButton();
        btnHouseView = new javax.swing.JButton();
        lblDoctor = new javax.swing.JLabel();
        btnDoctorCreate = new javax.swing.JButton();
        btnDoctorView = new javax.swing.JButton();
        lblPerson = new javax.swing.JLabel();
        btnPersonCreate = new javax.swing.JButton();
        btnPersonView = new javax.swing.JButton();
        lblVitalSigns = new javax.swing.JLabel();
        btnVitalCreate = new javax.swing.JButton();
        btnVitalView = new javax.swing.JButton();
        lblEncounters = new javax.swing.JLabel();
        btnEncountCreate = new javax.swing.JButton();
        btnEncountView = new javax.swing.JButton();

        btnLogout.setText(" logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnCreateCity.setText("Create");
        btnCreateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCityActionPerformed(evt);
            }
        });

        btnViewCity.setText("View");
        btnViewCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCityActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCity.setText("City");

        lblCommunity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCommunity.setText("Community");

        btnComtCreate.setText("Create");
        btnComtCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComtCreateActionPerformed(evt);
            }
        });

        btnComtView.setText("View");
        btnComtView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComtViewActionPerformed(evt);
            }
        });

        lblHospital.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHospital.setText("Hospital");

        btnHospCreate.setText("Create");
        btnHospCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospCreateActionPerformed(evt);
            }
        });

        btnHospView.setText("View");
        btnHospView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospViewActionPerformed(evt);
            }
        });

        lblHouse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHouse.setText("House");

        btnHouseCreate.setText("Create");
        btnHouseCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseCreateActionPerformed(evt);
            }
        });

        btnHouseView.setText("View");
        btnHouseView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouseViewActionPerformed(evt);
            }
        });

        lblDoctor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDoctor.setText("Doctor");

        btnDoctorCreate.setText("Create");
        btnDoctorCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorCreateActionPerformed(evt);
            }
        });

        btnDoctorView.setText("View");
        btnDoctorView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorViewActionPerformed(evt);
            }
        });

        lblPerson.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPerson.setText("Person");

        btnPersonCreate.setText("Create");
        btnPersonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonCreateActionPerformed(evt);
            }
        });

        btnPersonView.setText("View");
        btnPersonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonViewActionPerformed(evt);
            }
        });

        lblVitalSigns.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVitalSigns.setText("Vital Signs");

        btnVitalCreate.setText("Create");
        btnVitalCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalCreateActionPerformed(evt);
            }
        });

        btnVitalView.setText("View");
        btnVitalView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalViewActionPerformed(evt);
            }
        });

        lblEncounters.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEncounters.setText("Encounters");

        btnEncountCreate.setText("Create");
        btnEncountCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountCreateActionPerformed(evt);
            }
        });

        btnEncountView.setText("View");
        btnEncountView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnHouseCreate)
                            .addGap(18, 18, 18)
                            .addComponent(btnPersonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLogout)
                                    .addComponent(btnCreateCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblCity)
                                .addComponent(lblHospital)
                                .addComponent(btnHospCreate)
                                .addComponent(btnHospView)
                                .addComponent(lblHouse))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPerson)
                                .addComponent(lblCommunity)
                                .addComponent(btnComtCreate)
                                .addComponent(btnComtView)
                                .addComponent(lblDoctor)
                                .addComponent(btnDoctorCreate)
                                .addComponent(btnDoctorView)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnHouseView)
                            .addGap(18, 18, 18)
                            .addComponent(btnPersonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblVitalSigns)
                    .addComponent(btnVitalCreate)
                    .addComponent(btnVitalView)
                    .addComponent(lblEncounters)
                    .addComponent(btnEncountCreate)
                    .addComponent(btnEncountView))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewCity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommunity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComtCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnComtView)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHospital)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHospCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHospView))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDoctor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoctorCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoctorView)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouse)
                    .addComponent(lblPerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHouseCreate)
                    .addComponent(btnPersonCreate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHouseView)
                    .addComponent(btnPersonView))
                .addGap(30, 30, 30)
                .addComponent(lblVitalSigns)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVitalCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVitalView)
                .addGap(18, 18, 18)
                .addComponent(lblEncounters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncountCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEncountView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        LoginPanel loginPanel = new LoginPanel(SplitPane, systemAdmin,cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
        SplitPane.setRightComponent(loginPanel);
        SplitPane.setLeftComponent(null);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCreateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCityActionPerformed
        CityCreatePanel cityCreatePanel = new CityCreatePanel(cityStore);
        SplitPane.setRightComponent(cityCreatePanel);
    }//GEN-LAST:event_btnCreateCityActionPerformed

    private void btnViewCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCityActionPerformed
        CityViewPanel cityViewPanel =  new CityViewPanel(cityStore);
        SplitPane.setRightComponent(cityViewPanel);
    }//GEN-LAST:event_btnViewCityActionPerformed

    private void btnComtCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComtCreateActionPerformed
        CommunityCreatePanel communityCreatePanel =  new CommunityCreatePanel(cityStore, communityStore);
        SplitPane.setRightComponent(communityCreatePanel);
    }//GEN-LAST:event_btnComtCreateActionPerformed

    private void btnComtViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComtViewActionPerformed
        CommunityViewPanel communityViewPanel =  new CommunityViewPanel(cityStore, communityStore, systemAdmin);
        SplitPane.setRightComponent(communityViewPanel);
    }//GEN-LAST:event_btnComtViewActionPerformed

    private void btnHospCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospCreateActionPerformed
        HospCreatePanel hospCreatePanel = new HospCreatePanel(hospitalStore, communityStore);
        SplitPane.setRightComponent(hospCreatePanel);
    }//GEN-LAST:event_btnHospCreateActionPerformed

    private void btnHospViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospViewActionPerformed
       HospViewPanel hospViewPanel = new HospViewPanel(hospitalStore, communityStore, systemAdmin);
       SplitPane.setRightComponent(hospViewPanel);
    }//GEN-LAST:event_btnHospViewActionPerformed

    private void btnHouseCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseCreateActionPerformed
       HouseCreatePanel houseCreatPanel = new HouseCreatePanel(houseStore, communityStore);
       SplitPane.setRightComponent(houseCreatPanel);
    }//GEN-LAST:event_btnHouseCreateActionPerformed

    private void btnHouseViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouseViewActionPerformed
       HouseViewPanel houseViewPanel = new HouseViewPanel(houseStore, communityStore);
       SplitPane.setRightComponent(houseViewPanel);
    }//GEN-LAST:event_btnHouseViewActionPerformed

    private void btnDoctorCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorCreateActionPerformed
        DoctorCreatePanel doctorCreatePanel = new DoctorCreatePanel(doctorStore, hospitalStore);
        SplitPane.setRightComponent(doctorCreatePanel);
    }//GEN-LAST:event_btnDoctorCreateActionPerformed

    private void btnDoctorViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorViewActionPerformed
        DoctorViewPanel doctorViewPanel = new DoctorViewPanel(doctorStore, hospitalStore, systemAdmin);
        SplitPane.setRightComponent(doctorViewPanel);
    }//GEN-LAST:event_btnDoctorViewActionPerformed

    private void btnPersonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonCreateActionPerformed
        PersonCreatePanel personCreatePanel = new PersonCreatePanel(personStore, houseStore, systemAdmin, communityStore);
        SplitPane.setRightComponent(personCreatePanel);
    }//GEN-LAST:event_btnPersonCreateActionPerformed

    private void btnPersonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonViewActionPerformed
        PersonViewPanel personViewPanel = new PersonViewPanel(personStore, houseStore, systemAdmin);
        SplitPane.setRightComponent(personViewPanel);
    }//GEN-LAST:event_btnPersonViewActionPerformed

    private void btnVitalCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalCreateActionPerformed
        VitalSignsCreatePanel vitalCreatePanel = new VitalSignsCreatePanel(vitalSignsStore, doctorStore, hospitalStore, personStore, patientStore, systemAdmin,communityStore);
        SplitPane.setRightComponent(vitalCreatePanel);
    }//GEN-LAST:event_btnVitalCreateActionPerformed

    private void btnVitalViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalViewActionPerformed
        VitalSignsViewPanel vitalViewPanel = new VitalSignsViewPanel(vitalSignsStore, doctorStore, hospitalStore, systemAdmin);
        SplitPane.setRightComponent(vitalViewPanel);
    }//GEN-LAST:event_btnVitalViewActionPerformed

    private void btnEncountCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountCreateActionPerformed
        EncounterCreatePanel encounterCreatePanel = new EncounterCreatePanel(encounterStore, doctorStore);
        SplitPane.setRightComponent(encounterCreatePanel);
    }//GEN-LAST:event_btnEncountCreateActionPerformed

    private void btnEncountViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountViewActionPerformed
        EncounterViewPanel encounterViewPanel = new EncounterViewPanel(encounterStore, doctorStore);
        SplitPane.setRightComponent(encounterViewPanel);
    }//GEN-LAST:event_btnEncountViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComtCreate;
    private javax.swing.JButton btnComtView;
    private javax.swing.JButton btnCreateCity;
    private javax.swing.JButton btnDoctorCreate;
    private javax.swing.JButton btnDoctorView;
    private javax.swing.JButton btnEncountCreate;
    private javax.swing.JButton btnEncountView;
    private javax.swing.JButton btnHospCreate;
    private javax.swing.JButton btnHospView;
    private javax.swing.JButton btnHouseCreate;
    private javax.swing.JButton btnHouseView;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPersonCreate;
    private javax.swing.JButton btnPersonView;
    private javax.swing.JButton btnViewCity;
    private javax.swing.JButton btnVitalCreate;
    private javax.swing.JButton btnVitalView;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblEncounters;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JLabel lblVitalSigns;
    // End of variables declaration//GEN-END:variables
}
