package com.example.demo.ingredients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientService {
@Autowired
IngredientRepository ingredientRepository;

public List<Ingredients> getIngredients(int productid) {

return ingredientRepository.getIngredients(productid);
	
	
}
	
	
}
