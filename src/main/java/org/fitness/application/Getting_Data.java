package org.fitness.application;

import java.util.Scanner;

import org.fitness.application.entity.Category;
import org.fitness.application.entity.Userdata;
import org.fitness.application.logics.BmiCalculation;

public class Getting_Data {

	public Userdata inputData() throws InterruptedException {
		Category c=new Category();
		Scanner sc = new Scanner(System.in);
		BmiCalculation bmi = new BmiCalculation();
		Userdata user = new Userdata();

//	    for name
		System.out.println("Enter your Name ");
		user.setUser_name(sc.nextLine());

//		for age
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		while (age < 1 || age > 150) {
			System.err.println("Enter the Valid Age");
			age = sc.nextInt();
		}
		user.setAge(age);

//		for height
		System.out.println("Enter your Height in (cm)");
		double height = sc.nextDouble();

		while (height < 50 || height > 200) {
			System.err.println("Please enter the Valid height in (cm)");
			height = sc.nextDouble();
		}
		user.setHeight(height);

//		for weight
		System.out.println("Enter your Weight");
		double weight = sc.nextDouble();
		while (weight < 5 || weight > 200) {
			System.err.println("Please enter the valid weight in (kg)");
			weight = sc.nextDouble();
		}
		user.setWeight(weight);

//		for gender
		System.out.println("Enter your Gender");
		System.out.println("Press 1 For Male \nPress 2 for Female");
		int gender = sc.nextInt();
		String value = "";
		boolean b = true;
		while (b) {
			if (gender == 1) {
				value = "Male";
				b = false;
			} else if (gender == 2) {
				value = "Female";
				b = false;
			} else {
				System.err.println("Please enter the Valid input Either 1 or 2");
				gender = sc.nextInt();
			}
		}
		user.setGender(value);

	   bmi.calculateBmi(height, weight,c);
		
		user.setCategory(c);
		
		sc.close();
		return user;

	}

}
