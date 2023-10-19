/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;

import static cps.DbOperation.contactUpdating;
import static gibi.gubae.GibiGubae.contact;
import static gibi.gubae.GibiGubae.icon;
import model.User;

/**
 *
 * @author Abrham
 */
public class ContactInfo extends javax.swing.JFrame {

    /**
     * Creates new form ContactInfo
     */
    public ContactInfo() {
        setResizable(false);
        initComponents();
        setIconImage(icon);
    }

    
    public void settingA(User user)
    {
        txt1.setText(user.getText1());
        txt2.setText(user.getText2());
        txt3.setText(user.getText3());
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOk.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 51, 51));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 327, -1, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 51, 51));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 323, -1, -1));

        txt1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 99, -1, -1));

        txt2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 176, -1, -1));

        txt3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        field1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        field1.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 99, 337, -1));

        field2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        field2.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(field2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 176, 337, -1));

        field3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        field3.setForeground(new java.awt.Color(0, 51, 204));
        getContentPane().add(field3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 260, 337, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setText("Updating");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 11, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        User user = new User();
        user.setText1(field1.getText());
        user.setText2(field2.getText());
        user.setText3(field3.getText());
        contactUpdating(user);
        setVisible(false);
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false);
        contact.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ContactInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOk;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
