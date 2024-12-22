package com.factory.component;

public class HelloWorld {

	public HelloWorld() {
		System.out.println("Inside HelloWorld() ctor...");
	}
	
	public void print( String name ) {
		System.out.println("Hello "+name+"...");
	}
}
