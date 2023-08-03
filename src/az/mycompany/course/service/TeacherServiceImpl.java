/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.service;

import az.mycompany.course.dao.TeacherDao;
import az.mycompany.course.model.Teacher;
import az.mycompany.course.model.TeacherLesson;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TeacherServiceImpl implements TeacherService{

    private TeacherDao teacherDao;

    public TeacherServiceImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }
    
    
    @Override
    public List<Teacher> getTeacherList() throws Exception {
        return teacherDao.getTeacherList();
    }

    @Override
    public List<Teacher> getTeacherListByLessonId(Long lessonId) throws Exception {
        return teacherDao.getTeacherListByLessonId(lessonId);
    }

    @Override
    public TeacherLesson getTeacherLessonByTeacherAndLessonId(Long teacherId, Long LessonId) throws Exception {
        return teacherDao.getTeacherLessonByTeacherAndLessonId(teacherId, LessonId);
    }
    
}
