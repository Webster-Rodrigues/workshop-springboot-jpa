package com.webJava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webJava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
