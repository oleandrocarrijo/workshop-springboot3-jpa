package com.educanoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educanoweb.course.entities.Product;
import com.educanoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> finAll() {
		return repository.findAll();
	}
	
	public Product findByiD(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
