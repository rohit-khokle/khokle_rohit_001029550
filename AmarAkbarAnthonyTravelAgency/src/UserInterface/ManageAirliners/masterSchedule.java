/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliners.AircraftFlights;
import Business.Airliners.FlightDates;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohit
 */
public class masterSchedule extends javax.swing.JPanel {

    /**
     * Creates new form masterSchedule
     */
    
    MainTravelAgency mainTravelAgency;
    JPanel displayPanel;
    
    
    
    public masterSchedule(MainTravelAgency mainTravelAgency, JPanel display) {
        initComponents();
        this.mainTravelAgency = mainTravelAgency;
        this.displayPanel = display;
        
        populate();
        
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        
        for(AircraftFlights flight: mainTravelAgency.getMasterFlightSchedule().getAllFlights()){  // new 
            for(FlightDates a : flight.getFlightDates()){
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]= flight;  // aircraft.getFlightDetails();
                row[1]= flight.getOriginCity();    // aircraft.getFlightDetails().getOriginCity();
                row[2]= flight.getFlightDates();  // aircraft.getFlightDetails().getDestinationCity();
                row[3]= a.getPrice(); // aircraft.getFlightDetails().getPrice();
                row[4]=a;
                String time = Float.toString(a.getFlightTime());
               String[] arrOfStr = time.split("\\.");
               if(arrOfStr[1].length() == 4)
               {
                row[5] = " "+arrOfStr[0]+ " : "+ arrOfStr[1].substring(0, 2)+ " ";                   
               
               }
               else
                row[5] = arrOfStr[0]+ " : "+ arrOfStr[1]+ " ";
                
               dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Origin", "Destination", "Price", "Date", "Departure Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 0, 102));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(backButton)
                .addContainerGap(695, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(84, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
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
        
        
        
        
        
        




        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDirectory;
    // End of variables declaration//GEN-END:variables
}
