package com.sena.riap.repository;

import com.sena.riap.entities.UserData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends JpaRepository<UserData,Long> {


}
