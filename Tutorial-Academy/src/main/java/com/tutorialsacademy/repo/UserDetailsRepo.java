package com.tutorialsacademy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorialsacademy.entity.UserDetailsEntity;

@Repository
public interface UserDetailsRepo extends JpaRepository<UserDetailsEntity, String>{
	
	
}
