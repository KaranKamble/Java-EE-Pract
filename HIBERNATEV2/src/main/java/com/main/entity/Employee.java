package com.main.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int empid;
	private String name;
	private float salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addrid")
	private Address address;
	
	public int getId() {
		return empid;
	}
	public void setId(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
	//	return "Customerr [id=" + id + ", name=" + name + ", city=" + city + "]";
		return String.format("%-5d%-10s%-10s", empid, name, salary);
	}
}
