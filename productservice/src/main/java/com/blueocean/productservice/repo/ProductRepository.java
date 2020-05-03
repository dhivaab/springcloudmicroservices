package com.blueocean.productservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueocean.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
