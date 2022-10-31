/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_doctor;

import ui.*;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import medicalsystem.DiagnosisRequest;
import medicalsystem.EncounterHistory;
import medicalsystem.MedicalSystem;
import medicalsystem.Patient;
import medicalsystem.PatientDirectory;
import medicalsystem.User;

/**
 *
 * @author Jianpeng Ji
 */
public class PatientsForDiagnosisJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientsForDiagnosisJPanel
     */
    private JPanel userProcessContainer;
    private MedicalSystem admin;
    private User user;
    private EncounterHistory encounterHistory;

    public PatientsForDiagnosisJPanel(JPanel userProcessContainer, MedicalSystem admin, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.admin = admin;
        this.user = user;
        populatePatientTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonDiagnosis = new javax.swing.JButton();

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "First Name", "Last Name", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patients List");

        jButtonDiagnosis.setText("Diagnosis");
        jButtonDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiagnosisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButtonDiagnosis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(290, 290, 290)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButtonDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiagnosisActionPerformed
        int selectedRowIndex = tblPatient.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please selece a patient to view and update.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        DiagnosisRequest diagnosisRequest = (DiagnosisRequest) model.getValueAt(selectedRowIndex, 0);
        DiagnosisJPanel addPatient = new DiagnosisJPanel(userProcessContainer, admin, encounterHistory, user, diagnosisRequest);
        userProcessContainer.add("DiagnosisJPanel", addPatient);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButtonDiagnosisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButtonDiagnosis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPatient;
    // End of variables declaration//GEN-END:variables

    public void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        HashMap<String, DiagnosisRequest> diagnosisRequestMap = admin.diagnosisRequestDirectory.getDiagnosisRequestMap();
        for (DiagnosisRequest request : diagnosisRequestMap.values()) {
            if (request.getDoctorID() == Integer.parseInt(user.getId())&&request.getStatus().equals("request")) {
                Object[] row = new Object[4];
                row[0] = request;  // override the method to show id
                Patient p = admin.patientDirectory.getPatientMap().get(request.getPatientID());
                row[1] = p.getFirstName();
                row[2] = p.getFirstName();
                row[3] = request.getDate();
                model.addRow(row);

            }

        }
    }

   
}
