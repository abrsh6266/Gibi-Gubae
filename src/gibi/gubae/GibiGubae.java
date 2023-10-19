/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gibi.gubae;
import java.awt.*;
import java.awt.Image;

/**
 *
 * @author Abrham
 */
public class GibiGubae {

   public static Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Abrham\\Documents\\NetBeansProjects\\Gibi Gubae\\src\\images\\marry.png");
   public static String identity;
   public static Home home = new Home();
   public static Menu menu = new Menu();
   public static Registration registration = new Registration();
   public static StudentList studentList = new StudentList();
   public static TeacherList teacherlist = new TeacherList();
   public static Services services = new Services();
   public static GradeMenu gradeMenu = new GradeMenu();
   public static Grade grade = new Grade();
   public static Contact contact = new Contact();
   public static ContactInfo contactInfo = new ContactInfo();
   public  static QuickSearch quickSearch = new QuickSearch();
   public static String status;
   public static Courses courses = new Courses();
    public static int chk=1;
    public static int comboChk=0;
    public static void main(String[] args) {
      home.setVisible(true);
    }
    
}
