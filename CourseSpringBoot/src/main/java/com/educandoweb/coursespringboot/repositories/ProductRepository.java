package com.educandoweb.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespringboot.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

}