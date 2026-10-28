package org.fitness.application.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Category {

	private String category;

	private double bmi;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

}
