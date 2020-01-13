/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heightech;

import Databases.DatabaseConnection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author User
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUser() {
        super("Iris Vision Dynamics~ Add A New User");
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(500, 600);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIcon();
        
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
        jLabelFirst = new javax.swing.JLabel();
        jLabelLast = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jButtonAddUser = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelUid = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldFirst = new javax.swing.JTextField();
        jTextFieldLast = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBoxShowPass = new javax.swing.JCheckBox();
        jButtonEditUser = new javax.swing.JButton();
        jButtonDeleteUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelFirst.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFirst.setText("First Name:");

        jLabelLast.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLast.setText("Last Name:");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setText("Email:");

        jLabelPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPhone.setText("Phone Number:");

        jLabelId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelId.setText("ID Number:");

        jButtonAddUser.setBackground(new java.awt.Color(0, 153, 255));
        jButtonAddUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddUser.setText("OK");
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(142, 5, 16));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelUid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUid.setText("UserName:");

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPassword.setText("Password:");

        jTextFieldFirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldFirstKeyPressed(evt);
            }
        });

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(46, 204, 113));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add a new user");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 248, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 248, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jCheckBoxShowPass.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jCheckBoxShowPass.setText("Show Pass");
        jCheckBoxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPassActionPerformed(evt);
            }
        });

        jButtonEditUser.setBackground(new java.awt.Color(0, 153, 255));
        jButtonEditUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditUser.setText("Edit");
        jButtonEditUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditUserMouseClicked(evt);
            }
        });
        jButtonEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditUserActionPerformed(evt);
            }
        });

        jButtonDeleteUser.setBackground(new java.awt.Color(0, 153, 255));
        jButtonDeleteUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDeleteUser.setText("Delete");
        jButtonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelLast, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldLast, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelUid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jCheckBoxShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBoxShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jCheckBoxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassActionPerformed
           if(jCheckBoxShowPass.isSelected())
           {
               jPasswordField1.setEchoChar((char)0);
           }
           else
           {
               jPasswordField1.setEchoChar('*');
           }
    }//GEN-LAST:event_jCheckBoxShowPassActionPerformed

    
    /// Check if the username exist 
    public boolean isUsernameExist(String user)
    {
        
        boolean uExist = false;
        Connection conn = DatabaseConnection.getConnection();
        
        PreparedStatement Ps;
        
        ResultSet Rs;
       
            try {
                Ps = conn.prepareStatement("SELECT * FROM users WHERE user_uid = ?");
                
                Ps.setString(1, jTextFieldUsername.getText());
               
                Rs = Ps.executeQuery();
                
                if(Rs.next())
                {
                    uExist = true;
                }
               
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            finally
            {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        
        return uExist;
    }
    public boolean verifyData()
    {
        // check for empty fields
        if(jTextFieldFirst.getText().equals("")  && jTextFieldLast.getText().equals("") 
                || jTextFieldEmail.getText().equals("") || jTextFieldID.getText().equals("") 
                || jTextFieldPhone.getText().equals("") || jTextFieldUsername.getText().equals("") 
                || String.valueOf(jPasswordField1.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "One or More Fields Are Empty");
            return false;
        }
        
        else
        {
            return true;
        }
        
    }
    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
            addUser();
        jTextFieldFirst.setText("");
        jTextFieldLast.setText("");
        jTextFieldLast.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhone.setText("");
        jTextFieldID.setText("");
        jTextFieldUsername.setText("");
        jPasswordField1.setText("");
        
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jButtonEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditUserActionPerformed

    private void jButtonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUserActionPerformed
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps;
        //ResultSet rs;
        
        try {
            
            int x = JOptionPane.showConfirmDialog(null, "Sure To Delete This User?");
            if(x==0)
            {
             ps = conn.prepareStatement("DELETE FROM users WHERE user_uid =?");
           
               
                ps.setString(1, jTextFieldUsername.getText());
                
                
                if(ps.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "User Account Deleted");
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jTextFieldFirst.setText("");
        jTextFieldLast.setText("");
        jTextFieldLast.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhone.setText("");
        jTextFieldID.setText("");
        jTextFieldUsername.setText("");
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButtonDeleteUserActionPerformed

    private void jButtonEditUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditUserMouseClicked
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps;
        //ResultSet rs;
        
        try {
            ps = conn.prepareStatement("UPDATE users SET user_first=?,user_last=?,user_email=?,user_ID_No=?,user_Phone=? WHERE user_uid = ?");
           
                ps.setString(1, jTextFieldFirst.getText());
                ps.setString(2, jTextFieldLast.getText());
                ps.setString(3, jTextFieldEmail.getText());
                ps.setString(4, jTextFieldID.getText());
                ps.setString(5, jTextFieldPhone.getText());
                ps.setString(6, jTextFieldUsername.getText());
                
                
                if(ps.executeUpdate() != 0)
                {
                    JOptionPane.showMessageDialog(null, "User Account Updated");
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                }
        } catch (SQLException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        jTextFieldFirst.setText("");
        jTextFieldLast.setText("");
        jTextFieldLast.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhone.setText("");
        jTextFieldUsername.setText("");
        jPasswordField1.setText("");
        jTextFieldID.setText("");
    }//GEN-LAST:event_jButtonEditUserMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldUsername.setEditable(true);
         jTextFieldFirst.setText("");
        jTextFieldLast.setText("");
        jTextFieldLast.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhone.setText("");
        jTextFieldUsername.setText("");
        jPasswordField1.setText("");
        jTextFieldID.setText("");
        jPasswordField1.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldFirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFirstKeyPressed
        int vk=evt.getKeyCode();
       
       if(vk==KeyEvent.VK_ENTER)
       {
           addUser();
       }
       
    }//GEN-LAST:event_jTextFieldFirstKeyPressed

    public JPasswordField getjPasswordField1() {
        return jPasswordField1;
    }

    public void setjPasswordField1(JPasswordField jPasswordField1) {
        this.jPasswordField1 = jPasswordField1;
    }

    
    
     private void addUser()
     {
         Connection conn = DatabaseConnection.getConnection();
            
            PreparedStatement ps;
            
            if(verifyData())
            {
                try {
                    ps = conn.prepareStatement("INSERT INTO users(user_first, user_last, user_email, user_ID_No, user_Phone, user_uid, user_Pass) VALUES (?,?,?,?,?,?,?)");
                    ps.setString(1, jTextFieldFirst.getText());
                    ps.setString(2, jTextFieldLast.getText());
                    ps.setString(3, jTextFieldEmail.getText());
                    ps.setString(4, jTextFieldID.getText());
                    ps.setString(5, jTextFieldPhone.getText());
                    ps.setString(6, jTextFieldUsername.getText());
                    ps.setString(7, String.valueOf(jPasswordField1.getPassword()));

                    if(isUsernameExist(jTextFieldUsername.getText()))
                    {
                        JOptionPane.showMessageDialog(null, "User Exist");
                    }
                    else if(ps.executeUpdate() != 0)
                    {
                        JOptionPane.showMessageDialog(null, "Account Created");
                    }

                    else
                    {
                        JOptionPane.showMessageDialog(null, "Something went wrong");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                finally
                {
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonEditUser;
    private javax.swing.JCheckBox jCheckBoxShowPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirst;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelLast;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelUid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirst;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLast;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
    }

    public JTextField getjTextFieldFirst() {
        return jTextFieldFirst;
    }

    public void setjTextFieldFirst(JTextField jTextFieldFirst) {
        this.jTextFieldFirst = jTextFieldFirst;
    }

    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    public void setjTextFieldID(JTextField jTextFieldID) {
        this.jTextFieldID = jTextFieldID;
    }

    public JTextField getjTextFieldLast() {
        return jTextFieldLast;
    }

    public void setjTextFieldLast(JTextField jTextFieldLast) {
        this.jTextFieldLast = jTextFieldLast;
    }

    public JTextField getjTextFieldPhone() {
        return jTextFieldPhone;
    }

    public void setjTextFieldPhone(JTextField jTextFieldPhone) {
        this.jTextFieldPhone = jTextFieldPhone;
    }

    public JTextField getjTextFieldUsername() {
        return jTextFieldUsername;
    }

    public void setjTextFieldUsername(JTextField jTextFieldUsername) {
        this.jTextFieldUsername = jTextFieldUsername;
    }
    
    
        //setting upp the logo
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("MainLogo.png")));
    }

}
