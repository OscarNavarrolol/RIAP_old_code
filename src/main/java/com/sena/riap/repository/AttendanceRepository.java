package com.sena.riap.repository;

import com.sena.riap.entities.Attendance;
import com.sena.riap.entities.Event;
import com.sena.riap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
    /*
    @Query(,nativeQuery = true)
   List<Attendance> findByEventId(Long eventId);

   List<Attendance> findByUserId(Long userId);
*/
}
