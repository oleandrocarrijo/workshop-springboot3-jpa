package com.educanoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.educanoweb.course.entities.User;
import com.educanoweb.course.repositories.UserRepository;
import com.educanoweb.course.services.exceptions.DatabaseException;
import com.educanoweb.course.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> finAll() {
		return repository.findAll();
	}
	
	public User findByiD(long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obg) {
		return repository.save(obg);
	}
	
	public void delete(Long id){
	    try {
	        if(!repository.existsById(id)) throw new ResourceNotFoundException(id);
	        repository.deleteById(id);
	    }catch (ResourceNotFoundException e){
	        throw new ResourceNotFoundException(id);
	    } catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	public User update(Long id, User obj) {
		try {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
