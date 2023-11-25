package com.educanoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educanoweb.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
