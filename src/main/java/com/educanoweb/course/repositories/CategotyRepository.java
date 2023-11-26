package com.educanoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educanoweb.course.entities.Category;

public interface CategotyRepository  extends JpaRepository<Category, Long>{

}
