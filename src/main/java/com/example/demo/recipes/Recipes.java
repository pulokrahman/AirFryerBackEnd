package com.example.demo.recipes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity

public class Recipes {
	 
	  private  @Id @GeneratedValue(strategy =GenerationType.IDENTITY) int id;
	  private String product;
	  private int cookingtime;
	
	  private String imageurl;
	 public Recipes(int id,String product,int cookingtime, String imageurl) {
		this.id=id;
		this.product=product;
		this.cookingtime=cookingtime;
		this.imageurl=imageurl;
		
	 }
	 public Recipes() {
		 
		 
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCookingtime() {
		return cookingtime;
	}

	public void setCookingtime(int cookingtime) {
		this.cookingtime = cookingtime;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	  
	  
}
