package com.main.dao;

import java.util.List;

import javax.persistence.Query;

import com.main.entity.Employee;

public class EmployeeAddressDao extends GenereicDao{

	public List<Employee> findByName(String name) {
		Query q = super.em.createQuery("select e from Employee e where e.name = '"+name+"'");
		return q.getResultList();
	}
}
