package com.example.demo.recipes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;



@Service
public class RecipeService {
@Autowired
private RecipeRepository recipeRepository;




public @ResponseBody Iterable<Recipes> getRecipes( ) {
	  return recipeRepository.findAll();

}

public List<Recipes> findRecipes(String whatToSearch) {

	return recipeRepository.findSimilarRecipes(whatToSearch);
	
}
	
}
