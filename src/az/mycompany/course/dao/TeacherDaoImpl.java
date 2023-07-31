/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.Student;
import az.mycompany.course.model.Teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TeacherDaoImpl implements TeacherDao {

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        List<Teacher> list = new ArrayList<>();
        String sql = "SELECT * FROM Teacher WHERE ACTIVE = 1";
        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql);  ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setId(rs.getLong("Id"));
                teacher.setName(rs.getString("Name"));
                teacher.setSurname(rs.getString("Surname"));
                teacher.setDob(rs.getDate("Dob"));
                teacher.setAddress(rs.getString("Address"));
                teacher.setPhone(rs.getString("Phone"));
                teacher.setWork_experience(rs.getInt("Work_experience"));
                list.add(teacher);
            }
        }
        return list;
    }

}
