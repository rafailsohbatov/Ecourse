/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.service;

import az.mycompany.course.dao.StudentDao;
import az.mycompany.course.model.Student;
import java.util.List;

/**
 *
 * @author Admin
 */
public class StudentServiceImpl implements StudentService{
    
    private StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    
    @Override
    public List<Student> getStudentList() throws Exception{
        return studentDao.getStudentList();
    }
    
}
