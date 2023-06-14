/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luke
 */
public class LoginHomePage extends javax.swing.JFrame {

    //RoundedPanel round = new RoundedPanel();
    /**
     * Creates new form HomeDashboard
     */
    public LoginHomePage() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setTitle("LOGIN");
        pack();
        
        
        Font font = Register.getFont();
        Map att = font.getAttributes();
        att.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        Register.setFont(font.deriveFont(att));
        
        addPlaceHolder(Username);
        addPlaceHolder(ID);
    }
    
    //method for txt placeholder style and remove placeholder
    public void  addPlaceHolder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }
    
    public void removePlaceHolder(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        LogoSTI = new javax.swing.JLabel();
        EnterUser = new test.RoundedPanel();
        UserIcon = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Weclome = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        EnterStudID = new test.RoundedPanel();
        IDIcon = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setBackground(new java.awt.Color(255, 242, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setName("LOGIN"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        BG.setBackground(new java.awt.Color(255, 242, 0));

        LogoSTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Sti.png"))); // NOI18N

        EnterUser.setBackground(new java.awt.Color(59, 103, 236));
        EnterUser.setForeground(new java.awt.Color(59, 103, 236));

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/User.png"))); // NOI18N

        Username.setBackground(new java.awt.Color(59, 103, 236));
        Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Username.setText("Username");
        Username.setBorder(null);
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout EnterUserLayout = new javax.swing.GroupLayout(EnterUser);
        EnterUser.setLayout(EnterUserLayout);
        EnterUserLayout.setHorizontalGroup(
            EnterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username)
                .addGap(17, 17, 17))
        );
        EnterUserLayout.setVerticalGroup(
            EnterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnterUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Username)
                    .addComponent(UserIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Weclome.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Weclome.setForeground(new java.awt.Color(40, 86, 225));
        Weclome.setText("Welcome");

        Register.setForeground(new java.awt.Color(40, 86, 225));
        Register.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Register.setText("Not registered?");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        Login.setBackground(new java.awt.Color(59, 103, 236));
        Login.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("LOGIN");
        Login.setToolTipText("");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        EnterStudID.setBackground(new java.awt.Color(59, 103, 236));
        EnterStudID.setForeground(new java.awt.Color(59, 103, 236));

        IDIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/name.png"))); // NOI18N

        ID.setBackground(new java.awt.Color(59, 103, 236));
        ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ID.setText("Student ID");
        ID.setBorder(null);
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IDFocusLost(evt);
            }
        });

        javax.swing.GroupLayout EnterStudIDLayout = new javax.swing.GroupLayout(EnterStudID);
        EnterStudID.setLayout(EnterStudIDLayout);
        EnterStudIDLayout.setHorizontalGroup(
            EnterStudIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterStudIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        EnterStudIDLayout.setVerticalGroup(
            EnterStudIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterStudIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnterStudIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID)
                    .addComponent(IDIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(LogoSTI, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addComponent(Weclome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnterStudID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoSTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(Weclome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(EnterStudID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 77, Short.MAX_VALUE))
        );

        getContentPane().add(BG);

        setSize(new java.awt.Dimension(668, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        //new Register();
        new RegisterPage();
        dispose();
    }//GEN-LAST:event_RegisterMouseClicked

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        // TODO add your handling code here:
        if (Username.getText() != null){
            Username.setText(null);
            Username.requestFocus();
            //remove placeholder style
            removePlaceHolder(Username);
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusGained
        // TODO add your handling code here:
        if (ID.getText().equals("Student ID")){
            ID.setText(null);
            ID.requestFocus();
            //remove placeholder style
            removePlaceHolder(ID);
        }
    }//GEN-LAST:event_IDFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        // TODO add your handling code here:
        if (Username.getText().length()==0){
            //add the place holder style
            addPlaceHolder(Username);
            Username.setText("Username");
        }
    }//GEN-LAST:event_UsernameFocusLost

    private void IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IDFocusLost
        // TODO add your handling code here:
        if (ID.getText().length()==0){
            //add the place holder style
            addPlaceHolder(ID);
            ID.setText("Student ID");
        }
    }//GEN-LAST:event_IDFocusLost

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String admin = "Ace Llaguno";
        String id = "02000316606";
        String name = Username.getText();
        String iD = ID.getText();
        if (name.matches(admin) && iD.matches(id)){
            new TeacherDashBoard(name, iD);
            this.dispose();
        }
        else if(name.trim().matches("")){
            JOptionPane.showMessageDialog(null,"Please fill out username!");
        }
        else if(ID.getText().matches("")){
            JOptionPane.showMessageDialog(null,"Please fill out ID!");
            
        }
//        else if(ID != null){
//            find.getValue(user, id = parseInt(ID.getText()));
//                
//        }
    }//GEN-LAST:event_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private test.RoundedPanel EnterStudID;
    private test.RoundedPanel EnterUser;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel IDIcon;
    private javax.swing.JButton Login;
    private javax.swing.JLabel LogoSTI;
    private javax.swing.JLabel Register;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Weclome;
    // End of variables declaration//GEN-END:variables
}
