package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customerr {

	@Id
	private int id;
	private String name;
	private String city;
	
	public Customerr() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
	//	return "Customerr [id=" + id + ", name=" + name + ", city=" + city + "]";
		return String.format("%-5d%-10s%-10s", id, name, city);
	}
	
	
}
