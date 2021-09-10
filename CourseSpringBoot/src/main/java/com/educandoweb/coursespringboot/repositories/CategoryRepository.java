package com.educandoweb.coursespringboot.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
