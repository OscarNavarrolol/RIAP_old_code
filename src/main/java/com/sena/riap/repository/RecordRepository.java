package com.sena.riap.repository;

import com.sena.riap.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Course,Long> {
}
