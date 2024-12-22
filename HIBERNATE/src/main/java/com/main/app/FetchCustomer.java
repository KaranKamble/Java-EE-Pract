package com.main.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.main.entity.Customerr;

public class FetchCustomer {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HIBERNATE");
		EntityManager em = emf.createEntityManager();
		Customerr c = em.find(Customerr.class, 2);
		System.out.println("Id "+c.getId());
		System.out.println("name "+c.getName());
		System.out.println("city"+c.getCity());
	}

}
