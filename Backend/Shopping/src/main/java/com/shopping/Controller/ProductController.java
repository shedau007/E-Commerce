package com.shopping.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Entity.Product;
import com.shopping.Repository.ProductRepository;

@CrossOrigin("*") 
@RestController        
@RequestMapping(path = "/products")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	
	
	@GetMapping(path = "allProducts")
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	
	@GetMapping(path = "Id/{productId}")
	
	public Optional<Product> findOne(@PathVariable("productId") long productId
			) {
		return productRepository.findById(productId);
	}
	
	
	
	

	@GetMapping(path = "allProducts/products")
	public ResponseEntity<Map<String, Object>> findAllProducts() {
			List<Product> products = productRepository.findAll();
			Map<String, Object> response = new HashMap<>();
			response.put("products", products);
			response.put("totalItems", products.size());
			return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping(consumes = "application/json")
	public Product create(@RequestBody Product product) {
		return productRepository.save(product);
	}

}
