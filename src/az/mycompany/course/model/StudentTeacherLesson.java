/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.model;

/**
 *
 * @author Admin
 */
public class StudentTeacherLesson extends Course{
    private Student student;
    private TeacherLesson teacherLesson;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public TeacherLesson getTeacherLesson() {
        return teacherLesson;
    }

    public void setTeacherLesson(TeacherLesson teacherLesson) {
        this.teacherLesson = teacherLesson;
    }
    
}
