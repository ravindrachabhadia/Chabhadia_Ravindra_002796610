/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.CityStore;
import models.Community;
import models.CommunityStore;
import models.Doctor;
import models.DoctorStore;
import models.EncounterStore;
import models.Hospital;
import models.HospitalStore;
import models.HouseStore;
import models.PatientStore;
import models.Person;
import models.PersonStore;
import models.VitalSignsStore;              

/**
 *
 * @author Ravindra
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
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
    
    public LoginPanel(javax.swing.JSplitPane SplitPane, 
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
        
        String[] userRoles = {"System Admin", "Community Admin", "Hospital Admin", "Doctor", "Person", "SUDO" };
        comboRole.setModel(new DefaultComboBoxModel<>(userRoles));
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogin = new javax.swing.JLabel();
        labelRole = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        TextUsername = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        btnSubmit = new javax.swing.JButton();
        btnNewPerson = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLogin.setText("Login");

        labelRole.setText("Role");

        labelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsername.setText("Id");

        labelPassword.setText("Password");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Community Admin", "Hospital Admin", "Doctor", "Person" }));

        TextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsernameActionPerformed(evt);
            }
        });

        TextPassword.setToolTipText("");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnNewPerson.setText("New Person");
        btnNewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelPassword)
                                .addGap(200, 200, 200))
                            .addComponent(labelUsername)
                            .addComponent(TextUsername)
                            .addComponent(TextPassword)
                            .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelRole)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelLogin)
                .addGap(33, 33, 33)
                .addComponent(labelRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsernameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        String userRole = comboRole.getItemAt(comboRole.getSelectedIndex());
        
        String userId = TextUsername.getText();
        String password = String.valueOf(TextPassword.getPassword());
        
        
        if("System Admin".equals(userRole)) {
          
            String sysAdmin = systemAdmin.getUser();
            String sysPass = systemAdmin.getPassword();

            if(userId.equals(sysAdmin) && password.equals(sysPass)) {
                 JOptionPane.showMessageDialog(this,"Login Success");
                 
                 systemAdmin.setCurrentUser("System Admin");
                 
                 Navigation navigationPanel = new Navigation(SplitPane, systemAdmin, cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
                 Hero heroPanel = new Hero();
                 
                 SplitPane.setRightComponent(heroPanel);
                 SplitPane.setLeftComponent(navigationPanel);
            } else {
                 JOptionPane.showMessageDialog(this,"Login failed");
           }  
           return;
        }
        
        if("Community Admin".equals(userRole)) {
            
            for(Community resource : communityStore.getStore()){
                String userIdInStore = String.valueOf(resource.getCommunityId());
                if(userId.matches(userIdInStore)) {
                    String passwordInStore = resource.getPassword();
                    if(password.matches(passwordInStore)) {
                        JOptionPane.showMessageDialog(this,"Login Success");
                 
                        systemAdmin.setCurrentUser("Community Admin");
                        systemAdmin.setCurrentCommunityId(resource.getCommunityId());
                        
                        Navigation navigationPanel = new Navigation(SplitPane, systemAdmin, cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
                        Hero heroPanel = new Hero();

                        SplitPane.setLeftComponent(navigationPanel);
                        SplitPane.setRightComponent(heroPanel);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this,"Wrong Password");
                        return;
                    }  
                }
                
            }
            JOptionPane.showMessageDialog(this,"Not found"); 
            return;
        }
        
        if("Hospital Admin".equals(userRole)) {
            
            for(Hospital resource : hospitalStore.getStore()){
                String userIdInStore = String.valueOf(resource.getHospitalId());
                if(userId.matches(userIdInStore)) {
                    String passwordInStore = resource.getPassword();
                    if(password.matches(passwordInStore)) {
                        JOptionPane.showMessageDialog(this,"Login Success");
                 
                        systemAdmin.setCurrentUser("Hospital Admin");
                        systemAdmin.setCurrentHospitalId(resource.getHospitalId());
                        systemAdmin.setCurrentCommunityId(resource.getCommunityId());
                        
                        Navigation navigationPanel = new Navigation(SplitPane, systemAdmin, cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
                        Hero heroPanel = new Hero();

                        SplitPane.setLeftComponent(navigationPanel);
                        SplitPane.setRightComponent(heroPanel);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this,"Wrong Password");
                        return;
                    }  
                }
                
            }
            JOptionPane.showMessageDialog(this,"Not found"); 
            return;
        }
        
        if("Person".equals(userRole)) {
            
            for(Person resource : personStore.getStore()){
                String userIdInStore = String.valueOf(resource.getPid());
                if(userId.matches(userIdInStore)) {
                    String passwordInStore = resource.getPassword();
                    if(password.matches(passwordInStore)) {
                        JOptionPane.showMessageDialog(this,"Login Success");
                 
                        systemAdmin.setCurrentUser("Person");
                        systemAdmin.setCurrentUserId(Integer.parseInt(userId));
                        systemAdmin.setCurrentCommunityId(resource.getCommunityId());
                        systemAdmin.setCurrentHouseId(resource.getHouseId());
                        
                        PatientNav patientNav = new PatientNav(SplitPane, systemAdmin, cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
                        Hero heroPanel = new Hero();

                        SplitPane.setLeftComponent(patientNav);
                        SplitPane.setRightComponent(heroPanel);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this,"Wrong Password");
                        return;
                    }  
                }
                
            }
            JOptionPane.showMessageDialog(this,"Not found"); 
            return;
        }
        
        if("Doctor".equals(userRole)) {
            
            for(Doctor resource : doctorStore.getStore()){
                String userIdInStore = String.valueOf(resource.getDid());
                if(userId.matches(userIdInStore)) {
                    String passwordInStore = resource.getPassword();
                    if(password.matches(passwordInStore)) {
                        JOptionPane.showMessageDialog(this,"Login Success");
                 
                        systemAdmin.setCurrentUser("Doctor");
                        systemAdmin.setCurrentUserId(Integer.parseInt(userId));
                        systemAdmin.setCurrentHospitalId(resource.getHospitalId());
                        
                        DoctorNav doctorNav = new DoctorNav(SplitPane, systemAdmin, cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
                        Hero heroPanel = new Hero();
                        
                        SplitPane.setLeftComponent(doctorNav);
                        SplitPane.setRightComponent(heroPanel);
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this,"Wrong Password");
                        return;
                    }  
                }
                
            }
            JOptionPane.showMessageDialog(this,"Not found"); 
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnNewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPersonActionPerformed
        systemAdmin.setCurrentUser("new person");
        
        PersonCreatePanel personCreatePanel = new PersonCreatePanel(personStore, houseStore, systemAdmin, communityStore);
        SplitPane.setRightComponent(personCreatePanel);
        
        BackPanel backPanel = new BackPanel(SplitPane, systemAdmin, cityStore, communityStore, hospitalStore, houseStore, doctorStore, personStore, encounterStore, vitalSignsStore, patientStore);
        SplitPane.setLeftComponent(backPanel);
    }//GEN-LAST:event_btnNewPersonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JButton btnNewPerson;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRole;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}