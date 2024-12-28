package test.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import test.utils.DBUtil;

public abstract class GenericDao {

	protected EntityManager em;
	
	public GenericDao() {
		this.em = DBUtil.getEntityManager();
	}
	
	public void save( Object object ) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.merge(object);
		tx.commit();
	}
	
	public Object findByID( Class clazz, Object id ) {
		return this.em.find(clazz, id);
	}
}
