package com.fabylove.ecommerce.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabylove.ecommerce.produto.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
