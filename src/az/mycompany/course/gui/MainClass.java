/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package az.mycompany.course.gui;

import az.mycompany.course.dao.StudentDao;
import az.mycompany.course.dao.StudentDaoImpl;
import az.mycompany.course.service.StudentService;
import az.mycompany.course.service.StudentServiceImpl;

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
        MainFrame mainFrame = new MainFrame(studentService);
        mainFrame.setVisible(true);

    }

}
