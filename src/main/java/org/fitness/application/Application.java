package org.fitness.application;

import org.fitness.application.entity.Userdata;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		Getting_Data gd = new Getting_Data();
		SessionFactory s = DataBase_Config.getConnect();
		Session ses = s.openSession();
		Transaction t = ses.beginTransaction();
		Userdata data = gd.inputData();
        ses.persist(data);
		t.commit();  
	}

}
