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
public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> getStudentList() throws Exception {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT * FROM STUDENT WHERE ACTIVE = 1";
        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql);  ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getLong("Id"));
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

    @Override
    public void addStudent(Student student) throws Exception {
        String sql = "INSERT INTO STUDENT(Id,Name,Surname,Dob,Phone,Address)"
                + "VALUES(STUDENT_SEQ.NEXTVAL,?,?,?,?,?)";
        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getSurname());
            ps.setDate(3, new Date(student.getDob().getTime()));
            ps.setString(4, student.getPhone());
            ps.setString(5, student.getAddress());
            ps.execute();
            c.commit();
        }
    }

}
