package com.example.demo.ingredients;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Ingredients {

	  private  @Id @GeneratedValue(strategy =GenerationType.IDENTITY) int id;
	  private  int productid;
	  private String ingredients;
	  public Ingredients(int id,int productid, String ingredients) {
		  this.id=id;
		  this.productid=productid;
		  this.ingredients=ingredients;
		  
	  }
	public Ingredients( ) {
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	  
	
}
