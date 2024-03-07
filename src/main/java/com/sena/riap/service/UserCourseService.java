package com.sena.riap.service;

import com.sena.riap.entities.Course;
import com.sena.riap.entities.UserCourse;

import java.util.List;

public interface UserCourseService {


    public List<UserCourse> getUserCourse();

    public UserCourse saveUserCourse(UserCourse userCourse);

    public UserCourse getUserCourseById(Long id);

    public UserCourse updateUserCourse(Long id, UserCourse userCourse);

    public void deleteUserCourse(Long id);
    List<UserCourse> getUserCourseByRecordId(Long recordId);

    List<UserCourse> getUserCourseByUserId(Long userId);


}
