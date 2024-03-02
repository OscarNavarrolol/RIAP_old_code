package com.sena.riap.repository;

import com.sena.riap.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
    /*
    @Query(,nativeQuery = true)
   List<Attendance> findByEventId(Long eventId);

   List<Attendance> findByUserId(Long userId);
*/
}
