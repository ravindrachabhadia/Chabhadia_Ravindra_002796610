/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.DoctorStore;
import models.Encounter;
import models.EncounterStore;

/**
 *
 * @author Ravindra
 */
public class EncounterViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterViewPanel
     */
    EncounterStore encounterStore;    
    DoctorStore doctorStore;

    public EncounterViewPanel(EncounterStore encounterStore, DoctorStore doctorStore) {
        initComponents();
        
        this.encounterStore = encounterStore;
        this.doctorStore = doctorStore;
        
        addDataToTableFromStore();
    }
    
    private void addDataToTableFromStore() {
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        model.setRowCount(0);
        
        for (Encounter resource : encounterStore.getStore()) {
            Object[] row = new Object[11];
            row[0] = resource;
            row[1] = resource.getDoctorId();
            row[2] = resource.getViralSingsId();
            row[3] = resource.getDate();
            row[4] = resource.getDetails();
            row[5] = resource.getSuggestions();
            row[6] = resource.getNextEnounter();
            
            model.addRow(row);
            
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextPersonId = new javax.swing.JTextField();
        TextDoctorId = new javax.swing.JTextField();
        TextVitalSignId = new javax.swing.JTextField();
        TextEncounterDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextEncounterDetails = new javax.swing.JTextField();
        TextEncounterSuggestions = new javax.swing.JTextField();
        TextEncounterNext = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Encounter Panel");

        tblResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Doctor ID", "Vital Signs ID", "Date", "Details", "Suggestions", "Next Encounter"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        }

        btnView.setBackground(new java.awt.Color(51, 204, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Person ID");

        jLabel3.setText("Doctor ID");

        jLabel4.setText("Vital Signs ID");

        jLabel5.setText("Date");

        jLabel6.setText("Details");

        jLabel7.setText("Suggestions");

        jLabel8.setText("Next Encounter");

        btnSubmit.setBackground(new java.awt.Color(255, 102, 102));
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addGap(119, 119, 119))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(66, 66, 66)
                .addComponent(btnDelete)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextPersonId, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(TextVitalSignId)
                            .addComponent(TextDoctorId)
                            .addComponent(TextEncounterDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextEncounterDetails)
                            .addComponent(TextEncounterSuggestions)
                            .addComponent(TextEncounterNext, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextVitalSignId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextEncounterDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextEncounterSuggestions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(TextEncounterNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
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
        Encounter currentResource =  (Encounter) model.getValueAt(currentRowIndex, 0);
        
        TextPersonId.setText(String.valueOf(currentResource.getPid()));
        TextDoctorId.setText(String.valueOf(currentResource.getDoctorId()));
        TextVitalSignId.setText(String.valueOf(currentResource.getViralSingsId()));
        TextEncounterDate.setText(currentResource.getDate());
        TextEncounterDetails.setText(currentResource.getDetails());
        TextEncounterSuggestions.setText(currentResource.getSuggestions());
        TextEncounterNext.setText(currentResource.getNextEnounter());
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        int currentRowIndex = tblResources.getSelectedRow();
        
        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Encounter resource =  (Encounter) model.getValueAt(currentRowIndex, 0);
        
        resource.setPid(Integer.parseInt(TextPersonId.getText()));
        resource.setDoctorId(Integer.parseInt(TextDoctorId.getText()));
        resource.setViralSingsId(Integer.parseInt(TextVitalSignId.getText()));
        resource.setDate(TextEncounterDate.getText());
        resource.setDetails(TextEncounterDetails.getText());
        resource.setSuggestions(TextEncounterSuggestions.getText());
        resource.setNextEnounter(TextEncounterNext.getText());
        
        JOptionPane.showMessageDialog(this,"Successfully updated");
        
        TextPersonId.setText("");
        TextDoctorId.setText("");
        TextVitalSignId.setText("");
        TextEncounterDate.setText("");
        TextEncounterDetails.setText("");
        TextEncounterSuggestions.setText("");
        TextEncounterNext.setText("");
        
        addDataToTableFromStore();
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int currentRowIndex = tblResources.getSelectedRow();
        
        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Encounter currentResource =  (Encounter) model.getValueAt(currentRowIndex, 0);
        
        encounterStore.deleteResource(currentResource);
        
        JOptionPane.showMessageDialog(this, "Resource successfully deleted");
        
        addDataToTableFromStore();
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextDoctorId;
    private javax.swing.JTextField TextEncounterDate;
    private javax.swing.JTextField TextEncounterDetails;
    private javax.swing.JTextField TextEncounterNext;
    private javax.swing.JTextField TextEncounterSuggestions;
    private javax.swing.JTextField TextPersonId;
    private javax.swing.JTextField TextVitalSignId;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResources;
    // End of variables declaration//GEN-END:variables
}
