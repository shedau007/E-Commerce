package com.shopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Entity.Category;
import com.shopping.Repository.CategoryRepository;

@CrossOrigin("*") 
@RestController
@RequestMapping(path = "Categories")
public class CategoryController {
	
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	@GetMapping(path = "allCategory")
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	@GetMapping(path = "allDistinctCategory")
	public List<String>findDistinctCategory(){
		return categoryRepository.findDistinctCategory();
	}
	
	
	@PostMapping(consumes = "application/json")
	public Category create(@RequestBody Category category) {
		return categoryRepository.save(category);
	}

}
