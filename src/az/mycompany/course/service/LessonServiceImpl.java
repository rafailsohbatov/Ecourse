/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.mycompany.course.service;

import az.mycompany.course.dao.LessonDao;
import az.mycompany.course.model.Lesson;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LessonServiceImpl implements LessonService {

    private  LessonDao lessonDao;

    public LessonServiceImpl(LessonDao lessonDao) {
        this.lessonDao = lessonDao;
    }

    @Override
    public List<Lesson> getLessonList() throws Exception {
       return lessonDao.getLessonList();
    }

    @Override
    public List<Lesson> getLessonByStudentId(Long studentId) throws Exception {
        return lessonDao.getLessonByStudentId(studentId);
    }

}
