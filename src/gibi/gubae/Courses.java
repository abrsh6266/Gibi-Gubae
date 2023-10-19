package gibi.gubae;
import static cps.DbOperation.addingCourses;
import static cps.DbOperation.addingServices;
import static cps.DbOperation.deletingCourse;
import static cps.DbOperation.formingServiceTable;
import static cps.DbOperation.individualServiceList;
import static gibi.gubae.GibiGubae.chk;
import static gibi.gubae.GibiGubae.icon;
import static gibi.gubae.GibiGubae.identity;
import javax.swing.table.DefaultTableModel;
import static gibi.gubae.GibiGubae.menu;
import static gibi.gubae.GibiGubae.registration;
import static gibi.gubae.GibiGubae.services;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.User;
public class Courses extends javax.swing.JFrame {

    /**
     * Creates new form Services
     */
    public Courses() {
        initComponents();
        setResizable(false);
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcourseName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "Title 3"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 510, 360));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Course name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 139, -1, -1));

        txtcourseName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtcourseName.setForeground(new java.awt.Color(204, 0, 51));
        txtcourseName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcourseNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtcourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 136, 251, -1));

        btnAdd.setBackground(new java.awt.Color(255, 0, 255));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 255, 51));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 292, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Duration");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 214, -1, -1));

        txtDuration.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(204, 0, 51));
        txtDuration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDurationKeyReleased(evt);
            }
        });
        getContentPane().add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 211, 251, -1));

        btnMenu.setBackground(new java.awt.Color(255, 51, 255));
        btnMenu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(51, 255, 51));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Courses");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 255));
        jLabel5.setText("click on the row to delete indiviadual list");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        User user = new User();
        user.setCourses(txtcourseName.getText());
        user.setDuration(txtDuration.getText());
        addingCourses(user);
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtcourseNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcourseNameKeyReleased
        validating();
    }//GEN-LAST:event_txtcourseNameKeyReleased

    private void txtDurationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDurationKeyReleased
        validating();
    }//GEN-LAST:event_txtDurationKeyReleased

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        txtcourseName.setText("");
        txtDuration.setText("");
        setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int index = jTable1.getSelectedRow();
        User user = new User();
        TableModel tabelModel = jTable1.getModel();
        user.setDuration(tabelModel.getValueAt(index,2).toString());
        user.setCourses(tabelModel.getValueAt(index,1).toString());
        int a = JOptionPane.showConfirmDialog(null,"Do you want to delete the raw with course name "+tabelModel.getValueAt(index,1).toString()+"?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            
            deletingCourse(user);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public  void validating()
    {
        if((txtcourseName.getText()).equals("")|(txtDuration.getText()).equals(""))
        {
            btnAdd.setEnabled(false);
        }
        else
        {
            btnAdd.setEnabled(true);
        }
            
    }
    public void CourseTable(DefaultTableModel d)
   {
       validating();
       jTable1.setModel(d);
       setVisible(true);
   }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtcourseName;
    // End of variables declaration//GEN-END:variables

}
