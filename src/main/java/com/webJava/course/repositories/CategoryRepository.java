package com.webJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webJava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
