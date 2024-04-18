package com.sena.riap.repository;

import com.sena.riap.entities.Attendance;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long> {

    @Transactional
    void deleteAllByIdEvent(Long eventId);

}
