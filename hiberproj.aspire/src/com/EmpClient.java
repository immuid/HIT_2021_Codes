package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmpClient {
	public static void main(String[] args) {
		//Step 1 - Load the configuration
		//new AnnotationConfiguration().configure();
		Configuration cfg=new Configuration().configure("hibernate.anno.cfg.xml");
		
		//Step 2 - Load the session factory
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Step 3
		
		Session session=factory.openSession();
		
		EmployeeDTO emp=new EmployeeDTO();
		emp.setEid(200);
		emp.setEname("ram");
		emp.setEpass("spider");
		emp.setSalary(100000);
		
		Transaction tx=session.beginTransaction();
		session.save(emp);
		
		tx.commit();
	}
}
