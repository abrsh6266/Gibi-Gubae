/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;

import static cps.DbOperation.courselistBB;
import static cps.DbOperation.deletingCourse;
import static cps.DbOperation.memberlistAA;
import static cps.DbOperation.quickSearchA;
import static cps.DbOperation.quickSearchB;
import static gibi.gubae.GibiGubae.icon;
import static gibi.gubae.GibiGubae.menu;
import static gibi.gubae.GibiGubae.quickSearch;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.User;

/**
 *
 * @author Abrham
 */
public class QuickSearch extends javax.swing.JFrame {

    /**
     * Creates new form QuickSearch
     */
    public QuickSearch() {
        setResizable(false);
        initComponents();
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtService = new javax.swing.JTextField();
        btnSearchService = new javax.swing.JButton();
        btnSearchMember = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 153));
        jLabel1.setText("Quick Search");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jTable1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 0, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 405, 191));

        jTable3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jTable3.setForeground(new java.awt.Color(255, 0, 102));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service Type", " Vice Name"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 405, 191));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 153));
        jLabel2.setText("First Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel3.setText("Service Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 104, -1, -1));

        txtService.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtService.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(txtService, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 101, 282, -1));

        btnSearchService.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearchService.setForeground(new java.awt.Color(153, 0, 102));
        btnSearchService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearchService.setText("Search");
        btnSearchService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchServiceActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchService, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, -1));

        btnSearchMember.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSearchMember.setForeground(new java.awt.Color(153, 0, 102));
        btnSearchMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearchMember.setText("Search");
        btnSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMemberActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(255, 0, 102));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 282, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Click on the row to Delete the Student from the List");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Click on the row to Edit The Vice name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back5.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 970, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMemberActionPerformed
        User user = new User(); 
        user.setFirstName(txtFirstName.getText());
        memberlistAA(user);
    }//GEN-LAST:event_btnSearchMemberActionPerformed

    private void btnSearchServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchServiceActionPerformed
         User user = new User(); 
         user.setServiceType(txtService.getText());
         courselistBB(user);
    }//GEN-LAST:event_btnSearchServiceActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        User user = new User();
        TableModel tabelModel = jTable1.getModel();
        user.setId(tabelModel.getValueAt(index,1).toString());
        int a = JOptionPane.showConfirmDialog(null,"Do you want to delete the raw with Id "+tabelModel.getValueAt(index,1).toString()+"?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        { 
            quickSearchA(user);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
       int index = jTable3.getSelectedRow();
        User user = new User();
        TableModel tabelModel = jTable3.getModel();
        user.setServiceType(tabelModel.getValueAt(index,0).toString());
        int a = JOptionPane.showConfirmDialog(null,"Do you want to Edit the Vice of the Service type "+tabelModel.getValueAt(index,0).toString()+"?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           String value = JOptionPane.showInputDialog("set the the Vice Name.");
           user.setViceName(value);
           quickSearchB(user);
        }
    }//GEN-LAST:event_jTable3MouseClicked
    public void tableAA(DefaultTableModel d)
    {
        jTable1.setModel(d);
    }
    public void tableBB(DefaultTableModel d)
    {
        jTable3.setModel(d);
    }
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
            java.util.logging.Logger.getLogger(QuickSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuickSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuickSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuickSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuickSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchMember;
    private javax.swing.JButton btnSearchService;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtService;
    // End of variables declaration//GEN-END:variables
}
