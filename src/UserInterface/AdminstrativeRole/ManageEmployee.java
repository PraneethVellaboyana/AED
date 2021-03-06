/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.AdminstrativeRole;

import Business.Business;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Praneeth Reddy
 */
public class ManageEmployee extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Business business;
    private Organization organization;
    /**
     * Creates new form ManageEmployee
     */
    public ManageEmployee(JPanel userProcessContainer,Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateOrgCombo();
        populateTable();
    }
    
    private void populateTable(){
        
        organization = (Organization)cmbForOrgTable.getSelectedItem();
        
        DefaultTableModel dtm = (DefaultTableModel)tblEmp.getModel();
        dtm.setRowCount(0);
        
        for(Employee e: organization.getEmployeeDirectory().getEmployeeList()){
            
            Object[] rows = new Object[2];
            
            rows[0] = e.getEmployeeID();
            rows[1] = e;
            
            dtm.addRow(rows);
        }
        
    }
    
    private void populateOrgCombo(){
            cmbForCreateEmp.removeAllItems();
            cmbForOrgTable.removeAllItems();
        
        for(Organization org: business.getOrganizationDirectory().getOrganizationDirectory()){
            cmbForOrgTable.addItem(org);
            cmbForCreateEmp.addItem(org);
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

        btnBack = new javax.swing.JButton();
        btnRemoveEmp = new javax.swing.JButton();
        btnAddEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbForOrgTable = new javax.swing.JComboBox();
        cmbForCreateEmp = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemoveEmp.setText("Remove");
        btnRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEmpActionPerformed(evt);
            }
        });

        btnAddEmp.setText("Add Employee");
        btnAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Manage Employee");

        jLabel2.setText("Employee Name");

        jLabel3.setText("Organization");

        cmbForOrgTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbForOrgTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbForOrgTableActionPerformed(evt);
            }
        });

        cmbForCreateEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Organization");

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmp);
        if (tblEmp.getColumnModel().getColumnCount() > 0) {
            tblEmp.getColumnModel().getColumn(0).setResizable(false);
            tblEmp.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(cmbForOrgTable, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRemoveEmp)
                                            .addComponent(cmbForCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddEmp)
                                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbForOrgTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveEmp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbForCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddEmp)
                        .addGap(16, 16, 16))
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEmpActionPerformed
        // TODO add your handling code here:
        int row = tblEmp.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a line.", "Warning Message", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Employee e = (Employee)tblEmp.getValueAt(row, 1);
        organization.getEmployeeDirectory().removeEmployee(e);
        populateTable();
    }//GEN-LAST:event_btnRemoveEmpActionPerformed

    private void btnAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpActionPerformed
        // TODO add your handling code here:
        organization = (Organization)cmbForCreateEmp.getSelectedItem();
        String eName = txtEmpName.getText().trim();
        if(eName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a name for employee.", "Warning Message", JOptionPane.WARNING_MESSAGE);
        }
        
        Employee e = organization.getEmployeeDirectory().createEmployee(eName, organization);
        
        JOptionPane.showMessageDialog(null, e.getName()+" has been added to the "+organization);
        txtEmpName.setText("");
        populateTable();
    }//GEN-LAST:event_btnAddEmpActionPerformed

    private void cmbForOrgTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbForOrgTableActionPerformed
        // TODO add your handling code here:
        if(organization!=null){
            populateTable();
        }
    }//GEN-LAST:event_cmbForOrgTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveEmp;
    private javax.swing.JComboBox cmbForCreateEmp;
    private javax.swing.JComboBox cmbForOrgTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtEmpName;
    // End of variables declaration//GEN-END:variables
}
