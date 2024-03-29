/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliners.Airliner;
import Business.Airliners.Airplane;
import Business.Airliners.Fleet;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohit
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
    
    
    Airliner airliner;
    MainTravelAgency mainTravelAgency;
    JPanel displayPanel;
    
    public ViewAirlinerJPanel(Airliner airliner, MainTravelAgency mainTravelAgency, JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.mainTravelAgency = mainTravelAgency;
        this.airliner = airliner;
        
        airlinerCodeTxt.setText("<html><font size=5>"+airliner.getAirlineCode());
        airlinerNameTxt.setText("<html><font size=5>"+airliner.getAirlineName());        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        addNewAircraft = new javax.swing.JButton();
        searchFieldTxt = new javax.swing.JTextField();
        searchAirlinerBtn = new javax.swing.JButton();
        viewAirlineBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        airlinerNameTxt = new javax.swing.JLabel();
        airlinerCodeTxt = new javax.swing.JLabel();
        updateAircraft = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Airliners");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Airliner Name : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Airliner Code : ");

        tblDirectory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aircraft Name", "Aircraft Type", "Capacity"
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

        addNewAircraft.setBackground(new java.awt.Color(0, 0, 0));
        addNewAircraft.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addNewAircraft.setForeground(new java.awt.Color(255, 255, 255));
        addNewAircraft.setText("Add New Aircraft");
        addNewAircraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAircraftActionPerformed(evt);
            }
        });

        searchFieldTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchAirlinerBtn.setBackground(new java.awt.Color(0, 0, 0));
        searchAirlinerBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchAirlinerBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchAirlinerBtn.setText("Search Fleet");
        searchAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAirlinerBtnActionPerformed(evt);
            }
        });

        viewAirlineBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewAirlineBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewAirlineBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewAirlineBtn.setText("View Aircraft Details");
        viewAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlineBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 0, 51));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinerNameTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        airlinerNameTxt.setText("jLabel4");

        airlinerCodeTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        airlinerCodeTxt.setText("jLabel4");

        updateAircraft.setBackground(new java.awt.Color(0, 0, 0));
        updateAircraft.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateAircraft.setForeground(new java.awt.Color(255, 255, 255));
        updateAircraft.setText("Update Aircraft Details");
        updateAircraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAircraftActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete Aircraft Details");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airlinerNameTxt)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airlinerCodeTxt))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(addNewAircraft)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(viewAirlineBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(updateAircraft, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchAirlinerBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(airlinerCodeTxt)
                    .addComponent(airlinerNameTxt))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFieldTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchAirlinerBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewAircraft, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAircraft, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewAirlineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewAircraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewAircraftActionPerformed
         AddNewAircraft addNewAircraft = new AddNewAircraft(mainTravelAgency, airliner, this.displayPanel);
            displayPanel.add("addNewAircraft", addNewAircraft);
            CardLayout layout = (CardLayout) this.displayPanel.getLayout();
            layout.next(displayPanel);    }//GEN-LAST:event_addNewAircraftActionPerformed

    private void searchAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAirlinerBtnActionPerformed

        String s = searchFieldTxt.getText();

        if(!(s.length() == 0)){
            DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
            dtm.setRowCount(0);

            for(Airplane airliner : this.airliner.getFleet().searchPlanes(s)){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]=airliner;
                row[1]=airliner.getType();
                row[2]=airliner.getNoOfSeats();
                dtm.addRow(row);
            }
        }

        else{
            populate();

        }
    }//GEN-LAST:event_searchAirlinerBtnActionPerformed
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        Fleet a = airliner.getFleet();
            for(Airplane aircraft: a.getAirplanes())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]=aircraft;
                row[1]=aircraft.getType(); // Need to define toString of FlightDetails..
                row[2]=aircraft.getNoOfSeats();
                dtm.addRow(row);
            }
        
    }
    
    
    private void viewAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlineBtnActionPerformed
        
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow >= 0)
        {            
            Airplane aircraft = (Airplane)tblDirectory.getValueAt(selectedRow, 0);
            ViewAircraftDetails viewAircraft = new ViewAircraftDetails(aircraft, mainTravelAgency, this.displayPanel);
            displayPanel.add("viewAircraft", viewAircraft);
            CardLayout layout = (CardLayout) this.displayPanel.getLayout();
            layout.next(displayPanel);
  
        }   

        
        
        
        
        
        
        
        
    }//GEN-LAST:event_viewAirlineBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Component[] comps = this.displayPanel.getComponents();
        for(Component comp: comps){
            if(comp instanceof ManageAirlinersJPanel){
                ManageAirlinersJPanel manageAdmin = (ManageAirlinersJPanel) comp;
                manageAdmin.populate();
            
            }
        
        
        }
        
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.remove(this);
        layout.previous(displayPanel);
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateAircraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAircraftActionPerformed
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow >= 0)
        {            
            Airplane aircraft = (Airplane)tblDirectory.getValueAt(selectedRow, 0);
            UpdateAircraft updateAircraft = new UpdateAircraft(mainTravelAgency, airliner, this.displayPanel, aircraft);
            displayPanel.add("updateAircraft", updateAircraft);
            CardLayout layout = (CardLayout) this.displayPanel.getLayout();
            layout.next(displayPanel);
  
        }   

        
    }//GEN-LAST:event_updateAircraftActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                    Airplane aircraft = (Airplane)tblDirectory.getValueAt(selectedRow, 0);
                    airliner.getFleet().getAirplanes().remove(aircraft);
                    populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please make a selection first.");
        }
        
        
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewAircraft;
    private javax.swing.JLabel airlinerCodeTxt;
    private javax.swing.JLabel airlinerNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton searchAirlinerBtn;
    private javax.swing.JTextField searchFieldTxt;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JButton updateAircraft;
    private javax.swing.JButton viewAirlineBtn;
    // End of variables declaration//GEN-END:variables
}
