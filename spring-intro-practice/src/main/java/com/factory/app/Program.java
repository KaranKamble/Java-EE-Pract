package com.factory.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.factory.component.Greet;
import com.factory.component.HelloWorld;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-confing.xml");
		
//		HelloWorld hello = ( HelloWorld )ctx.getBean("hello");
//		hello.print("Karan");
//		hello.print("Karan");
		
//		for( int i = 0; i <= 5; i ++ ) {
//			HelloWorld hello = ( HelloWorld )ctx.getBean("hello");
//			hello.print("Karan");
//		}
		
		Greet greet = ( Greet )ctx.getBean("greet");
		greet.sayGreet("Satya");
	}

}
