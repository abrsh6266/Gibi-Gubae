/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;
import static cps.DbOperation.changing;
import static gibi.gubae.GibiGubae.icon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Abrham
 */
public class PasswordChanging extends javax.swing.JFrame {
    public PasswordChanging() {
        setResizable(false);
        initComponents();
        setIconImage(icon);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        oldtxtName = new javax.swing.JTextField();
        newtxtName = new javax.swing.JTextField();
        oldtxtPassword = new javax.swing.JPasswordField();
        newtxtPassword = new javax.swing.JPasswordField();
        btnCalncel = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 102));
        jLabel1.setText("Old name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 102));
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 102));
        jLabel3.setText("New name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 102));
        jLabel4.setText("New Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        oldtxtName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        oldtxtName.setForeground(new java.awt.Color(51, 255, 51));
        oldtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldtxtNameActionPerformed(evt);
            }
        });
        getContentPane().add(oldtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 172, -1));

        newtxtName.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        newtxtName.setForeground(new java.awt.Color(51, 255, 51));
        newtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtxtNameActionPerformed(evt);
            }
        });
        getContentPane().add(newtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 172, -1));

        oldtxtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(oldtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 172, -1));

        newtxtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newtxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newtxtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(newtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 172, -1));

        btnCalncel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnCalncel.setForeground(new java.awt.Color(255, 51, 51));
        btnCalncel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnCalncel.setText("Cancel");
        btnCalncel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalncelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalncel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, 40));

        btnChangePassword.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(255, 51, 51));
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangePassword.setText("Change");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ab Back.png"))); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oldtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldtxtNameActionPerformed

    private void newtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtxtNameActionPerformed

    private void newtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newtxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newtxtPasswordActionPerformed

    private void btnCalncelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalncelActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to close this program?", "Select", JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           dispose();
       }
    }//GEN-LAST:event_btnCalncelActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        User user = new User();
        user.setName(oldtxtName.getText());
        user.setPassword(oldtxtPassword.getText());
        changing(user,newtxtName.getText(),newtxtPassword.getText());
    }//GEN-LAST:event_btnChangePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordChanging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordChanging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordChanging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordChanging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordChanging().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalncel;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField newtxtName;
    private javax.swing.JPasswordField newtxtPassword;
    private javax.swing.JTextField oldtxtName;
    private javax.swing.JPasswordField oldtxtPassword;
    // End of variables declaration//GEN-END:variables
}
