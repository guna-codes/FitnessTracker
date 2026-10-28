package org.fitness.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Diet_tips {
	
	@Id
	private int id;
	private String bmiCategory;
	private String exercise;
	private String keyTips;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBmiCategory() {
		return bmiCategory;
	}
	public void setBmiCategory(String bmiCategory) {
		this.bmiCategory = bmiCategory;
	}
	public String getExercise() {
		return exercise;
	}
	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	public String getKeyTips() {
		return keyTips;
	}
	public void setKeyTips(String keyTips) {
		this.keyTips = keyTips;
	}
	

}
