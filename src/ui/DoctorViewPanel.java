/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Doctor;
import models.DoctorStore;
import models.HospitalStore;

/**
 *
 * @author Ravindra
 */
public class DoctorViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorViewPanel
     */
    DoctorStore doctorStore;
    HospitalStore hospitalStore;
    models.SystemAdmin systemAdmin;
    public DoctorViewPanel(DoctorStore doctorStore, HospitalStore hospitalStore, models.SystemAdmin systemAdmin) {
        initComponents();
        
        this.doctorStore = doctorStore;
        this.hospitalStore = hospitalStore;
        this.systemAdmin = systemAdmin;
        
        addDataToTableFromStore();
    }
    
    private void addDataToTableFromStore() {
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        model.setRowCount(0);
        
        String userInSystem = systemAdmin.getCurrentUser();
        String hospitalIdInSystem = String.valueOf(systemAdmin.getCurrentHospitalId());
        
        for (Doctor resource : doctorStore.getStore()) {
            Object[] row = new Object[11];
            row[0] = resource;
            row[1] = resource.getFirstName();
            row[2] = resource.getLastName();
            row[3] = resource.getGender();
            row[4] = resource.getDOB();
            row[5] = resource.getEmail();
            row[6] = resource.getPhone();
            row[7] = resource.getAddress();
            row[8] = resource.getHospitalId();
            
            if("Hospital Admin".matches(userInSystem)) {
                 if(hospitalIdInSystem.matches(String.valueOf(resource.getHospitalId())) ) {
                       model.addRow(row);
                }
            } else if("System Admin".matches(userInSystem)|| "Community Admin".matches(userInSystem)) {
                model.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResources = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TextDoctorId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextDoctorGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextDoctorFirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextDoctorLastName = new javax.swing.JTextField();
        TextDoctorDOB = new javax.swing.JTextField();
        TextDoctorAddress = new javax.swing.JTextField();
        TextHospitalId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextDoctorEmail = new javax.swing.JTextField();
        TextDoctorPhoneNumber = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Doctor Panel");

        tblResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor ID", "First Name", "Last Name", "Gender", "Date Of Birth", "Email", "Phone Number", "Home Address", "Hospital ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblResources);
        if (tblResources.getColumnModel().getColumnCount() > 0) {
            tblResources.getColumnModel().getColumn(0).setResizable(false);
            tblResources.getColumnModel().getColumn(1).setResizable(false);
            tblResources.getColumnModel().getColumn(2).setResizable(false);
            tblResources.getColumnModel().getColumn(3).setResizable(false);
            tblResources.getColumnModel().getColumn(4).setResizable(false);
            tblResources.getColumnModel().getColumn(5).setResizable(false);
            tblResources.getColumnModel().getColumn(6).setResizable(false);
            tblResources.getColumnModel().getColumn(7).setResizable(false);
            tblResources.getColumnModel().getColumn(8).setResizable(false);
        }

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Doctor ID");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Gender");

        jLabel6.setText("Date of Birth");

        jLabel7.setText("Email");

        jLabel8.setText("Phone Number");

        jLabel9.setText("Address");

        jLabel10.setText("Hospital ID");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(48, 48, 48)
                .addComponent(btnDelete)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextDoctorId)
                            .addComponent(TextDoctorFirstName)
                            .addComponent(TextDoctorLastName)
                            .addComponent(TextDoctorDOB)
                            .addComponent(TextDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextDoctorPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(TextDoctorAddress)
                            .addComponent(TextHospitalId)
                            .addComponent(TextDoctorEmail))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextDoctorAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextDoctorDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnSubmit)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int currentRowIndex = tblResources.getSelectedRow();
        
        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Doctor currentResource =  (Doctor) model.getValueAt(currentRowIndex, 0);
        
        TextDoctorId.setText(String.valueOf(currentResource.getDid()));
        TextHospitalId.setText(String.valueOf(currentResource.getHospitalId()));
        TextDoctorAddress.setText(currentResource.getAddress());
        TextDoctorDOB.setText(currentResource.getDOB());
        TextDoctorEmail.setText(currentResource.getEmail());
        TextDoctorFirstName.setText(currentResource.getFirstName());
        TextDoctorLastName.setText(currentResource.getLastName());
        TextDoctorGender.setText(currentResource.getGender());
        TextDoctorPhoneNumber.setText(currentResource.getPhone());
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        int currentRowIndex = tblResources.getSelectedRow();
        
        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Doctor resource =  (Doctor) model.getValueAt(currentRowIndex, 0);
        
        resource.setDid(Integer.parseInt(TextDoctorId.getText()));
        resource.setHospitalId(Integer.parseInt(TextHospitalId.getText()));       
        resource.setAddress(TextDoctorAddress.getText());
        resource.setDOB(TextDoctorDOB.getText());
        resource.setEmail(TextDoctorEmail.getText());
        resource.setFirstName(TextDoctorFirstName.getText());
        resource.setLastName(TextDoctorLastName.getText());
        resource.setGender(TextDoctorGender.getText());
        resource.setPhone(TextDoctorPhoneNumber.getText());
        
        JOptionPane.showMessageDialog(this,"Successfully updated");
        
        TextDoctorId.setText("");
        TextHospitalId.setText("");
        TextDoctorAddress.setText("");
        TextDoctorDOB.setText("");
        TextDoctorEmail.setText("");
        TextDoctorFirstName.setText("");
        TextDoctorLastName.setText("");
        TextDoctorGender.setText("");
        TextDoctorPhoneNumber.setText("");
        
        addDataToTableFromStore();
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int currentRowIndex = tblResources.getSelectedRow();
        
        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to Delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Doctor currentResource =  (Doctor) model.getValueAt(currentRowIndex, 0);
        
        doctorStore.deleteResource(currentResource);
        
        JOptionPane.showMessageDialog(this, "Resource successfully deleted");
        
        addDataToTableFromStore();
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextDoctorAddress;
    private javax.swing.JTextField TextDoctorDOB;
    private javax.swing.JTextField TextDoctorEmail;
    private javax.swing.JTextField TextDoctorFirstName;
    private javax.swing.JTextField TextDoctorGender;
    private javax.swing.JTextField TextDoctorId;
    private javax.swing.JTextField TextDoctorLastName;
    private javax.swing.JTextField TextDoctorPhoneNumber;
    private javax.swing.JTextField TextHospitalId;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResources;
    // End of variables declaration//GEN-END:variables
}