package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
