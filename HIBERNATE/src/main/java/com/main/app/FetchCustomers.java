package com.main.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.main.entity.Customerr;

public class FetchCustomers {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HIBERNATE");
		EntityManager em = emf.createEntityManager();
		
	//	Query q = em.createQuery("select c from Customerr c ");
		
	//	Query q = em.createQuery("select c from Customerr c where c.city = 'pune'");
		
	//	Query q = em.createQuery("select c from Customerr c where c.name like 'ya%'");
		
		Query q = em.createQuery("select c from Customerr c where c.city = :ct ");
		q.setParameter("ct", "pune");
		
		List<Customerr> list = q.getResultList();
		for( Customerr customerr : list)
			System.out.println(customerr);
	}
}
