/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.OOP.UserManagement;

import Frames.MainFrame;
import com.mycompany.OOP.UserManagement.LogIn;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yennie
 */
public class LogInFrame extends javax.swing.JFrame {

    public LogInFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usernametf = new javax.swing.JTextField();
        pwtf = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernametf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernametf.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        usernametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametfActionPerformed(evt);
            }
        });
        jPanel1.add(usernametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 310, 30));

        pwtf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pwtf.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.add(pwtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 310, 30));

        loginbtn.setBackground(new java.awt.Color(0, 0, 0));
        loginbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Log In");
        loginbtn.setBorder(null);
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 360, 30));

        exitbtn.setBackground(new java.awt.Color(153, 153, 255));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("?");
        exitbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit(evt);
            }
        });
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 640, 20, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Login as Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 720, 250, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Desktop\\New folder\\motorph-oop-master\\src\\main\\java\\com\\mycompany\\OOP\\UserManagement\\LOGIN INTERFACE (1).png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        LogIn login = new LogIn();
        login.setusername(usernametf.getText());
        login.setpassword(pwtf.getPassword());
        
        try {
            if(login.isAuthenticated()){
                //*JOptionPane.showMessageDialog(this, "Login Successful!");
                dispose();//
                //setVisible(false);
                MainFrame mainframe = new MainFrame();
                mainframe.setVisible(true);           
            }
            else{
                JOptionPane.showMessageDialog(this, "Username or Password is incorrect. Try Again.", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(LogInFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginbtnMouseClicked

    private void Exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit
        JOptionPane.showMessageDialog(null, "Contact through email");
    }//GEN-LAST:event_Exit

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbtnActionPerformed

    private void usernametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Assuming EmployeeLogInFrame is another JFrame that needs to be shown.
    EmployeeLogInFrame employeeLoginFrame = new EmployeeLogInFrame();
    employeeLoginFrame.setVisible(true);
    
    // Optionally, if you want to hide or dispose the current LoginFrame, you can call:
     this.dispose(); // to close the current frame
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pwtf;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
