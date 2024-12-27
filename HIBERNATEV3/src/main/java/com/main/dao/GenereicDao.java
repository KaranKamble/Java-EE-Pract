package com.main.dao;

import java.io.Closeable;
import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.main.utils.DBUtils;

public abstract class GenereicDao{

	protected EntityManager em;
	
	public GenereicDao() {
		this.em = DBUtils.getEntityManager();
	}
	
	public void save( Object obj ) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.persist(obj);
		tx.commit();
	}
	
	public void update( Object obj ) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.merge(obj);
		tx.commit();
	}

	public Object findByPK( Class clazz ,Object id) {
		return this.em.find(clazz, id);
	}
	
}
