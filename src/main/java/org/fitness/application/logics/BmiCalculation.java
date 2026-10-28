package org.fitness.application.logics;

import org.fitness.application.entity.Category;

public class BmiCalculation {

	CoreLogic logic = new CoreLogic();
	
	double bmi;

	public double calculateBmi(double height, double weight,Category c) throws InterruptedException {
		double heightm = height / 100;
		bmi = (weight) / (heightm * heightm);
		c.setBmi(bmi);
		String cat="";

				
		String CYAN = "\u001B[36m";
		String GREEN = "\u001B[32m";
		String YELLOW = "\u001B[33m";
		String RED = "\u001B[31m";
		String RESET = "\u001B[0m";
		

		if (bmi < 18.5) {
			cat="Under Weight";
			c.setCategory(cat);
			System.out.println();
			System.out.println("Your BMI is :"+bmi);
			System.out.println();
			System.out.println(CYAN+"--------Below Healthy Range--------"+RESET);
			System.out.println(CYAN+"Your BMI is below the recommended range.\nFocus on balanced nutrition, nourishing foods,\nand healthy habits to support your overall well-being."+RESET);
			System.out.println();
			
		    logic.underweight();

		} else if (bmi >= 18.5 && bmi < 24.9) {
			cat="Normal Weight";
			c.setCategory(cat);
			System.out.println();
			System.out.println("Your BMI is :"+bmi);
			System.out.println();
			System.out.println(GREEN+"--------Healthy Range--------"+RESET);
			System.out.println(GREEN+"Great work! Your BMI is within the recommended range. \nKeep maintaining your balanced nutrition \nand active lifestyle."+RESET);
			System.out.println();
			
			logic.normalPlan();

		} else if (bmi >= 25.0 && bmi < 29.9) {
			
			cat="Over Weight";
			c.setCategory(cat);
			System.out.println();
			System.out.println("Your BMI is :"+bmi);
			System.out.println();
			System.out.println(YELLOW+"--------Above Healthy Range--------"+RESET);
			System.out.println(YELLOW+"You're on your health journey! Focus on balanced\nnutrition, regular physical activity, and consistent\nhealthy habits to support your wellness goals."+RESET);
			System.out.println();
			
			logic.overWeightPlan();

		} else if (bmi > 35.0) {
			 cat="Obese";
			 c.setCategory(cat);
			System.out.println();
			System.out.println("Your BMI is :"+bmi);
			System.out.println();
			System.out.println(RED+"--------Higher BMI Range--------"+RESET);
			System.out.println(RED+"Every positive step counts! Focus on gradual,\nsustainable lifestyle changes and regular physical\nactivity to support your long-term health goals."+RESET);
			System.out.println();
			
			logic.obesePlan();

		}
		return bmi;
	}


}
