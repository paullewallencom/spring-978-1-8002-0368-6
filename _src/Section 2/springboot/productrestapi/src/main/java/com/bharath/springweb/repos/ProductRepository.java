package com.bharath.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
