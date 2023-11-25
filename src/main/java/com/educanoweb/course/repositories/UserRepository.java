package com.educanoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educanoweb.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
