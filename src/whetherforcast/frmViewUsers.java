package whetherforcast;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmViewUsers extends javax.swing.JFrame {
Statement st=null;
ResultSet rs=null;
String[][] rows;
int i=0;
String[] columns=new String[]{"S.No.","Username","Address","Email","Mobile No","User ID"};

    DefaultTableModel tableData;
    
   public frmViewUsers() {
        initComponents();
                
        try
        {
            DB.Connect.openConnection();
            tableData=new DefaultTableModel(rows,columns);
            jTable1.getModel();
            DB.Connect.rs=DB.Connect.stat.executeQuery("select * from users where uname not in('admin')");
            while(DB.Connect.rs.next())
            {
                i++;
                Object[] x={i,DB.Connect.rs.getString("uname"),DB.Connect.rs.getString("addr"),DB.Connect.rs.getString("email"),DB.Connect.rs.getString("mobile"),DB.Connect.rs.getString("id")};
                tableData.addRow(x);
                
            }
            jTable1.setModel(tableData);
            DB.Connect.closeConnection();
        }
        catch(Exception ex){}

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Users List Module");

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel1.setText("Whether Forcasting User List");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 30, 290, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-delete.gif"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 310, 120, 32);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 70, 520, 210);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(310, 310, 130, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(jTable1.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(rootPane, "Select Any Table Row");
        }
        else
        {
            String str=jTable1.getModel().getValueAt(jTable1.getSelectedRow(),4).toString();
        try
        {
           DB.Connect.openConnection();
            DB.Connect.stat.executeUpdate("delete from users where id='"+str+"'");
            JOptionPane.showMessageDialog(rootPane, "Successfully Deletion of Users");
           tableData.removeRow(jTable1.getSelectedRow());
           
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane,ex.getMessage());
        }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
