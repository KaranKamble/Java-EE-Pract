package com.main;

import com.main.dao.EmployeeDao;
import com.main.entity.Address;
import com.main.entity.Employee;

public class Program {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDao();
		
//		Employee emp = new Employee();
//		emp.setName("Yarah");
//		emp.setSalary(45000);
//		dao.save(emp);
		
		Employee emp = ( Employee )dao.findByPK(Employee.class, 7);
		Address address = new Address();
		address.setCity("Bandra");
		address.setState("MH");
		dao.save(address);
		
		emp.setAddress(address);
		dao.save(emp);
		
	}
}
