/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;


import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author AEDSpring2019
 */
public class CreateDeliveryMan extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Restaurant res;
    
 //   private StringBuilder warnMsg;
    
    public CreateDeliveryMan(JPanel panelRight, EcoSystem admin, Restaurant res) {
        initComponents();
        this.res = res;
        this.userProcessContainer = panelRight;
        this.ecosystem = admin;
        txtRePword.setBorder(new LineBorder(Color.black));
        jLabel3.setForeground(Color.black); 
        txtPword.setBorder(new LineBorder(Color.black));
        jLabel2.setForeground(Color.black); 
        txtUser.setBorder(new LineBorder(Color.black));
        jLabel1.setForeground(Color.black);    
    //    warnMsg = new StringBuilder();
        warnLabel.setVisible(false);
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPword = new javax.swing.JPasswordField();
        txtRePword = new javax.swing.JPasswordField();
        warnLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        pwdLabel = new javax.swing.JLabel();
        rePwdLabel = new javax.swing.JLabel();
        radioLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cusName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("<html> <b> <font size=5> Username:");

        jLabel2.setText("<html> <b> <font size=5> Password:");

        jLabel3.setText("<html> <b> <font size=5>Re-enter Password :");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        userLabel.setForeground(new java.awt.Color(255, 0, 51));

        pwdLabel.setForeground(new java.awt.Color(255, 0, 51));

        rePwdLabel.setForeground(new java.awt.Color(255, 0, 51));

        radioLabel.setForeground(new java.awt.Color(255, 0, 51));

        jLabel4.setText("<html> <b> <font size=5>Name :");

        jLabel5.setText("<html> <b> <font size=7> <u> Create Deliveryman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(warnLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cusName))
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                    .addComponent(txtPword)
                                    .addComponent(txtRePword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userLabel)
                                    .addComponent(pwdLabel)
                                    .addComponent(radioLabel)
                                    .addComponent(rePwdLabel))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warnLabel))))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radioLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLabel)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rePwdLabel)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if(!usernamePatternCorrect()){
//            txtUser.setText("");
            txtUser.setBorder(new LineBorder(Color.red));
            jLabel1.setForeground(Color.red);
            userLabel.setVisible(true);
            userLabel.setText("<html> Username not in correct format. correct format: abc_de@fgh.com <br>");
        }
        else if(usernamePatternCorrect()) {
            txtUser.setBorder(new LineBorder(Color.black));
            jLabel1.setForeground(Color.black);
            userLabel.setVisible(false);

            warnLabel.setVisible(false);
            warnLabel.setForeground(Color.red);
            warnLabel.setText("");            
            
        }
        if(!pwdPatternCorrect()){
//            txtPword.setText("");
            txtPword.setBorder(new LineBorder(Color.red));
            jLabel2.setForeground(Color.red);        
            pwdLabel.setVisible(true);
            pwdLabel.setText("Password acceptable format: min. 6, one small, one capital letter, one special character and one number.");
        }
        else if(pwdPatternCorrect()) {
            txtPword.setBorder(new LineBorder(Color.black));
            jLabel2.setForeground(Color.black);        
            pwdLabel.setVisible(false);
            


        }
        if(!repwdCorrect()){

            txtRePword.setBorder(new LineBorder(Color.red));
            jLabel3.setForeground(Color.red);
            rePwdLabel.setVisible(true);
            rePwdLabel.setText("Retype password and password are different. <br>");        
        }
        else if (repwdCorrect())
                {
            txtRePword.setBorder(new LineBorder(Color.black));
            jLabel3.setForeground(Color.black);        
            rePwdLabel.setText("");        
        }




        
        if(usernamePatternCorrect() && pwdPatternCorrect() && repwdCorrect() && this.cusName.getText() != "")
        {   
                String cusName = this.cusName.getText();
                String userName = this.txtUser.getText();
                String pwd = txtPword.getText();
                Employee emp = ecosystem.getEmployeeDirectory().createEmployee(cusName, userName, pwd, "DeliverManRole", res);
                UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(userName, pwd, emp, new DeliverManRole());
                JOptionPane.showMessageDialog(null, "Deliveryman Added.");            
                txtReset();

            
        }
        else if(this.cusName.getText() == "") JOptionPane.showMessageDialog(null, "Name cannot be empty!");
        
    }//GEN-LAST:event_btnCreateActionPerformed


    private void txtReset(){
                cusName.setText("");
                 txtUser.setText("");
                 txtPword.setText("");
                 txtRePword.setText("");
    
    }






    // Is Type selected method


//    +[A-Z]{1,}[0-9]{1,}[$*#&]{1,}
    
    // Username pattern correct method
    
    private boolean usernamePatternCorrect(){
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtUser.getText());
        boolean b = m.matches();
        return b;
    
    }






    // Password pattern correct? method
    
    private boolean pwdPatternCorrect(){
        Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,})"); 
        Matcher m = p.matcher(txtPword.getText());
        boolean b = m.matches();
        return b;
    
    } 
    

    // Re-Password check correct? method
    
    private boolean repwdCorrect(){
        String repwd = txtRePword.getText();
        String pwd = txtPword.getText();
        return repwd.equals(pwd);
    
    }        
    
    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        Component[] comps = this.userProcessContainer.getComponents();
        for(Component comp: comps){
            if(comp instanceof ManageDeliveryManagersJPanel){
                ManageDeliveryManagersJPanel manageAdmin = (ManageDeliveryManagersJPanel) comp;
   //             manageAdmin.customerPopulate();
                 manageAdmin.populate();
            
            }
   
        
        }
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        
        

        
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cusName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JLabel radioLabel;
    private javax.swing.JLabel rePwdLabel;
    private javax.swing.JPasswordField txtPword;
    private javax.swing.JPasswordField txtRePword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables
}
