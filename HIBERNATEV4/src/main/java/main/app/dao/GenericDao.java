package main.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import main.app.utils.DBUtil;

public abstract class GenericDao {

	protected EntityManager em;

	public GenericDao() {
		this.em = DBUtil.getEntityManager();
	}

	public void save(Object obj) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.persist(obj);
		tx.commit();
	}

	public void update(Object obj) {
		EntityTransaction tx = this.em.getTransaction();
		tx.begin();
		this.em.merge(obj);
		tx.commit();
	}

	public Object findByPK(Class clazz, Object id) {
		return this.em.find(clazz, id);
	}

}
