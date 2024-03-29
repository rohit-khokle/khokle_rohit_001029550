/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomer;

import Business.TravelOffice.Customer;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohit
 */
public class ManageCustomerForm extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerForm
     */
    private JPanel displayPanel;
    private MainTravelAgency mainTravelAgency;
    public ManageCustomerForm(JPanel displayPanel, MainTravelAgency mainTravelAgency) {
        initComponents();
        this.displayPanel = displayPanel;
        this.mainTravelAgency = mainTravelAgency;
        populateCustomerTable();
//        btnClearSearch.setEnabled(False);
        
    }
    
    public void populateCustomerTable(){
    DefaultTableModel dtm = (DefaultTableModel) tblCustomers.getModel();
        dtm.setRowCount(0);
        for(Customer customer: mainTravelAgency.getCustomers().getCustomers()) {
            Object[] row = new Object[4];
            row[0]=customer;
            row[1]=customer.getLastName();
            row[2]=customer.getAge();
            row[3]=customer.getGender();
            
            dtm.addRow(row);
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
        tblCustomers = new javax.swing.JTable();
        btnCreateCustomer = new javax.swing.JButton();
        btnViewCustomer = new javax.swing.JButton();
        btnRemoveCustomer = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClearSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customers");

        tblCustomers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Gender"
            }
        ));
        jScrollPane1.setViewportView(tblCustomers);

        btnCreateCustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnCreateCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCreateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateCustomer.setText("Create Customer");
        btnCreateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCustomerActionPerformed(evt);
            }
        });

        btnViewCustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnViewCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomer.setText("View Customer");
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        btnRemoveCustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnRemoveCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemoveCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveCustomer.setText("Remove Customer");
        btnRemoveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveCustomerActionPerformed(evt);
            }
        });

        txtSearchCustomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search Customer");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClearSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnClearSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClearSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnClearSearch.setText("Clear Search");
        btnClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreateCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewCustomer))
                    .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemoveCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClearSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewCustomer)
                    .addComponent(btnRemoveCustomer)
                    .addComponent(btnCreateCustomer))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(13, 13, 13)
                .addComponent(btnClearSearch)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCustomerActionPerformed
        // TODO add your handling code here:
        CreateCustomerJPanel panel = new CreateCustomerJPanel(displayPanel, mainTravelAgency);
        displayPanel.add("CreateCustomerJPanel", panel);
        CardLayout layout = (CardLayout) displayPanel.getLayout();
        layout.next(displayPanel);
    }//GEN-LAST:event_btnCreateCustomerActionPerformed

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomers.getSelectedRow();
         if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table first to view Customer details","Warning",JOptionPane.WARNING_MESSAGE);
         }
         else {
           Customer customer = (Customer)tblCustomers.getValueAt(selectedRow,0);
           ViewCustomerJPanel viewCustomerJPanel = new ViewCustomerJPanel(displayPanel,customer);
           displayPanel.add("ViewCustomerJPanel",viewCustomerJPanel);
           CardLayout layout = (CardLayout) displayPanel.getLayout();
           layout.next(displayPanel);
         }
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCustomerActionPerformed

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        // TODO add your handling code here:
        
        txtSearchCustomer.setText("");
        
        btnSearch.setEnabled(true);
    }//GEN-LAST:event_btnClearSearchActionPerformed

    private void btnRemoveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveCustomerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomers.getSelectedRow();
         if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table to delete that Customer details","Warning",JOptionPane.WARNING_MESSAGE);
         }
         else {
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the Customer ?","Warning",dialogButton);
           if(dialogResult == JOptionPane.YES_OPTION){
           Customer customer = (Customer)tblCustomers.getValueAt(selectedRow,0);
           mainTravelAgency.getCustomers().deleteProduct(customer);
           populateCustomerTable();
           }
         }
       
    }//GEN-LAST:event_btnRemoveCustomerActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        
        
        String searchText = txtSearchCustomer.getText();
        if(searchText.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter Customer FirstName or LastName to Search ");
        }
        else {
            DefaultTableModel dtm = (DefaultTableModel) tblCustomers.getModel();
            dtm.setRowCount(0);
            for(Customer customer: mainTravelAgency.getCustomers().getCustomers()) {
            if(customer.getfirstName().equalsIgnoreCase(searchText) || customer.getLastName().equalsIgnoreCase(searchText)){
                Object[] row = new Object[4];
                row[0]=customer;
                row[1]=customer.getLastName();
                row[2]=customer.getAge();
                row[3]=customer.getGender();

                dtm.addRow(row);
            }
          }
            btnClearSearch.setEnabled(true);
            btnSearch.setEnabled(false);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnCreateCustomer;
    private javax.swing.JButton btnRemoveCustomer;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtSearchCustomer;
    // End of variables declaration//GEN-END:variables
}
