/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.Student;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface StudentDao {
    List<Student> getStudentList() throws Exception;
}
