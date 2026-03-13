package com.company.degenerate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.degenerate.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
    
}
