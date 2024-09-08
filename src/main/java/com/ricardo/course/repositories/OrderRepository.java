package com.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
