package com.main;

import com.main.dao.EmployeeAddressDao;
import com.main.dao.GenereicDao;
import com.main.entity.Address;
import com.main.entity.Employee;

public class Program {

	public static void main(String[] args) {
		
		GenereicDao dao = new EmployeeAddressDao();
		
//		Employee emp = new Employee();
//		emp.setName("Yarah");
//		emp.setEmail("yarah@outlook.com");
//		dao.save(emp);
		
//		Employee emp = ( Employee )dao.findByPK(Employee.class, 2);
//		
//		Address address = new Address();
//		address.setCity("Pune");
//		address.setPincode("337274");
//		dao.save(address);
//		
//		emp.setAddress(address);
//		dao.update(emp);
		
		
		Employee emp = new Employee();
		emp.setName("Satya");
		emp.setEmail("satya@yahoo.com");
		
		Address address = new Address();
		address.setCity("Mumbai");
		address.setPincode("276233");
		
		emp.setAddress(address);
		dao.save(emp);
		
	}

}
