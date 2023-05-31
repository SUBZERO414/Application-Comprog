/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finals;

import static java.lang.Integer.parseInt;
import javax.swing.*;


/**
 *
 * @author Luke
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form FirstPage
     */
    public HomePage() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(true);
        setVisible(true);
        
        ImageIcon userIcon = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\Panel\\src\\picture\\User.png");
        ImageIcon courseIcon = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\Panel\\src\\picture\\bscs.png");
        ImageIcon studentIcon = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\Panel\\src\\picture\\name.png");
        ImageIcon sectionIcon = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\Panel\\src\\picture\\diploma.png");
        ImageIcon logoIcon = new ImageIcon("C:\\Users\\admin\\Documents\\NetBeansProjects\\Panel\\src\\picture\\Sti.png");
        
        jLabel_user.setIcon(userIcon);
        jLabel_course.setIcon(courseIcon);
        jLabel_studentID.setIcon(studentIcon);
        jLabel_section.setIcon(sectionIcon);
        jLabel_logo.setIcon(logoIcon);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_logo = new javax.swing.JLabel();
        jLabel_user = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Course = new javax.swing.JTextField();
        Section = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel_course = new javax.swing.JLabel();
        jLabel_section = new javax.swing.JLabel();
        jLabel_studentID = new javax.swing.JLabel();
        jLabel_studentID1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_studentID2 = new javax.swing.JLabel();
        Year = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(56, 56, 56));

        jPanel3.setBackground(new java.awt.Color(255, 215, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(2, 80, 146));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");

        jLabel_logo.setOpaque(true);
        jLabel_logo.setPreferredSize(new java.awt.Dimension(125, 125));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jLabel_user.setBackground(new java.awt.Color(255, 215, 0));
        jLabel_user.setOpaque(true);
        jLabel_user.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 172, 30, 34));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        jPanel3.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 172, 368, 34));

        Course.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        jPanel3.add(Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 334, 368, 34));

        Section.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        jPanel3.add(Section, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 386, 368, 34));

        ID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 224, 368, 34));

        jToggleButton1.setText("BACK");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 60, -1));

        jLabel_course.setBackground(new java.awt.Color(255, 215, 0));
        jLabel_course.setOpaque(true);
        jLabel_course.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 334, 30, 34));

        jLabel_section.setBackground(new java.awt.Color(255, 215, 0));
        jLabel_section.setOpaque(true);
        jLabel_section.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel_section, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 386, 30, 34));

        jLabel_studentID.setBackground(new java.awt.Color(255, 215, 0));
        jLabel_studentID.setOpaque(true);
        jLabel_studentID.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel_studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 224, 30, 34));

        jLabel_studentID1.setBackground(new java.awt.Color(255, 215, 0));
        jLabel_studentID1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel_studentID1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_studentID1.setText("Type of students:");
        jLabel_studentID1.setOpaque(true);
        jLabel_studentID1.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel_studentID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "REGULAR", "IRREGULAR" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 126, 34));

        jLabel_studentID2.setBackground(new java.awt.Color(255, 215, 0));
        jLabel_studentID2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel_studentID2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_studentID2.setText("Year Student:");
        jLabel_studentID2.setOpaque(true);
        jLabel_studentID2.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel3.add(jLabel_studentID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 90, 30));

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1st", "2nd", "3rd", "4th" }));
        Year.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0), new java.awt.Color(255, 102, 0)));
        Year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 126, 34));

        jButton1.setText("CONFIRM");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        new LoginPage();
        dispose();
    }                                              

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String name = Name.getText();
        int studID = parseInt(ID.getText());
        String course = Course.getText();
        String section = Section.getText();
        String year = Year.getSelectedItem().toString();
        

        new newWindow(name, studID, course, section, year).setVisible(true);
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField Course;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Section;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_course;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabel_section;
    private javax.swing.JLabel jLabel_studentID;
    private javax.swing.JLabel jLabel_studentID1;
    private javax.swing.JLabel jLabel_studentID2;
    private javax.swing.JLabel jLabel_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration                   
}
