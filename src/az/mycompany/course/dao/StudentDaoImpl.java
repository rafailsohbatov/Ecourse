/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.Student;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;


/**
 *
 * @author Admin
 */
public class StudentDaoImpl implements StudentDao{

    @Override
    public List<Student> getStudentList() throws Exception {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM STUDENT WHERE ACTIVE = 1";
        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql);  ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getLong("Id"));
                  student.setName(rs.getString("Name"));
                student.setName(rs.getString("Name"));
                student.setSurname(rs.getString("Surname"));
                student.setDob(rs.getDate("Dob"));
                student.setAddress(rs.getString("Address"));
                student.setPhone(rs.getString("Phone"));
                list.add(student);
            }
        }
        return list;
    }
    
}
