package org.fitness.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "underweight_plan")
public class Underweight_plan {
	@Id
	private int id;
	private String meal_time ;
	private String food_items;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMeal_time() {
		return meal_time;
	}
	public void setMeal_time(String meal_time) {
		this.meal_time = meal_time;
	}
	public String getFood_items() {
		return food_items;
	}
	public void setFood_items(String food_items) {
		this.food_items = food_items;
	}

}
