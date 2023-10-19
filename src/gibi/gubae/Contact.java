package gibi.gubae;

import static cps.DbOperation.showing;
import static gibi.gubae.GibiGubae.contactInfo;
import static gibi.gubae.GibiGubae.icon;
import static gibi.gubae.GibiGubae.status;
import static gibi.gubae.GibiGubae.menu;
import model.User;

public class Contact extends javax.swing.JFrame 
  {
    public Contact() {
        setResizable(false);
        initComponents();
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSebsabi = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelB = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        txtMenu = new javax.swing.JButton();
        jLabelA = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSebsabi.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        btnSebsabi.setForeground(new java.awt.Color(255, 0, 204));
        btnSebsabi.setText("Sebsabi");
        btnSebsabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSebsabiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSebsabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 184, -1, -1));

        btnAccount.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        btnAccount.setForeground(new java.awt.Color(255, 0, 204));
        btnAccount.setText("Account");
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 241, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Contact Information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 11, -1, -1));

        jLabelB.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabelB.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(jLabelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 360, 54));

        jLabelC.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabelC.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(jLabelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 370, 51));

        txtMenu.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        txtMenu.setForeground(new java.awt.Color(255, 102, 102));
        txtMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        txtMenu.setText("Menu");
        txtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuActionPerformed(evt);
            }
        });
        getContentPane().add(txtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 420, -1, -1));

        jLabelA.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabelA.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(jLabelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 360, 43));

        btnUpdate.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 102, 102));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 420, -1, -1));

        txt1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt1.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        txt2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt2.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        txt3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt3.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void settingAllA(User user)
    {
        jLabelA.setText(user.getFirstName());
        jLabelB.setText(user.getPhoneNumber());
        jLabelC.setText(user.getEmail()); 
    }
    public void settingAllB(User user)
    {
        jLabelA.setText(user.getGibi());
        jLabelB.setText(user.getCBE());
        jLabelC.setText(user.getAbisinya());       
    }
    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
       txt1.setText("Gibi     :");
       txt2.setText("CBE      :");
       txt3.setText("Abisinya :");
       btnAccount.setEnabled(false);
       btnSebsabi.setEnabled(true);
       status = "B";
       showing();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnSebsabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSebsabiActionPerformed
       txt1.setText("Name     :");
       txt2.setText("Phone    :");
       txt3.setText("Email    :");
       btnAccount.setEnabled(true);
       btnSebsabi.setEnabled(false);
       status = "A";
       showing();
    }//GEN-LAST:event_btnSebsabiActionPerformed

    private void txtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuActionPerformed
        setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_txtMenuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        User user = new User();
        if(btnAccount.isEnabled())
        {
            status = "A";
            user.setText1(txt1.getText());
            user.setText2(txt2.getText());
            user.setText3(txt3.getText());
            contactInfo.settingA(user);
        }
        if(btnSebsabi.isEnabled())
        {
            status = "B";
            user.setText1(txt1.getText());
            user.setText2(txt2.getText());
            user.setText3(txt3.getText());
            contactInfo.settingA(user);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new Contact().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnSebsabi;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JButton txtMenu;
    // End of variables declaration//GEN-END:variables
}
