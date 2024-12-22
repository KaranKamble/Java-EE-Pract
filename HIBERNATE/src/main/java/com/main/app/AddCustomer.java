package com.main.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.main.entity.Customerr;

public class AddCustomer {

	public static void main1(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HIBERNATE");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customerr c = new Customerr();
		c.setId(4);
		c.setName("raghav");
		c.setCity("mumbai");
		
		em.persist(c);
		tx.commit();
		emf.close();
	}

}
