/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.Teacher;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TeacherDao {
      List<Teacher> getTeacherList() throws Exception;
}
