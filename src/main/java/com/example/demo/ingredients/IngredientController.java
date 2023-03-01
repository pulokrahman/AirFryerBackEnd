package com.example.demo.ingredients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(path= "api/v1/ingredients")

public class IngredientController {

@Autowired
IngredientService ingredientService;
public IngredientController(IngredientService ingredientService) {
this.ingredientService=ingredientService;	
	
}
@GetMapping
@CrossOrigin
public List<Ingredients> getIngredients(@RequestParam Integer productid){
	
return this.ingredientService.getIngredients(productid);	
}

	
	
}
