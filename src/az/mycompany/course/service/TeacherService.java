/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.service;

import az.mycompany.course.model.Lesson;
import az.mycompany.course.model.Teacher;
import az.mycompany.course.model.TeacherLesson;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TeacherService {

    List<Teacher> getTeacherList() throws Exception;
    
     List<Teacher> getTeacherListByLessonId(Long lessonId) throws Exception;

     TeacherLesson getTeacherLessonByTeacherAndLessonId(Long teacherId,Long LessonId) throws Exception;
}
