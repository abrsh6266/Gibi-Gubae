/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;

import static cps.DbOperation.studentListA;
import static cps.DbOperation.comboboxValues;
import static cps.DbOperation.courseListA;
import static cps.DbOperation.formingServiceTable;
import static cps.DbOperation.teacherListA;
import static gibi.gubae.GibiGubae.chk;
import static gibi.gubae.GibiGubae.comboChk;
import static gibi.gubae.GibiGubae.contact;
import static gibi.gubae.GibiGubae.gradeMenu;
import static gibi.gubae.GibiGubae.home;
import static gibi.gubae.GibiGubae.icon;
import static gibi.gubae.GibiGubae.menu;
import static gibi.gubae.GibiGubae.quickSearch;
import static gibi.gubae.GibiGubae.registration;
import static gibi.gubae.GibiGubae.studentList;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Abrham
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form GibiOne
     */
    public Menu() {
        setResizable(false);
        initComponents();
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttnRegistration = new javax.swing.JButton();
        btnStudentList = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();
        btnRoster = new javax.swing.JButton();
        btnQuickSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBackToHome = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCourse = new javax.swing.JButton();
        btnTeacherList = new javax.swing.JButton();
        btnRoster2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bttnRegistration.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bttnRegistration.setForeground(new java.awt.Color(0, 255, 0));
        bttnRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        bttnRegistration.setText("Registration");
        bttnRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRegistrationActionPerformed(evt);
            }
        });
        getContentPane().add(bttnRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 200, -1));

        btnStudentList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnStudentList.setForeground(new java.awt.Color(0, 255, 0));
        btnStudentList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnStudentList.setText("Student List");
        btnStudentList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentListActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, -1));

        btnServices.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnServices.setForeground(new java.awt.Color(0, 255, 0));
        btnServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        btnServices.setText("Services");
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });
        getContentPane().add(btnServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 200, -1));

        btnRoster.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRoster.setForeground(new java.awt.Color(0, 255, 0));
        btnRoster.setText("Contact info");
        btnRoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRosterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 200, -1));

        btnQuickSearch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnQuickSearch.setForeground(new java.awt.Color(0, 255, 0));
        btnQuickSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnQuickSearch.setText("Quick search");
        btnQuickSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuickSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuickSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 38, -1, -1));

        btnBackToHome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBackToHome.setForeground(new java.awt.Color(0, 255, 0));
        btnBackToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnBackToHome.setText("Home");
        btnBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnBackToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 200, -1));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 255, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 200, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 204));
        jLabel3.setText("Gibi Gubae Management ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 204));
        jLabel4.setText("System");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        btnCourse.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCourse.setForeground(new java.awt.Color(0, 255, 0));
        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnCourse.setText("Courses");
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        getContentPane().add(btnCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 200, 40));

        btnTeacherList.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnTeacherList.setForeground(new java.awt.Color(0, 255, 0));
        btnTeacherList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnTeacherList.setText("Teacher List");
        btnTeacherList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherListActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeacherList, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, -1));

        btnRoster2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRoster2.setForeground(new java.awt.Color(0, 255, 0));
        btnRoster2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        btnRoster2.setText("Roster");
        btnRoster2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoster2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRoster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 200, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back4.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       int a = JOptionPane.showConfirmDialog(null,"Do you want to close this program?", "Select", JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHomeActionPerformed

        menu.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_btnBackToHomeActionPerformed

    private void bttnRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRegistrationActionPerformed
        chk = 1;
        comboChk = 1;
        comboboxValues();
        menu.setVisible(false);
    }//GEN-LAST:event_bttnRegistrationActionPerformed

    private void btnStudentListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentListActionPerformed
        menu.setVisible(false);
        studentListA();
    }//GEN-LAST:event_btnStudentListActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        setVisible(false);
        chk=1;
        formingServiceTable();
    }//GEN-LAST:event_btnServicesActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
       menu.setVisible(false);
       courseListA();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnTeacherListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherListActionPerformed
        comboChk = 2;
        setVisible(false);
        teacherListA();
    }//GEN-LAST:event_btnTeacherListActionPerformed

    private void btnRoster2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoster2ActionPerformed
         gradeMenu.setVisible(true);
         comboChk = 2;
         comboboxValues();
    }//GEN-LAST:event_btnRoster2ActionPerformed

    private void btnQuickSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuickSearchActionPerformed
        setVisible(false);
        quickSearch.setVisible(true);
    }//GEN-LAST:event_btnQuickSearchActionPerformed

    private void btnRosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRosterActionPerformed
       setVisible(false);
       contact.setVisible(true);
    }//GEN-LAST:event_btnRosterActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToHome;
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnQuickSearch;
    private javax.swing.JButton btnRoster;
    private javax.swing.JButton btnRoster2;
    private javax.swing.JButton btnServices;
    private javax.swing.JButton btnStudentList;
    private javax.swing.JButton btnTeacherList;
    private javax.swing.JButton bttnRegistration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
