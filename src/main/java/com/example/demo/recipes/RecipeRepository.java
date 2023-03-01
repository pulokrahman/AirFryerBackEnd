package com.example.demo.recipes;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipes, Integer> {

	@Query(
			  value = "SELECT * FROM recipes WHERE product LIKE :recipe%", 
			  nativeQuery = true)
	List<Recipes> findSimilarRecipes(@Param("recipe") String recipe);
	
	
	
}
