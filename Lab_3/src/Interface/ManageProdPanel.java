/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Product;
import Business.ProductDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author info
 */
public class ManageProdPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountPanel
     */
    private ProductDirectory prodDir;
    private JPanel rightPanel;
/* 
    ManageProdPanel( ProductDirectory prodDir) {
        initComponents();
        this.prodDir=prodDir;
        populate();
    } */

    ManageProdPanel(JPanel rightPanel, ProductDirectory accDir) {
        
        initComponents();
        this.prodDir=accDir;
        this.rightPanel = rightPanel;
        populate();
        textFieldEnable(false);
        updateBtn.setVisible(false);
        
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Product a : prodDir.getProductDirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=a;
            row[1]=a.getAvailNum();
            row[2]=a.getPrice();
            dtm.addRow(row);
        }
    }
    
    
    public void textFieldEnable(boolean click){
        lblHead.setVisible(click);
        lblProdName.setVisible(click);
        lblAvail.setVisible(click);
        lblDesc.setVisible(click);
        lblPrice.setVisible(click);
        txtAvailablity.setVisible(click);
        txtDescription.setVisible(click);
        txtPrice.setVisible(click);
        txtProdName.setVisible(click);
        saveBtn.setVisible(click);
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        lblManage = new javax.swing.JLabel();
        lblSearchAccNo = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        bckBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        txtAvailablity = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        lblHead = new javax.swing.JLabel();
        lblProdName = new javax.swing.JLabel();
        lblAvail = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        viewProductBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prod Name ", "Availablity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblManage.setText("Manage Products");

        lblSearchAccNo.setText("Search by Product Name");

        btnDelete.setText("Delete Product");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        bckBtn.setText("<< Back");
        bckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update Product");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save Product");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        lblDesc.setText("Description");

        lblHead.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHead.setText("Update Product");

        lblProdName.setText("Product Name*");

        lblAvail.setText("Availiblity*");

        lblPrice.setText("Price*");

        viewProductBtn.setText("View Product");
        viewProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblManage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bckBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(viewProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSearchAccNo)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchBtn))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblHead))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProdName)
                                    .addComponent(lblAvail)
                                    .addComponent(lblPrice)
                                    .addComponent(lblDesc))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAvailablity)
                                    .addComponent(txtPrice)
                                    .addComponent(txtDescription)
                                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(236, 236, 236))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bckBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchAccNo)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(viewProductBtn))
                .addGap(18, 18, 18)
                .addComponent(lblHead)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdName)
                    .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAvailablity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesc)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn))
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Product prod = (Product)tblDirectory.getValueAt(selectedRow, 0);
                prodDir.deleteProduct(prod);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void bckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckBtnActionPerformed
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
        
        
        
        
        
        
    }//GEN-LAST:event_bckBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        int selectedRow = tblDirectory.getSelectedRow();
        

        if(selectedRow >= 0)
        {
            
            Product product = (Product)tblDirectory.getValueAt(selectedRow, 0);
            this.txtAvailablity.setText(product.getAvailNum() + " ");
            this.txtProdName.setText(product.getName() + "");
            this.txtPrice.setText(product.getPrice() + "");
            this.txtDescription.setText(product.getDescription() + "");
            textFieldEnable(true);
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row.");        
        }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
                  
       int selectedRow = tblDirectory.getSelectedRow();
        
               
        
        if(selectedRow >= 0)
        {
//            textFieldEnable(true);
              
            Product prod = (Product)tblDirectory.getValueAt(selectedRow, 0);
            try{
            Double price = Double.parseDouble(txtPrice.getText());
            }
            catch(NumberFormatException e)
            {
            
                  
                JOptionPane.showMessageDialog(null, "Please type in a number in price.");
                txtPrice.setText("");
                  
                return;
            }
            try{
            Integer avail = Integer.parseInt(txtAvailablity.getText());
            
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Please type in a number in Availablity.");
                txtAvailablity.setText("");
                return;
            }            
            
            prod.setAvailNum(Integer.parseInt(txtAvailablity.getText()));
            prod.setPrice(Double.parseDouble(txtPrice.getText()));
            prod.setName(txtProdName.getText());
            prod.setDescription(txtDescription.getText());            
            
            JOptionPane.showMessageDialog(null, "Vitals updated Successfully..");                    
            
            textFieldEnable(false);
            populate();
            
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row.");        
        }
        
        
      
    }//GEN-LAST:event_saveBtnActionPerformed

    private void viewProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductBtnActionPerformed
                    
       int selectedRow = tblDirectory.getSelectedRow();
        
               
        
        if(selectedRow >= 0)
        {            
            Product prod = (Product)tblDirectory.getValueAt(selectedRow, 0);
            ViewPanel viewPanel = new ViewPanel(prod, prodDir, this.rightPanel);
            rightPanel.add("ViewPanel", viewPanel);
            CardLayout layout = (CardLayout) this.rightPanel.getLayout();
            layout.next(rightPanel);
  
        }   
        
        

        
        
        
        
    }//GEN-LAST:event_viewProductBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String s = txtsearch.getText();

        if(!(s.length() == 0)){
            ArrayList<Product> prods = prodDir.searchProducts(s);
            DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
            dtm.setRowCount(0);

            for(Product prod : prods){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]=prod;
                row[1]=prod.getAvailNum();
                row[2]=prod.getPrice();
                dtm.addRow(row);
            }
        }
        
        else{
            populate();
       
        }
        
        
        
        
        
    }//GEN-LAST:event_searchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckBtn;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvail;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProdName;
    private javax.swing.JLabel lblSearchAccNo;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtAvailablity;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewProductBtn;
    // End of variables declaration//GEN-END:variables
}
