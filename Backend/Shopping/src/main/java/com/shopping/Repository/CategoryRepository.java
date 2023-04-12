package com.shopping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shopping.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
	
	@Query("SELECT distinct s.categoryName FROM Category s")
	public List<String> findDistinctCategory();
	

}
