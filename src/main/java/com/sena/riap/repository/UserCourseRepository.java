package com.sena.riap.repository;

import com.sena.riap.entities.UserCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCourseRepository extends JpaRepository<UserCourse,Long> {
    /*
    @Query(name ="SELECT * FROM user_record WHERE:recordId",nativeQuery = true)
    List<UserRecord> findByRecordId(Long recordId);

    List<UserRecord> findByUserId(Long userId);
    */
}
