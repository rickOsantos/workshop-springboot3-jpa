package com.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
