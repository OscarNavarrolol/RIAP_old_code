package com.sena.riap.service;

import com.sena.riap.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourse();

    public Course saveCourse(Course course);

    public Course getCourseById(Long id);

    public Course updateCourse(Long id, Course course);

    public void deleteCourse(Long id);

    List<Integer> getCoursesByUser(Long userId);

}
