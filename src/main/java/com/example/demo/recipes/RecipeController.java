package com.example.demo.recipes;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;


@RequestMapping(path= "api/v1/recipes")
@RestController
public class RecipeController {
@Autowired 
private final RecipeService recipeService;


public RecipeController(RecipeService recipeService) {
	this.recipeService=recipeService;
	
}

@CrossOrigin
@GetMapping
public @ResponseBody Iterable<Recipes> getRecipes() {

	return recipeService.getRecipes();
	
}
@CrossOrigin
@GetMapping("/search")
public @ResponseBody List<Recipes>  findRecipes(@RequestParam String whatToSearch) {

return recipeService.findRecipes(whatToSearch);
}
}




