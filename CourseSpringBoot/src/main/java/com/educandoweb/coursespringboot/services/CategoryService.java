package com.educandoweb.coursespringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.educandoweb.coursespringboot.entities.Category;
import com.educandoweb.coursespringboot.repositories.CategoryRepository;

@Component
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	public List<Category>findAll(){
	
		return repository.findAll();
		
	}
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
