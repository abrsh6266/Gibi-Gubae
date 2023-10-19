/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;

import static cps.DbOperation.comboboxValues;
import static cps.DbOperation.registering;
import static gibi.gubae.GibiGubae.chk;
import static gibi.gubae.GibiGubae.comboChk;
import static gibi.gubae.GibiGubae.icon;
import static gibi.gubae.GibiGubae.menu;
import static gibi.gubae.GibiGubae.registration;
import static gibi.gubae.GibiGubae.studentList;
import javax.swing.DefaultComboBoxModel;
import model.User;

/**
 *
 * @author Abrham
 */
public class Registration extends javax.swing.JFrame {

   
    public Registration() {
        setResizable(false);
        initComponents();  
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        btnLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSpritualName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtServiceType = new javax.swing.JComboBox();
        txtDepartment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSex = new javax.swing.JComboBox();
        txtCourses = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBatch = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFirstName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnFirstName.setForeground(new java.awt.Color(255, 255, 0));
        btnFirstName.setText("First Name");
        getContentPane().add(btnFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 147, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 212, -1));

        btnLastName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLastName.setForeground(new java.awt.Color(255, 255, 0));
        btnLastName.setText("Last Name");
        getContentPane().add(btnLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtLastName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 210, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Spritual Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        txtSpritualName.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtSpritualName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpritualNameActionPerformed(evt);
            }
        });
        txtSpritualName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSpritualNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtSpritualName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 216, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Sex");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 150, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 220, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Phone number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 161, -1));

        txtServiceType.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtServiceType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T.E.H.A.K", "H.E.N.K", "L.E.G.A.K", "Q.E.L.F.A.M.K", "M.E.S.T.K", "E.K.R.E.M.M.K", "M.B.A.M.K", "A.E.M.E.A.M.K", "B.M.G.M.K.T.E.H", "O.A.K" }));
        txtServiceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceTypeActionPerformed(evt);
            }
        });
        getContentPane().add(txtServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 300, -1));

        txtDepartment.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtDepartment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDepartmentKeyReleased(evt);
            }
        });
        getContentPane().add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 300, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Department");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 147, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Courses");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Service Types");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        txtSex.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        txtSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSexActionPerformed(evt);
            }
        });
        getContentPane().add(txtSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 216, -1));

        txtCourses.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtCourses.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Timhrte Haimanot", "Kirstiyanawi Sinemigbar", "Ye mestihaf kidus Tinat", "Negere Kidusan" }));
        txtCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoursesActionPerformed(evt);
            }
        });
        getContentPane().add(txtCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 310, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        btnRegister.setBackground(new java.awt.Color(255, 153, 51));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 134, 36));

        btnMenu.setBackground(new java.awt.Color(255, 153, 51));
        btnMenu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 134, 36));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Batch");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 161, -1));

        txtID.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 297, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("ID");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 161, -1));

        txtBatch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtBatch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2010", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        txtBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchActionPerformed(evt);
            }
        });
        getContentPane().add(txtBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Back6.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 1140, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtServiceTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceTypeActionPerformed

    private void txtSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexActionPerformed

    private void txtCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoursesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoursesActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtSpritualNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpritualNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpritualNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        User user = new User();
        user.setFirstName(txtFirstName.getText());
        user.setLastName(txtLastName.getText());
        user.setSpritualName(txtSpritualName.getText());
        user.setSex((String)txtSex.getSelectedItem());
        user.setPhoneNumber(txtPhoneNumber.getText());
        user.setDepartment(txtDepartment.getText());
        user.setCourses((String)txtCourses.getSelectedItem());
        user.setServiceType((String)txtServiceType.getSelectedItem());
        user.setBatch((String)txtBatch.getSelectedItem());
        user.setId(txtID.getText());
        if(chk==1)
        {
            registering(user,1);
        }
        if(chk==2)
        {
            registering(user,2);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    public void editing(User user)
    {
        comboChk = 1;
        comboboxValues();
        txtDepartment.setText(user.getDepartment());
        txtFirstName.setText(user.getFirstName());
        txtLastName.setText(user.getLastName());
        txtPhoneNumber.setText(user.getPhoneNumber());
        txtSpritualName.setText(user.getSpritualName());
        txtID.setText(user.getId());
        txtSex.setSelectedItem(user.getSex());
        txtCourses.setSelectedItem(user.getCourses());
        txtServiceType.setSelectedItem(user.getServiceType());
        studentList.setVisible(false);
        registration.setVisible(true); 
    }
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        registration.setVisible(false);
        txtDepartment.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtPhoneNumber.setText("");
        txtSpritualName.setText("");
        txtID.setText("");
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed
    public void comboValues(DefaultComboBoxModel com1,DefaultComboBoxModel com2)
    {
        txtCourses.setModel(com1);
        txtServiceType.setModel(com2);
        registration.validating();
    }
    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        validating();
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        validating();
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtSpritualNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpritualNameKeyReleased
        validating();
    }//GEN-LAST:event_txtSpritualNameKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        validating();
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtDepartmentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartmentKeyReleased
       validating();
    }//GEN-LAST:event_txtDepartmentKeyReleased

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased
       validating();
    }//GEN-LAST:event_txtIDKeyReleased

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        validating();
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFirstName;
    private javax.swing.JLabel btnLastName;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox txtBatch;
    private javax.swing.JComboBox txtCourses;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JComboBox txtServiceType;
    private javax.swing.JComboBox txtSex;
    private javax.swing.JTextField txtSpritualName;
    // End of variables declaration//GEN-END:variables

    public  void validating()
    {
        if((txtDepartment.getText()).equals("")|(txtFirstName.getText()).equals("")|(txtLastName.getText()).equals("")
                |(txtPhoneNumber.getText()).equals("")|(txtSpritualName.getText()).equals(""))
        {
            btnRegister.setEnabled(false);
        }
        else
        {
            btnRegister.setEnabled(true);
        }
            
    }
}
