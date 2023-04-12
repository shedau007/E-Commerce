package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
