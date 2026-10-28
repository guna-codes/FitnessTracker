package org.fitness.application.logics;

import java.util.List;
import org.fitness.application.DataBase_Config;
import org.fitness.application.entity.Normal_plan;
import org.fitness.application.entity.Obese_plan;
import org.fitness.application.entity.Overweight_plan;
import org.fitness.application.entity.Underweight_plan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CoreLogic {

	// =======================Logic For
	// UnderWeight======================================

	public void underweight() throws InterruptedException {
		SessionFactory s = DataBase_Config.getConnect();
		Session ses = s.openSession();

		String CYAN = "\u001B[36m";
		String RESET = "\u001B[0m";

		List<Underweight_plan> list = ses.createQuery("from Underweight_plan", Underweight_plan.class).getResultList();
		System.out.println();
		Thread.sleep(1000);
		System.out.println(CYAN
				+ "-------------------UNDERWEIGHT (BMI below 18.5) : weight gain, 2400-2600 kcal--------------------"
				+ RESET);
		Thread.sleep(1000);
		System.out.println();

		System.out.println(".____.______________________________________________________________.________________.");
		System.out.println(CYAN
				+ "| NO |                         FOOD ITEMS                           |    MEAL TIME   |" + RESET);

		for (Underweight_plan show : list) {
			String food = show.getFood_items();
			if (food.length() > 60) {
				food = food.substring(0, 30);
			}
			System.out
					.println(".____.______________________________________________________________.________________.");
			System.out.printf(CYAN + "| %-2s |  %-60s | %-14s |%n" + RESET, show.getId(), food, show.getMeal_time());

		}
		System.out.println(".____.______________________________________________________________.________________.");

	}

	// =======================Logic For
	// NormalWeight======================================

	public void normalPlan() {
		SessionFactory s = DataBase_Config.getConnect();
		Session ses = s.openSession();
		String GREEN = "\u001B[32m";
		String RESET = "\u001B[0m";

		List<Normal_plan> list = ses.createQuery("from Normal_plan", Normal_plan.class).getResultList();
		System.out.println();
		System.out.println(GREEN
				+ "-------------------NORMAL (BMI 18.5-24.9) : maintain, 2000 kcal----------------------" + RESET);
		System.out.println();

		System.out.println(".____.______________________________________________________________.________________.");
		System.out.println(GREEN
				+ "| NO |                         FOOD ITEMS                           |    MEAL TIME   |" + RESET);

		for (Normal_plan show : list) {
			String food = show.getFoodItems();
			if (food.length() > 60) {
				food = food.substring(0, 30);
			}
			System.out
					.println(".____.______________________________________________________________.________________.");
			System.out.printf(GREEN + "| %-2s |  %-60s | %-14s |%n" + RESET, show.getId(), food, show.getMealTime());

		}
		System.out.println(".____.______________________________________________________________.________________.");
	}

	// =======================Logic For
	// OverWeight======================================

	public void overWeightPlan() {
		SessionFactory s = DataBase_Config.getConnect();
		Session ses = s.openSession();
		String YELLOW = "\u001B[33m";
		String RESET = "\u001B[0m";

		List<Overweight_plan> list = ses.createQuery("from Overweight_plan", Overweight_plan.class).getResultList();
		System.out.println();
		System.out.println(YELLOW
				+ "-----------------OVERWEIGHT (BMI 25-29.9) : gradual fat loss, 1600-1700 kcal--------------------"
				+ RESET);
		System.out.println();

		System.out.println(".____.______________________________________________________________.________________.");
		System.out.println(YELLOW
				+ "| NO |                         FOOD ITEMS                           |    MEAL TIME   |" + RESET);

		for (Overweight_plan show : list) {
			String food = show.getFoodItems();
			if (food.length() > 60) {
				food = food.substring(0, 30);
			}
			System.out
					.println(".____.______________________________________________________________.________________.");
			System.out.printf(YELLOW + "| %-2s |  %-60s | %-14s |%n" + RESET, show.getId(), food, show.getMealTime());

		}
		System.out.println(".____.______________________________________________________________.________________.");
	}

	// =======================Logic For Obese======================================

	public void obesePlan() {
		SessionFactory s = DataBase_Config.getConnect();
		Session ses = s.openSession();
		String RED = "\u001B[31m";
		String RESET = "\u001B[0m";

		List<Obese_plan> list = ses.createQuery("from Obese_plan", Obese_plan.class).getResultList();
		System.out.println();
		System.out.println(RED
				+ "-----------------OBESE (BMI 30 and above) : steady weight loss, 1400-1500 kcal--------------------"
				+ RESET);
		System.out.println();

		System.out.println(".____.______________________________________________________________.________________.");
		System.out.println(
				RED + "| NO |                         FOOD ITEMS                           |    MEAL TIME   |" + RESET);

		for (Obese_plan show : list) {
			String food = show.getFoodItem();
			if (food.length() > 60) {
				food = food.substring(0, 30);
			}
			System.out
					.println(".____.______________________________________________________________.________________.");
			System.out.printf(RED + "| %-2s |  %-60s | %-14s |%n" + RESET, show.getId(), food, show.getMealTime());

		}
		System.out.println(".____.______________________________________________________________.________________.");

	}

}
