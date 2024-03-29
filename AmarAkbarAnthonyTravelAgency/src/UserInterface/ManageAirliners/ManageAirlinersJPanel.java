/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliners.Airliner;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohit
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    
    JPanel displayPanel;
    MainTravelAgency mainTravelAgency;
    
    
    public ManageAirlinersJPanel(JPanel displayPanel, MainTravelAgency mainTravelAgency) {
        initComponents();
        this.mainTravelAgency = mainTravelAgency;
        this.displayPanel = displayPanel;
        populate();
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        viewAirlineBtn = new javax.swing.JButton();
        addAirlineBtn = new javax.swing.JButton();
        searchFieldTxt = new javax.swing.JTextField();
        searchAirlinerBtn = new javax.swing.JButton();
        deleteAirline = new javax.swing.JButton();
        updateAirliner = new javax.swing.JButton();
        masterSchedule = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Airliners");

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Airliners Name", "Airliners Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        viewAirlineBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewAirlineBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewAirlineBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewAirlineBtn.setText("View Airlines");
        viewAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlineBtnActionPerformed(evt);
            }
        });

        addAirlineBtn.setBackground(new java.awt.Color(0, 0, 0));
        addAirlineBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addAirlineBtn.setForeground(new java.awt.Color(255, 255, 255));
        addAirlineBtn.setText("Add New Airlines");
        addAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirlineBtnActionPerformed(evt);
            }
        });

        searchFieldTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchFieldTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldTxtActionPerformed(evt);
            }
        });

        searchAirlinerBtn.setBackground(new java.awt.Color(0, 0, 0));
        searchAirlinerBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchAirlinerBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchAirlinerBtn.setText("Search Airliner");
        searchAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAirlinerBtnActionPerformed(evt);
            }
        });

        deleteAirline.setBackground(new java.awt.Color(0, 0, 0));
        deleteAirline.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteAirline.setForeground(new java.awt.Color(255, 255, 255));
        deleteAirline.setText("Delete Airline");
        deleteAirline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlineActionPerformed(evt);
            }
        });

        updateAirliner.setBackground(new java.awt.Color(0, 0, 0));
        updateAirliner.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateAirliner.setForeground(new java.awt.Color(255, 255, 255));
        updateAirliner.setText("Update Airlines");
        updateAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAirlinerActionPerformed(evt);
            }
        });

        masterSchedule.setBackground(new java.awt.Color(0, 0, 0));
        masterSchedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        masterSchedule.setForeground(new java.awt.Color(255, 255, 255));
        masterSchedule.setText("View Master Schedule");
        masterSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(addAirlineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(viewAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(updateAirliner)
                            .addGap(18, 18, 18)
                            .addComponent(deleteAirline))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchAirlinerBtn)
                            .addGap(18, 18, 18)
                            .addComponent(masterSchedule))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAirlinerBtn)
                    .addComponent(masterSchedule)
                    .addComponent(searchFieldTxt))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAirline, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlineBtnActionPerformed
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow >= 0)
        {            
            Airliner airliner = (Airliner) tblDirectory.getValueAt(selectedRow, 0);
            ViewAirlinerJPanel viewAirliner = new ViewAirlinerJPanel(airliner, mainTravelAgency, this.displayPanel);
            displayPanel.add("viewAirliner", viewAirliner);
            CardLayout layout = (CardLayout) this.displayPanel.getLayout();
            layout.next(displayPanel);
  
        }   

    }//GEN-LAST:event_viewAirlineBtnActionPerformed

    private void addAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirlineBtnActionPerformed
        AddNewAirlinerPanel airlinePanel = new AddNewAirlinerPanel(displayPanel, mainTravelAgency);
        displayPanel.add("CreateAircraftJPanel", airlinePanel);
        CardLayout layout = (CardLayout) this.displayPanel.getLayout();
        layout.next(displayPanel);

                            
        
    }//GEN-LAST:event_addAirlineBtnActionPerformed

    private void searchAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAirlinerBtnActionPerformed
        
        String s = searchFieldTxt.getText();

        if(!(s.length() == 0)){
            DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
            dtm.setRowCount(0);

            for(Airliner airliner : this.mainTravelAgency.searchAirliners(s)){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]=airliner;
                row[1]=airliner.getAirlineCode();
                dtm.addRow(row);
            }
        }
        
        else{
            populate();
       
        }   
    }//GEN-LAST:event_searchAirlinerBtnActionPerformed

    private void deleteAirlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Airliner airliner = (Airliner)tblDirectory.getValueAt(selectedRow, 0);
                this.mainTravelAgency.deleteAirline(airliner);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please make a selection first.");
        }

    }//GEN-LAST:event_deleteAirlineActionPerformed

    private void updateAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAirlinerActionPerformed
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow >= 0)
        {            
            Airliner airliner = (Airliner) tblDirectory.getValueAt(selectedRow, 0);
            UpdateAirliner updateAirliner = new UpdateAirliner( this.displayPanel , mainTravelAgency, airliner);
            displayPanel.add("updateAirliner", updateAirliner);
            CardLayout layout = (CardLayout) this.displayPanel.getLayout();
            layout.next(displayPanel);
  
        }   
        else{
            JOptionPane.showMessageDialog(null, "Please make a selection first.");        
        
        }    
        
    }//GEN-LAST:event_updateAirlinerActionPerformed

    private void searchFieldTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldTxtActionPerformed

    private void masterScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterScheduleActionPerformed
        masterSchedule sch = new masterSchedule(mainTravelAgency,displayPanel);
        displayPanel.add("masterSchedule", sch);
        CardLayout layout = (CardLayout) this.displayPanel.getLayout();
        layout.next(displayPanel);

        
        
        
        
        
        
    }//GEN-LAST:event_masterScheduleActionPerformed

    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        for(Airliner a : mainTravelAgency.getAirliners()){
            Object[] row = new Object[dtm.getColumnCount()];
         
            row[0]=a;
            row[1]=a.getAirlineCode();
            dtm.addRow(row);
        }
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAirlineBtn;
    private javax.swing.JButton deleteAirline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton masterSchedule;
    private javax.swing.JButton searchAirlinerBtn;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JButton updateAirliner;
    private javax.swing.JButton viewAirlineBtn;
    // End of variables declaration//GEN-END:variables
}
