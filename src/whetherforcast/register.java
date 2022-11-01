
package whetherforcast;

/**
 *
 * @author saurabh
 */

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class register extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
    public register() {
        initComponents();
        lbldisplay.setVisible(false);
        labdigit.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        lbldisplay = new javax.swing.JLabel();
        labdigit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registration Module");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration Panel"));
        jPanel1.setLayout(null);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(200, 130, 210, 30);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 140, 80, 19);
        jPanel1.add(txtUserName);
        txtUserName.setBounds(200, 90, 210, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("User Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 100, 90, 19);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 340, 130, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Registration Panel");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 40, 185, 24);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register_icon.jpg"))); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(110, 340, 143, 39);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("Email");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 220, 80, 19);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 180, 80, 19);
        jPanel1.add(txtAddress);
        txtAddress.setBounds(200, 170, 210, 30);

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(200, 210, 210, 30);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setText("mobile");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 260, 80, 19);

        txtMobile.setMaximumSize(new java.awt.Dimension(10, 10));
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobileKeyPressed(evt);
            }
        });
        jPanel1.add(txtMobile);
        txtMobile.setBounds(200, 250, 210, 30);

        lbldisplay.setText("jLabel11");
        jPanel1.add(lbldisplay);
        lbldisplay.setBounds(420, 214, 110, 20);

        labdigit.setText("jLabel11");
        jPanel1.add(labdigit);
        labdigit.setBounds(420, 260, 120, 14);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("Health Prediction");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(txtUserName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"User Name Field Cann't Be Empty");
            txtUserName.setBackground(Color.red);
        }
        else if(txtPassword.getText().length() >=6)
        {
            JOptionPane.showMessageDialog(rootPane,"Password Field Cann't Be Empty");
             txtPassword.setBackground(Color.red);
        }
        else if(txtAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Address Field Cann't Be Empty");
             txtAddress.setBackground(Color.red);
        }
        else if(txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Email Field Cann't Be Empty");
             txtEmail.setBackground(Color.red);
        }
        else if(txtMobile.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane,"Mobile Field Cann't Be Empty");
             txtMobile.setBackground(Color.red);
        }
       
        else if(txtMobile.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(rootPane,"Mobile Number Should be Equals To Ten Digit");
        }
        else
        {
            
        
          try
        {
            DB.Connect.openConnection();
            DB.Connect.rs=DB.Connect.stat.executeQuery("select * from users where uname='"+txtUserName.getText()+"'");
            if(DB.Connect.rs.next())
            {
                JOptionPane.showMessageDialog(rootPane,"User name is already Registered ... Try Again");
                txtUserName.setText("");
            }
            else
            {
                DB.Connect.stat.execute("insert into users(uname,passw,addr,email,mobile) values('"+txtUserName.getText()+"','"
                    +txtPassword.getText()+"','"+txtAddress.getText()+"','"+txtEmail.getText()+"','"+txtMobile.getText()+"')");
            
            
            JOptionPane.showMessageDialog(rootPane,"You are Registered Successfully");
            }
            rs.close();
            
            
        
        }
        catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
         String email = txtEmail.getText();
                String exp = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
                CharSequence seq = email;
                Pattern pattern = Pattern.compile(exp, Pattern.CASE_INSENSITIVE);
                Matcher m = pattern.matcher(seq);
                if (m.matches()) {
                    lbldisplay.setVisible(false);
                } else {
                    lbldisplay.setText("* Invalid Email ID");
                    lbldisplay.setVisible(true);
                    lbldisplay.setForeground(Color.red);
                }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtMobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyPressed
        // TODO add your handling code here:
                String input = txtMobile.getText();
                Pattern p = Pattern.compile("[A-Z,a-z,&%$@!()*^]");
                Matcher m = p.matcher(input);
                if (m.find()) {
                    labdigit.setText("*Only Numeric Value");
                    labdigit.setVisible(true);
                    labdigit.setForeground(Color.red);
                } else {
                    labdigit.setVisible(false);
                }
    }//GEN-LAST:event_txtMobileKeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
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
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labdigit;
    private javax.swing.JLabel lbldisplay;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

}
