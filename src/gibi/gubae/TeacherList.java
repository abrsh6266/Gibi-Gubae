/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;

import static cps.DbOperation.addingTeacher;
import static cps.DbOperation.deletingCourse;
import static cps.DbOperation.removingTeacher;
import static gibi.gubae.GibiGubae.icon;
import static gibi.gubae.GibiGubae.menu;
import static gibi.gubae.GibiGubae.registration;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;

/**
 *
 * @author Abrham
 */
public class TeacherList extends javax.swing.JFrame {

    /**
     * Creates new form TeacherList
     */
    public TeacherList() {
        setResizable(false);
        initComponents();
        setIconImage(icon);
    }
    public  void validating()
    {
        if((txtFirstName.getText()).equals("")|(txtLastName.getText()).equals("")|(txtPhoneNumber.getText()).equals(""))
        {
            btnRegister.setEnabled(false);
        }
        else
        {
            btnRegister.setEnabled(true);
        }}
    public void comboValuess(DefaultComboBoxModel com1)
    {
        txtCourses.setModel(com1);
    }
    public void listTable(DefaultTableModel d)
    {
        jTable1.setModel(d);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        txtCourses = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 127, 730, 308));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 61, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(255, 255, 51));
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 95, 208, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 135, -1, -1));

        txtLastName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(255, 255, 51));
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 174, 208, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 51));
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 248, 208, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Phone number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 214, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 288, -1, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 51));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 322, 208, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 557, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("Course name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 362, -1, -1));

        btnRegister.setBackground(new java.awt.Color(102, 0, 102));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 102, 0));
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 454, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Teachers List");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 204));
        jLabel8.setText("You can click on rows to remove the record from the list");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        btnMenu.setBackground(new java.awt.Color(102, 0, 102));
        btnMenu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 102, 0));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 453, -1, -1));

        txtCourses.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtCourses.setForeground(new java.awt.Color(51, 0, 51));
        txtCourses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoursesActionPerformed(evt);
            }
        });
        getContentPane().add(txtCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 210, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        validating();
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        validating();
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
       validating();
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validating();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoursesActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        setVisible(false);
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhoneNumber.setText("");
        txtEmail.setText("");
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       User user = new User();
        
        user.setFirstName(txtFirstName.getText());
        user.setLastName(txtLastName.getText());
        user.setEmail((String)txtEmail.getText());
        user.setPhoneNumber(txtPhoneNumber.getText());
        user.setCourses((String)txtCourses.getSelectedItem());
        addingTeacher(user);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        User user = new User();
        TableModel tabelModel = jTable1.getModel();
        user.setPhoneNumber(tabelModel.getValueAt(index,2).toString());
        int a = JOptionPane.showConfirmDialog(null,"Do you want to delete the raw with Teacher name  "+
        tabelModel.getValueAt(index,0).toString()+" "+tabelModel.getValueAt(index,1).toString()+"?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            
            removingTeacher(user);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox txtCourses;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
