package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//My name is ___ and my last name is __.
		
		String name="Hira";
		String lastname="Malick";
		String city="Chicago";
		String state="IL";
		char grade='A';
		String number="5555-5555";
		char sign='.';
		
		System.out.println("My name is "+name+" and my last name is " +lastname +sign);
		System.out.println("I live in "+city+" in the state of " +state +sign);
		System.out.println("And my telephone number is "+number+sign);
		
		city="nyc";
		state="NY";
		number="232432";
		grade='C';
		
		System.out.println("My name is "+name+" and I moved to "+city +" in "+state+sign);
		System.out.println("My number now is "+number+sign);
		System.out.println("I am now a "+grade+" student"+sign);
		//Then change all of the info and reprint.
	}

}
