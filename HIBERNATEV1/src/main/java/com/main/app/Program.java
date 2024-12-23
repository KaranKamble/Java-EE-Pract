package com.main.app;

import java.util.List;

import com.main.dao.CustomerDao;
import com.main.entity.Customerr;

public class Program {
	
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		List<Customerr> list = dao.findByCity("pune");
		for( Customerr customerr : list )
			System.out.println(customerr);
	}
	
	
	public static void main5(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customerr c = dao.getCustomerById(5);
		dao.delete(c);
	}
	
	public static void main4(String[] args) {
		//  Update
		CustomerDao dao = new CustomerDao();
		Customerr c = dao.getCustomerById(2);
		c.setCity("Delhi");
		dao.update(c);
	}
		
	public static void main3(String[] args) {
		CustomerDao dao = new CustomerDao();
		List<Customerr> list = dao.getAllCustomer();
		for( Customerr customerr : list )
			System.out.println(customerr);
	}

	public static void main2(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customerr c = dao.getCustomerById(2);
		System.out.println(c);
	}
	
	public static void main1(String[] args) {
		CustomerDao dao = new CustomerDao();
		Customerr customerr = new Customerr();
		customerr.setId(5);
		customerr.setName("Ram");
		customerr.setCity("pune");
		dao.store(customerr);

	}

}
