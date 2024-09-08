package com.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
