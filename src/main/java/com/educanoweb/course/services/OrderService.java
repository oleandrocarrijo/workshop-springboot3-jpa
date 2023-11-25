package com.educanoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educanoweb.course.entities.Order;
import com.educanoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> finAll() {
		return repository.findAll();
	}
	
	public Order findByiD(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
