package com.sena.riap.service;

import com.sena.riap.entities.Course;
import com.sena.riap.entities.UserCourse;

import java.util.List;

public interface UserRecordService {


    public List<Course> getUserRecord();

    public Course saveUserRecord(Course course);

    public Course getUserRecordById(Long id);

    public Course updateUserRecord(Long id, Course course);

    public void deleteUserRecord(Long id);
    List<UserCourse> getUserRecordsByRecordId(Long recordId);

    List<UserCourse> getUserRecordsByUserId(Long userId);


}
