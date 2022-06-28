/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Event.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author Mohish Khadse
 */
public class forgotForm extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    private String sql;
    public forgotForm() {
        
        initComponents();
         con=MyConnection.getconnection();
        mainPanel.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        txtQue = new javax.swing.JTextField();
        lblname1 = new javax.swing.JLabel();
        lblname2 = new javax.swing.JLabel();
        lblname3 = new javax.swing.JLabel();
        lblname4 = new javax.swing.JLabel();
        txtAns = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtUname = new javax.swing.JTextField();
        txtUID = new javax.swing.JTextField();
        btnRecover = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(0, 255, 0));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recovery !");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        mainPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 417, -1));

        lblname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(102, 102, 102));
        lblname.setText("Name :");
        mainPanel.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 196, 78, 25));

        txtQue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQue.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtQue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueActionPerformed(evt);
            }
        });
        mainPanel.add(txtQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 309, 293, 40));

        lblname1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname1.setForeground(new java.awt.Color(102, 102, 102));
        lblname1.setText("Sequrity Question :");
        mainPanel.add(lblname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 273, -1, 25));

        lblname2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname2.setForeground(new java.awt.Color(102, 102, 102));
        lblname2.setText("User ID :");
        mainPanel.add(lblname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 119, 360, 25));

        lblname3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname3.setForeground(new java.awt.Color(102, 102, 102));
        lblname3.setText("Answer :");
        mainPanel.add(lblname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 355, 360, 25));

        lblname4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblname4.setForeground(new java.awt.Color(102, 102, 102));
        lblname4.setText("Password :");
        mainPanel.add(lblname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 432, 73, 25));

        txtAns.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAns.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnsActionPerformed(evt);
            }
        });
        mainPanel.add(txtAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 386, 301, 40));

        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        mainPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 463, 301, 40));

        txtUname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUname.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        mainPanel.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 227, 301, 40));

        txtUID.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        txtUID.setForeground(new java.awt.Color(153, 153, 153));
        txtUID.setText("Enter User ID to Search ");
        txtUID.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(153, 153, 153)));
        txtUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUIDFocusLost(evt);
            }
        });
        txtUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUIDActionPerformed(evt);
            }
        });
        txtUID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUIDKeyPressed(evt);
            }
        });
        mainPanel.add(txtUID, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 150, 301, 40));

        btnRecover.setBackground(new java.awt.Color(0, 255, 0));
        btnRecover.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRecover.setForeground(new java.awt.Color(255, 255, 255));
        btnRecover.setText("Recover");
        btnRecover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoverActionPerformed(evt);
            }
        });
        mainPanel.add(btnRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 536, 251, 46));

        btnBack.setBackground(new java.awt.Color(255, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Go Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        mainPanel.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 183, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueActionPerformed

    private void txtAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnsActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void txtUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUIDActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         loginform l=new loginform();
                          l.setVisible(true);
                          this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUIDFocusGained
        // TODO add your handling code here:
        if(txtUID.getText().trim().equalsIgnoreCase("Enter User ID to Search"))
        {
             txtUID.setText("");
             txtUID.setForeground(Color.BLACK);
        }
       
    }//GEN-LAST:event_txtUIDFocusGained

    private void txtUIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUIDFocusLost
        // TODO add your handling code here:
        if(txtUID.getText().trim().equals(""))
        {
            txtUID.setText("Enter User ID to Search");
            txtUname.setText("");
            txtQue.setText("");
            txtAns.setText("");
            txtPass.setText("");
            
        }
        txtUID.setForeground(Color.GRAY);
    }//GEN-LAST:event_txtUIDFocusLost

    private void btnRecoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoverActionPerformed
        // TODO add your handling code here:
        String ans = txtAns.getText();
        String unam = txtUname.getText();
        if(ans.equals("")){
            JOptionPane.showMessageDialog(null,"Please fill the answer to retrive Password");
        }else{
            try {
                String sql="SELECT * FROM `user` WHERE `Answer`='"+ans+"'";
                String sql2="SELECT * FROM `user` WHERE `uname`='"+unam+"'";
                ps=con.prepareStatement(sql);
                ps=con.prepareStatement(sql2);
                rs=ps.executeQuery();
                if(rs.next()){
                    String anwser=rs.getString(2);
                    txtPass.setText("your Password is "+anwser);
                }else{
                    JOptionPane.showMessageDialog(null,"Answer is not matched to database ");
                }
                
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_btnRecoverActionPerformed

    private void txtUIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUIDKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try {
                String sql1="SELECT * FROM `user` WHERE `uname`=?";
                ps=con.prepareStatement(sql1);
                ps.setString(1,txtUname.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                    txtUname.setText(rs.getString("fname"));
                     txtQue.setText(rs.getString("Question"));
                }
                else{
                    JOptionPane.showMessageDialog(null,"UserName not Found ");
                }
            } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null," USERNAME notfound");
            }
        }
    }//GEN-LAST:event_txtUIDKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRecover;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblname1;
    private javax.swing.JLabel lblname2;
    private javax.swing.JLabel lblname3;
    private javax.swing.JLabel lblname4;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtAns;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtQue;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
