package com.educanoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educanoweb.course.entities.Category;
import com.educanoweb.course.repositories.CategotyRepository;

@Service
public class CategoryService {

	@Autowired
	private CategotyRepository repository;
	
	public List<Category> finAll() {
		return repository.findAll();
	}
	
	public Category findByiD(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
