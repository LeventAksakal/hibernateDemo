package com.hibernate;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();

//			City city = session.get(City.class, 4102);
//			session.delete(city);
//			System.out.println("Deleted");
			
//			City city = session.get(City.class, 4102);
//			city.setName("Baynburp");
//			session.save(city);
//			System.out.println("Updated");
			
//			City city = new City("Bayburt","TUR","Bayburt", 82274);
//			session.save(city);
//			System.out.println("Þehir eklendi " + cityy.getName());
			
//			List<City> cities = session.createQuery("from City c where c.countryCode='TUR'").getResultList();
//			
//			for(City city:cities) {
//				System.out.println(city.getId() + " " + city.getName());
//			}
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.getMessage();
		}finally {
			session.close();
			factory.close();
		}
	}

}
