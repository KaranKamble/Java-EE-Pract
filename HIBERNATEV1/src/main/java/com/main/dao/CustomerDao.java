package com.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.main.entity.Customerr;

public class CustomerDao {
	private EntityManager em;
	
	public CustomerDao() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HIBERNATEV1");
		this.em = emf.createEntityManager();
	}
	
	public void store( Customerr c ) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.persist(c);
		tx.commit();
	}
	
	public Customerr getCustomerById( int id ) {
		return this.em.find(Customerr.class, id);
	}
	
	public List<Customerr> getAllCustomer(){
		Query q = this.em.createQuery("select c from Customerr c");
		return q.getResultList();
	}
	
	public void delete(Customerr c ) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.remove(c);
		tx.commit();
	}
	
	public void update(Customerr c) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.merge(c);
		tx.commit();
	}
	
	public List<Customerr> findByCity( String city ){
		Query q = this.em.createQuery("select c from Customerr c where c.city = '"+city+"'");
		return q.getResultList();
	}
}
