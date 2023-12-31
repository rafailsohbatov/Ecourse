/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.Lesson;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LessonDaoImpl implements LessonDao {

    @Override
    public List<Lesson> getLessonList() throws Exception {
        List<Lesson> lessonList = new ArrayList();
        String sql = "Select * from lesson where active = 1";
        try ( Connection c = DBHelper.getConnection();  Statement s = c.createStatement();  ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(rs.getLong("Id"));
                lesson.setName(rs.getString("Name"));
                lesson.setTime(rs.getInt("time"));
                lesson.setPrice(rs.getFloat("price"));
                lessonList.add(lesson);
            }
        }
        return lessonList;
    }

    @Override
    public List<Lesson> getLessonByStudentId(Long studentId) throws Exception {
        String sql = """
                     SELECT L.ID, L.NAME, L.PRICE
                       FROM STUDENT_TEACHER_LESSON STL
                            INNER JOIN STUDENT S
                               ON S.ID = STL.STUDENT_ID
                            INNER JOIN TEACHER_LESSON TL
                               ON TL.ID = STL.TEACHER_LESSON_ID
                            INNER JOIN LESSON L
                               ON L.ID = TL.LESSON_ID
                      WHERE STL.ACTIVE = 1 AND L.ACTIVE = 1 AND S.ID = ? """;
        List<Lesson> lessonList = new ArrayList<>();
        try ( Connection c = DBHelper.getConnection();  PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setLong(1, studentId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lesson lesson = new Lesson();
                lesson.setId(rs.getLong("ID"));
                lesson.setName(rs.getString("NAME"));
                lesson.setPrice(rs.getFloat("PRICE"));
                lessonList.add(lesson);
            }
        }
        return lessonList;
    }

}
