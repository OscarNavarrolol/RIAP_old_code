package com.sena.riap.repository;

import com.sena.riap.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

    @Query("SELECT c.number FROM UserData u, UserCourse uc, Course c WHERE u.idUser = uc.idUser AND uc.idCourse = c.idCourse AND u.idUser = :userId")
    List<Integer> findCourseNumbersByUserId(Long userId);

}
