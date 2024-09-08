package com.ricardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.course.entities.OrderItem;
import com.ricardo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
