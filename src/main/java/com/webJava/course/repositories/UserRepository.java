package com.webJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webJava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
