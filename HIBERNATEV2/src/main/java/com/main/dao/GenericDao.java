package com.main.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.main.utils.DBUtils;

public abstract class GenericDao {

	private EntityManager em;

	public GenericDao() {
		this.em = DBUtils.getEntityManager();
	}

	public void save(Object obj) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
	//	this.em.persist(obj);
		this.em.merge(obj);
		tx.commit();	
	}
	
	public Object findByPK(Class clazz, Object id ) {
		return this.em.find(clazz, id);
	}
}
