package com.sena.riap.repository;

import com.sena.riap.entities.UserData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDataRepository extends JpaRepository<UserData,Long> {

    UserData findByDocumentAndPassword(String document, String password);

    // SCRIPT INSANO PARA APRENDICES POR CURSO
    @Query(value = "SELECT u.* FROM user_data u " +
            "JOIN user_course uc ON u.id_user = uc.id_user " +
            "JOIN course c ON uc.id_course = c.id_course " +
            "WHERE c.number_course = :courseNumber", nativeQuery = true)
    List<UserData> findLearnersByCourseNumber(int courseNumber);

}
