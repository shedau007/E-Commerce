package com.shopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Entity.Cart;
import com.shopping.Repository.CartRepository;

@CrossOrigin("*") 
@RestController
@RequestMapping(path = "Carts")
public class CartController {
	
	
	@Autowired
	CartRepository cartRepository;
	
	
	@GetMapping(path = "allCarts")
	public List<Cart> findAll() {
		return cartRepository.findAll();
	}
	
	@PostMapping(consumes = "application/json")
	public Cart create(@RequestBody Cart cart) {
		return cartRepository.save(cart);
	}
	
	@DeleteMapping(path = "/{cartId}")
	public void delete(@PathVariable("cartId") long cartId) {
		cartRepository.deleteById(cartId);
	}

}
