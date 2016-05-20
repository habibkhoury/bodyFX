/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodyfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public final class main extends javax.swing.JFrame {

    public Connection con;
   
    public main() {
        
        initComponents();
        setLocationRelativeTo(this);
        setTitle("main");
        
          getConnection();
    }

    public void getConnection() {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/bodyFX";
        String USERNAME = "root";
        String PASSWORD = "root";
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
        


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxRegistration = new javax.swing.JComboBox();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldDob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxRegistration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 month / 50$", "3 month / 120$", "6 month / 200$" }));
        jComboBoxRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, -1));

        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, 30));
        getContentPane().add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 30));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 30));

        jTextFieldId.setText("1");
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("REGISTRATION");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ADDRESS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("PHONE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        getContentPane().add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, 30));

        jTextFieldDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDobActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("LAST NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("New Registration:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 30));

        jRadioButton1.setText("With Personal Trainer / +20$");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Payement Process:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, 40));

        jLabel10.setText("Registration Amount:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 120, 20));

        jLabel11.setText("With Personal Trainer:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 120, 20));

        jLabel12.setText("Insurrance:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setText("Total Amount:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 90, 20));

        jLabel15.setText("In USD--->");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 60, 20));

        jLabel16.setText("In LBP--->");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 60, 20));

        jLabel17.setText(" ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 130, 20));

        jLabel18.setText(" ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, 20));

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 73, -1));

        jButton3.setText("Done");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 100, 30));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 30, 20));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 30, 30));

        jLabel22.setText("10");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 40, 20));

        jLabel24.setText("USD");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 30, 20));

        jLabel25.setText("USD");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 30, 20));

        jLabel26.setText("USD");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 30, 20));

        jButton1.setText("Members");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed

    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDobActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jTextFieldName.setText(null);
         jTextFieldLastName.setText(null);
         jTextFieldAddress.setText(null);
         jTextFieldPhone.setText(null);
         jTextFieldDob.setText(null);
         jLabel19.setText(null);
         jLabel21.setText(null);
         jLabel17.setText(null);
         jLabel18.setText(null);
         id+=1;
         jTextFieldId.setText(String.valueOf(id));
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRegistrationActionPerformed
static int id=1;

  

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if (jComboBoxRegistration.getSelectedItem().equals("1 month / 50$")){
    jLabel19.setText("50");
    }//GEN-LAST:event_jButton3ActionPerformed
else if  (jComboBoxRegistration.getSelectedItem().equals("3 month / 120$")){
    jLabel19.setText("120");
            }
else if (jComboBoxRegistration.getSelectedItem().equals("6 month / 200$")){
    jLabel19.setText("200");
            }

if (jRadioButton1.isSelected()){
    jLabel21.setText("20");
    
}

int amount = Integer.parseInt((String) jLabel19.getText());
int trainer = Integer.parseInt((String) jLabel21.getText());
int insurance = Integer.parseInt((String) jLabel22.getText());

jLabel17.setText(String.valueOf(amount+trainer+insurance));
jLabel18.setText(String.valueOf((amount+trainer+insurance)*1500));

 try {
                if(jTextFieldId.getText().equals("") || jTextFieldName.getText().equals("") 
                        || jTextFieldLastName.getText().equals("")   || jTextFieldAddress.getText().equals("")
                         || jTextFieldPhone.getText().equals("") || jTextFieldDob.getText().equals("")) {
                    main.infoBox("PLEASE FILL ALL FIELDS", "ATTENTION !");}
                    else{
                Statement stmt = con.createStatement();
                stmt.execute("insert into members (member_id,member_name,member_lastname,member_address,member_phone,member_dob,member_registration) values('"+jTextFieldId.getText()+"','"+jTextFieldName.getText()+"','"+jTextFieldLastName.getText()+"','"+jTextFieldAddress.getText()+"','"+jTextFieldPhone.getText()+"','"+jTextFieldDob.getText()+"','"+jComboBoxRegistration.getSelectedItem()+"')"); 
                
       
         
        
        
                }
            }catch(SQLException ex){
                System.err.println(ex.getMessage());
            }  
    
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       registration registration = new registration();
       registration.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBoxRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldDob;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
