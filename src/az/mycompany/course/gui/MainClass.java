/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package az.mycompany.course.gui;

import az.mycompany.course.dao.LessonDao;
import az.mycompany.course.dao.LessonDaoImpl;
import az.mycompany.course.dao.PaymentDao;
import az.mycompany.course.dao.PaymentDaoImpl;
import az.mycompany.course.dao.StudentDao;
import az.mycompany.course.dao.StudentDaoImpl;
import az.mycompany.course.dao.TeacherDao;
import az.mycompany.course.dao.TeacherDaoImpl;
import az.mycompany.course.service.LessonService;
import az.mycompany.course.service.LessonServiceImpl;
import az.mycompany.course.service.PaymentService;
import az.mycompany.course.service.PaymentServiceImpl;
import az.mycompany.course.service.StudentService;
import az.mycompany.course.service.StudentServiceImpl;
import az.mycompany.course.service.TeacherService;
import az.mycompany.course.service.TeacherServiceImpl;

/**
 *
 * @author Admin
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        
        StudentDao studentDao = new StudentDaoImpl();
        StudentService studentService = new StudentServiceImpl(studentDao);
        TeacherDao teacherDao = new TeacherDaoImpl();
        TeacherService teacherService = new TeacherServiceImpl(teacherDao);
        LessonDao lessanDao = new LessonDaoImpl();
        LessonService lessonService = new LessonServiceImpl(lessanDao);
        PaymentDao paymentDao = new PaymentDaoImpl();
        PaymentService paymentService = new PaymentServiceImpl(paymentDao);
        MainFrame mainFrame = new MainFrame(studentService,teacherService,lessonService,paymentService);
        mainFrame.setVisible(true);
    }

}
