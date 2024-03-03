package com.sena.riap.repository;

import com.sena.riap.entities.EventData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventDataRepository extends JpaRepository<EventData,Long> {
}
