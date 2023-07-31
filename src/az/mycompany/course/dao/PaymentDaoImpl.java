/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.dao;

import az.mycompany.course.model.Lesson;
import az.mycompany.course.model.Payment;
import az.mycompany.course.model.Student;
import az.mycompany.course.model.StudentTeacherLesson;
import az.mycompany.course.model.Teacher;
import az.mycompany.course.model.TeacherLesson;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class PaymentDaoImpl implements PaymentDao {

    @Override
    public List<Payment> getPaymentList() throws Exception {
        List<Payment> paymentList = new ArrayList<>();
        String sql;
        sql = """
              SELECT P.ID,       S.NAME,       S.SURNAME,       T.NAME TeacherName,       T.SURNAME TeacherSurname,       L.NAME LessonName,       L.TIME,
                     L.PRICE,
                     P.AMOUNT
                FROM PAYMENT P
                     INNER JOIN STUDENT_TEACHER_LESSON STL
                        ON P.STUDENT_TEACHER_LESSON_ID = STL.ID
                     INNER JOIN TEACHER_LESSON TL
                        ON TL.ID = STL.TEACHER_LESSON_ID
                     INNER JOIN STUDENT S
                        ON S.ID = STL.STUDENT_ID
                     INNER JOIN LESSON L
                        ON L.ID = TL.LESSON_ID
                     INNER JOIN TEACHER T
                        ON T.ID = TL.TEACHER_ID
               WHERE P.ACTIVE = 1""";
        try ( Connection c = DBHelper.getConnection();  Statement s = c.createStatement();  ResultSet rs = s.executeQuery(sql)) {
            while (rs.next()) {
                Student student = new Student();
                student.setName(rs.getString("Name"));
                student.setSurname(rs.getString("Surname"));
                Teacher teacher = new Teacher();
                teacher.setName(rs.getString("TeacherName"));
                teacher.setSurname(rs.getString("TeacherSurname"));
                Lesson lesson = new Lesson();
                lesson.setName(rs.getString("LessonName"));
                lesson.setTime(rs.getInt("Time"));
                lesson.setPrice(rs.getFloat("Price"));
                StudentTeacherLesson studentTeacherLesson = new StudentTeacherLesson();
                studentTeacherLesson.setStudent(student);
                TeacherLesson teacherLesson = new TeacherLesson();
                teacherLesson.setTeacher(teacher);
                teacherLesson.setLesson(lesson);
                studentTeacherLesson.setTeacherLesson(teacherLesson);
                Payment payment = new Payment();
                payment.setId(rs.getLong("Id"));
                payment.setStudentTeacherLesson(studentTeacherLesson);
                payment.setAmount(rs.getFloat("Amount"));
                paymentList.add(payment);
            }
        }
        return paymentList;
    }

}
