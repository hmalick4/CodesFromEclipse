package com.syntax.class13;

public class Calculator {

	
	void add(int a, int b) { //passing multiple parameters to the method
		System.out.println(a+b);
	}
	
	void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	void multiply(int a, int b) {
		int result=a*b;
		System.out.println(result);
	}
	
	void divide(int a, int b) {
		System.out.println(a/b);
	}
	
}
