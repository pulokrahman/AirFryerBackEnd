package com.example.demo.ingredients;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository 
public interface IngredientRepository extends CrudRepository<Ingredients,Integer> {

@Query(value="select * from ingredients where productid=:productid" ,nativeQuery = true)
List<Ingredients> getIngredients(@Param("productid") int productid); 	
	
}
