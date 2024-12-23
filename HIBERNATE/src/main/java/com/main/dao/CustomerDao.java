package com.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.main.entity.Customerr;

public class CustomerDao {
	private EntityManager em;
	
	public CustomerDao() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HIBERNATE");
		 this.em = emf.createEntityManager();
	}
	
	public void store( Customerr customerr) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.persist(customerr);
		tx.commit();
	}
	
	public Customerr getCustomer(int id) {
		return this.em.find(Customerr.class, id);
	}
	
	
}
