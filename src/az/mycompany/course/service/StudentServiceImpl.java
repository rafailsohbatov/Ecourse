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

    @Override
    public void addStudent(Student student) throws Exception {
        studentDao.addStudent(student);
    }

    @Override
    public Student getStudentById(Long studentId) throws Exception {
        return studentDao.getStudentById(studentId);
    }

    @Override
    public void updateStudent(Student student) throws Exception {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudent(Long studentId) throws Exception {
        studentDao.deleteStudent(studentId);
    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
        return studentDao.searchStudentData(keyword);
    }
}
