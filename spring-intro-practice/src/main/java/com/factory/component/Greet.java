package com.factory.component;

import org.springframework.stereotype.Component;

@Component("greet")
public class Greet {

	public Greet() {
		System.out.println("Inside Greet() ctor... ");
	}
	
	public void sayGreet( String name ) {
		System.out.println("Nice to meet you "+name+"...");

	}
}
