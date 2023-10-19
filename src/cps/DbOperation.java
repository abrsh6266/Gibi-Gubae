
package cps;
import static gibi.gubae.GibiGubae.services;
import static gibi.gubae.GibiGubae.chk;
import static gibi.gubae.GibiGubae.status;
import static gibi.gubae.GibiGubae.comboChk;
import static gibi.gubae.GibiGubae.contact;
import static gibi.gubae.GibiGubae.courses;
import static gibi.gubae.GibiGubae.grade;
import static gibi.gubae.GibiGubae.gradeMenu;
import static gibi.gubae.GibiGubae.home;
import static gibi.gubae.GibiGubae.identity;
import static gibi.gubae.GibiGubae.menu;
import static gibi.gubae.GibiGubae.quickSearch;
import static gibi.gubae.GibiGubae.registration;
import static gibi.gubae.GibiGubae.studentList;
import static gibi.gubae.GibiGubae.teacherlist;
import gibi.gubae.Home;
import gibi.gubae.Menu;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.User;

public class DbOperation {
    public static Connection con1;
    public static PreparedStatement pst;
    public static int check;
    public static void checking(User user, int x)
    {
        try
        {
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from password;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    if(user.getName().equals(r.getString("name"))&&user.getPassword().equals(r.getString("passwords")))
                    {
                        check = x;
                        break;
                    }
                    else
                    {
                        check = 0;
                        JOptionPane.showMessageDialog(new JButton("OK"),"Incorrect password or name");
                    }
                }
                
        }
            catch(Exception ex)
            {
                Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(check==1)
        {
            home.setVisible(false);
            menu.setVisible(true);
        }
    }
    public static void changing(User user,String newName,String newPass)
    {
        checking(user,2);
        
        if(check == 2)
        {
           try
           { 
               forName("com.mysql.cj.jdbc.Driver");
               con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
               pst = con1.prepareStatement("Update password set name = '"+newName+"',passwords = '"+newPass+"';");
               pst.executeUpdate();
               JOptionPane.showMessageDialog(new JButton("ok"),"Password and name have been changed");
           }
           catch(Exception ex)
            {
                Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void registering(User user,int x)
    {
        if(x==1)
        { try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into listofmembers(FirstName,LastName,SpritualName,Sex,Id,PhoneNo,B_name,C_code,department) values (?,?,?,?,?,?,?,?,?) ;");
                    pst.setString(1,user.getFirstName());
                    pst.setString(2,user.getLastName());
                    pst.setString(3,user.getSpritualName());
                    pst.setString(4,user.getSex());
                    pst.setString(5,user.getId());
                    pst.setString(6,user.getPhoneNumber());
                    pst.setString(7,user.getServiceType());
                    pst.setString(8,user.getCourses());
                    pst.setString(9,user.getDepartment());
                    pst.executeUpdate();
                } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into roster(S_name,C_name,Id,Grade,Batch) values (?,?,?,?,?) ;");
                    pst.setString(1,user.getFirstName()+" "+user.getLastName());
                    pst.setString(2,user.getCourses());
                    pst.setString(3,user.getId());
                    pst.setString(4,"?");
                    pst.setString(5,user.getBatch());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registered");
                } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        }
        if(x==2)
        {
            
            
            try{
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                        pst = con1.prepareStatement("delete from listofmembers where Id = '"+identity+"';");
                        pst.executeUpdate();
                 
                }
            
            catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into listofmembers(FirstName,LastName,SpritualName,Sex,Id,PhoneNo,B_name,C_code,department) values (?,?,?,?,?,?,?,?,?) ;");
                    pst.setString(1,user.getFirstName());
                    pst.setString(2,user.getLastName());
                    pst.setString(3,user.getSpritualName());
                    pst.setString(4,user.getSex());
                    pst.setString(5,user.getId());
                    pst.setString(6,user.getPhoneNumber());
                    pst.setString(7,user.getServiceType());
                    pst.setString(8,user.getCourses());
                    pst.setString(9,user.getDepartment());
                    pst.executeUpdate();
                } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
            try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into roster(S_name,C_name,Id,Grade,Batch) values (?,?,?,?,?) ;");
                    pst.setString(1,user.getFirstName()+" "+user.getLastName());
                    pst.setString(2,user.getCourses());
                    pst.setString(3,user.getId());
                    pst.setString(4,"?");
                    pst.setString(5,user.getBatch());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registered");
                } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    public static void studentListA()
    {
        DefaultTableModel defaultTableModel = new DefaultTableModel();    
        Object ob[] = {"Number", "Fname", " L name", "S name", "Sex", "ID", "Departiment", "Phone Number", "Course name", "Service Type"};
        defaultTableModel.setColumnIdentifiers(ob);
        ob[0] = 0;
        try {            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from listofmembers;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0]=(int)ob[0]+1;
                    ob[1] = r.getString("FirstName");
                    ob[2] = r.getString("LastName");
                    ob[3] = r.getString("SpritualName");
                    ob[4] = r.getString("Sex");
                    ob[5] = r.getString("Id");
                    ob[6] = r.getString("department");
                    ob[7] = r.getString("PhoneNo");
                    ob[8] = r.getString("C_code");
                    ob[9] = r.getString("B_name");
                    defaultTableModel.addRow(ob);
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        studentList.table(defaultTableModel);
        studentList.setVisible(true);
    }
    public static void comboboxValues()
    {
        DefaultComboBoxModel com1 = new DefaultComboBoxModel();
        DefaultComboBoxModel com2 = new DefaultComboBoxModel();
        try {
            
                
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from branches;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    com1.addElement(r.getString("B_name"));  
                }
            } 
        catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        try {
            
                
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from courses;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    com2.addElement(r.getString("C_name"));  
                }
            } 
        catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        if(comboChk==1)
        {
            comboChk=0;
            registration.comboValues(com2,com1);
            registration.setVisible(true);
        }
        if(comboChk==2)
        {
            comboChk=0;
            teacherlist.comboValuess(com2);
            gradeMenu.comboValuein(com2);
        }
        
        
    }
    public static void formingServiceTable()
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"ServiceType", "Vice Name"};
        d.setColumnIdentifiers(ob);
        ob[0] = 0;        
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from branches;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = r.getString("B_name");
                    ob[1] = r.getString("Vice_Name");
                    d.addRow(ob);
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        services.serviceTable(d);
    }
    public static void addingServices(User user)
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"ServiceType", "Vice Name"};
        try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into branches(B_name,Vice_Name) values (?,?) ;");
                    pst.setString(1,user.getServiceType());
                    pst.setString(2,user.getViceName());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Service Type Added");
                    
                } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        d.setColumnIdentifiers(ob);     
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from branches;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = r.getString("B_name");
                    ob[1] = r.getString("Vice_Name");
                    d.addRow(ob);
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        services.serviceTable(d);
        
    }
    public static void individualServiceList(User user)
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"Number", "Student Name"};
        d.setColumnIdentifiers(ob);
        ob[0] = 0;        
        try {
            
                
            forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from listofmembers where B_name = '" + user.getServiceType()+"' ;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = (int)ob[0]+1;
                    ob[1] = r.getString("FirstName")+" " + r.getString("LastName");
                    d.addRow(ob);                    
                }
                
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        services.serviceTable2(d);
        
    }
    public static void teacherListA()
    {
        DefaultTableModel defaultTableModel = new DefaultTableModel();    
        Object ob[] = {"F name", " L name", "Phone number","Email", "course"};
        defaultTableModel.setColumnIdentifiers(ob);
        ob[0] = 0;
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from teachersi;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = r.getString("FirstName");
                    ob[1] = r.getString("LastName");
                    ob[2] = r.getString("PhoneNo");
                    ob[3] = r.getString("Email");
                    ob[4] = r.getString("course");
                    defaultTableModel.addRow(ob);
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        teacherlist.validating();
        comboboxValues();
        teacherlist.listTable(defaultTableModel);
        teacherlist.setVisible(true);
    }
    public static void addingTeacher(User user)
    {
        try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into teachersi(FirstName,LastName,PhoneNo,Email,course) values (?,?,?,?,?) ;");
                    pst.setString(1,user.getFirstName());
                    pst.setString(2,user.getLastName());
                    pst.setString(3,user.getPhoneNumber());
                    pst.setString(4,user.getEmail());
                    pst.setString(5,user.getCourses());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registered");
            } 
        catch (Exception ex) 
             {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
             }
        teacherListA();
    }
    public static void courseListA()
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"number","Courses name", "Duration"};
        d.setColumnIdentifiers(ob);     
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from courses;");
                ResultSet  r= pst.executeQuery();
                ob[0] = 0;
                while (r.next())
                {
                    ob[0] = (int)ob[0]+1;
                    ob[1] = r.getString("C_name");
                    ob[2] = r.getString("Duration");
                    d.addRow(ob);
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        courses.CourseTable(d);
    }
    public static void addingCourses(User user)
    {
        
        try {
                    forName("com.mysql.cj.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                    pst = con1.prepareStatement("insert into courses(C_name,Duration) values (?,?) ;");
                    pst.setString(1,user.getCourses());
                    pst.setString(2,user.getDuration());
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null,"course Added");
                    
                } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        courseListA();
    }
    public static void deletingCourse(User user)
    {
        try{
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                        pst = con1.prepareStatement("delete from courses where C_name = '"+user.getCourses()+"';");
                        pst.executeUpdate();
                }
            
            catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        courseListA();
    }
    public static void removingTeacher(User user)
    {
        try{
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                        pst = con1.prepareStatement("delete from teachersi where PhoneNo = '" + user.getPhoneNumber()+"';");
                        pst.executeUpdate();
                }
            
            catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        teacherListA();
    }
    public static void gradeA(User user)
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"Name","Id", "Course","Grade"};
        d.setColumnIdentifiers(ob);     
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from roster where Batch = '"+user.getBatch()+"' AND C_name = '"+user.getCourses()+"' ;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = r.getString("S_name");
                    ob[1] = r.getString("Id");
                    ob[2] = r.getString("C_name");
                    ob[3] = r.getString("Grade");
                    d.addRow(ob);
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        grade.gradeTable(d);
    }
    public static void setGradeA(User user)
    {     
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                        pst = con1.prepareStatement("update roster set Grade = '"+
                                user.getGrade()+"' where Id = '"+user.getId()+"' AND C_name = '"+user.getCourses()+"' ;");
                        pst.executeUpdate();
            
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        String grade1;
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from roster where Id = '"+user.getId()+"' AND C_name = '"+user.getCourses()+"' ;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    user.setBatch(r.getString("Batch"));
                    
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        gradeA(user);
        
    }
    public static void quickSearchA(User user)
    {
        try{
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                        pst = con1.prepareStatement("delete from listofmembers where Id = '" + user.getId()+"';");
                        pst.executeUpdate();
                }
            
            catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        memberlistAA(user);
    }
    public static void quickSearchB(User user)
    {try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                        pst = con1.prepareStatement("update branches set Vice_Name = '"+
                                user.getViceName()+"' where B_name = '"+user.getServiceType()+"' ;");
                        pst.executeUpdate();
            
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
    courselistBB(user);
    }
    public static void memberlistAA(User user)
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"Name","Id"};
        d.setColumnIdentifiers(ob);     
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from listofmembers where Id = '" + user.getId()+"' OR FirstName = '"+user.getFirstName()+"' ;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = r.getString("FirstName")+" "+r.getString("LastName");
                    ob[1] = r.getString("Id");
                    d.addRow(ob);
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        quickSearch.tableAA(d);
    }
    public static void courselistBB(User user)
    {
        DefaultTableModel d = new DefaultTableModel();
        Object ob[] = {"Service Type","Vise Name"};
        d.setColumnIdentifiers(ob);     
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from branches where B_name = '" + user.getServiceType()+"';");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    ob[0] = r.getString("B_name");
                    ob[1] = r.getString("Vice_Name");
                    d.addRow(ob);
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        quickSearch.tableBB(d);
    }
    public static void contactUpdating(User user)
    {
        if((status=="B"))
        {
            try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("UPDATE contactinfo set Gubae_Name = '"+user.getText1()+"',CBE = '"+user.getText2()+"',Abisinya = '"+user.getText3()+"';");
                pst.executeUpdate();
                
            } catch (Exception ex) {
                Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if((status=="A"))
        {
            try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("UPDATE contactinfo set S_name = '"+user.getText1()+"',P_number = '"+user.getText2()+"',Email = '"+user.getText3()+"';");
                pst.executeUpdate();
                
            } catch (Exception ex) {
                Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public static void showing()
    { User user = new User();
        try {
            
                forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/gibigubae","root","");
                pst = con1.prepareStatement("select * from contactinfo;");
                ResultSet  r= pst.executeQuery();
                while (r.next())
                {
                    user.setFirstName(r.getString("S_name"));
                    user.setPhoneNumber(r.getString("P_number"));
                    user.setEmail(r.getString("Email"));
                    user.setCBE(r.getString("CBE"));
                    user.setAbisinya(r.getString("Abisinya"));
                    user.setGibi(r.getString("Gubae_Name"));
                }
            } catch (Exception ex) {
                    Logger.getLogger(DbOperation.class.getName()).log(Level.SEVERE, null, ex);
                }
        if(status=="A")
        {
            contact.settingAllA(user);
        }
        if(status=="B")
        {
            contact.settingAllB(user);
        }
    }
    
    
    
}
