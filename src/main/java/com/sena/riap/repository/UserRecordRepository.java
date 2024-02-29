package com.sena.riap.repository;

import com.sena.riap.entities.Record;
import com.sena.riap.entities.User;
import com.sena.riap.entities.UserRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRecordRepository extends JpaRepository<UserRecord,Long> {
    /*
    @Query(name ="SELECT * FROM user_record WHERE:recordId",nativeQuery = true)
    List<UserRecord> findByRecordId(Long recordId);

    List<UserRecord> findByUserId(Long userId);
    */
}
