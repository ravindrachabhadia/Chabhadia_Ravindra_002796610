/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.HouseStore;
import models.Person;
import models.PersonStore;

/**
 *
 * @author sagred
 */
public class PersonViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonViewPanel
     */
    PersonStore personStore;
    HouseStore houseStore;
    models.SystemAdmin systemAdmin;
    public PersonViewPanel(PersonStore personStore,  HouseStore houseStore, models.SystemAdmin systemAdmin) {
        initComponents();
        
        this.personStore = personStore;
        this.houseStore = houseStore;
        this.systemAdmin = systemAdmin;

        
        addDataToTableFromStore();
    }
    
    private void addDataToTableFromStore() {
        
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        model.setRowCount(0);
        
        String userInSystem = systemAdmin.getCurrentUser();
        
        for (Person resource : personStore.getStore()) {
            Object[] row = new Object[11];
            row[0] = resource;
            row[1] = resource.getFirstName();
            row[2] = resource.getLastName();
            row[3] = resource.getGender();
            row[4] = resource.getDOB();
            row[5] = resource.getEmail();
            row[6] = resource.getPhone();
            row[7] = resource.getAddress();
            row[8] = resource.getHouseId();
            
           if("System Admin".matches(userInSystem)|| "Community Admin".matches(userInSystem)) {
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
        jLabel5 = new javax.swing.JLabel();
        TextPersonFirstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextPersonLastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextPersonDOB = new javax.swing.JTextField();
        TextPersonId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextPersonGender = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextPersonPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextPersonPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        TextPersonAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextHouseId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextPersonEmail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Person Panel");

        tblResources.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "First Name", "Last Name", "Gender", "DOB", "Email", "Phone Number", "Address", "House ID"
            }
        ));
        jScrollPane1.setViewportView(tblResources);

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

        jLabel5.setText("Gender");

        jLabel6.setText("Date of Birth");

        jLabel2.setText("Person ID");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel11.setText("Password");

        jLabel7.setText("Email");

        jLabel8.setText("Phone Number");

        jLabel9.setText("Address");

        jLabel10.setText("House ID");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(99, 99, 99)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextPersonId)
                                    .addComponent(TextPersonFirstName)
                                    .addComponent(TextPersonLastName)
                                    .addComponent(TextPersonDOB)
                                    .addComponent(TextPersonGender, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextHouseId)
                                    .addComponent(TextPersonEmail)
                                    .addComponent(TextPersonPhoneNumber)
                                    .addComponent(TextPersonAddress)
                                    .addComponent(TextPersonPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextPersonPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(btnSubmit)
                .addGap(41, 41, 41))
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
        Person currentResource =  (Person) model.getValueAt(currentRowIndex, 0);

        TextPersonId.setText(String.valueOf(currentResource.getPid()));
        TextHouseId.setText(String.valueOf(currentResource.getHouseId()));
        TextPersonAddress.setText(currentResource.getAddress());
        TextPersonDOB.setText(currentResource.getDOB());
        TextPersonEmail.setText(currentResource.getEmail());
        TextPersonFirstName.setText(currentResource.getFirstName());
        TextPersonLastName.setText(currentResource.getLastName());
        TextPersonGender.setText(currentResource.getGender());
        TextPersonPhoneNumber.setText(currentResource.getPhone());
        TextPersonPassword.setText(currentResource.getPassword()); 
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Person resource =  (Person) model.getValueAt(currentRowIndex, 0);

        resource.setPid(Integer.parseInt(TextPersonId.getText()));
        resource.setHouseId(Integer.parseInt(TextPersonId.getText()));
        resource.setAddress(TextPersonAddress.getText());
        resource.setDOB(TextPersonDOB.getText());
        resource.setEmail(TextPersonEmail.getText());
        resource.setFirstName(TextPersonFirstName.getText());
        resource.setLastName(TextPersonLastName.getText());
        resource.setGender(TextPersonGender.getText());
        resource.setPhone(TextPersonPhoneNumber.getText());
        resource.setPassword(TextPersonPassword.getText());

        JOptionPane.showMessageDialog(this,"Successfully updated");

        TextPersonId.setText("");
        TextHouseId.setText("");
        TextPersonAddress.setText("");
        TextPersonDOB.setText("");
        TextPersonEmail.setText("");
        TextPersonFirstName.setText("");
        TextPersonLastName.setText("");
        TextPersonGender.setText("");
        TextPersonPhoneNumber.setText("");
        TextPersonPassword.setText("");

        addDataToTableFromStore();
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int currentRowIndex = tblResources.getSelectedRow();

        if(currentRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select to Delete");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblResources.getModel();
        Person currentResource =  (Person) model.getValueAt(currentRowIndex, 0);

        personStore.deleteResource(currentResource);

        JOptionPane.showMessageDialog(this, "Resource successfully deleted");

        addDataToTableFromStore();
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextHouseId;
    private javax.swing.JTextField TextPersonAddress;
    private javax.swing.JTextField TextPersonDOB;
    private javax.swing.JTextField TextPersonEmail;
    private javax.swing.JTextField TextPersonFirstName;
    private javax.swing.JTextField TextPersonGender;
    private javax.swing.JTextField TextPersonId;
    private javax.swing.JTextField TextPersonLastName;
    private javax.swing.JPasswordField TextPersonPassword;
    private javax.swing.JTextField TextPersonPhoneNumber;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
