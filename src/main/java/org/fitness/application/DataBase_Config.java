package org.fitness.application;

import org.fitness.application.entity.Normal_plan;
import org.fitness.application.entity.Obese_plan;
import org.fitness.application.entity.Overweight_plan;
import org.fitness.application.entity.Underweight_plan;
import org.fitness.application.entity.Userdata;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataBase_Config {
	private static SessionFactory ses;
	public static SessionFactory getConnect() {

	if(ses==null) {
		
			Configuration con = new Configuration();
			con.configure().addAnnotatedClass(Userdata.class).addAnnotatedClass(Underweight_plan.class)
					.addAnnotatedClass(Normal_plan.class).addAnnotatedClass(Overweight_plan.class)
					.addAnnotatedClass(Obese_plan.class);
		       ses = con.buildSessionFactory();

		}
	return ses;
	
	}
	
}
