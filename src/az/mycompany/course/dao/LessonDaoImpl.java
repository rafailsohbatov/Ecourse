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
public class LessonDaoImpl implements LessonDao{

    @Override
    public List<Lesson> getLessonList() throws Exception {
        List<Lesson> lessonList = new ArrayList();
        String sql = "Select * from lesson where active = 1";
        try(Connection c = DBHelper.getConnection();Statement s = c.createStatement();ResultSet rs = s.executeQuery(sql)){
            while(rs.next()){
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
    
}
