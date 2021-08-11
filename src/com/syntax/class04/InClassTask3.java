package com.syntax.class04;

public class InClassTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a Java program and call it a Donor.
		 * 
		 *In order to be eligible to donate your blood you have to be 18 years old. 
		 *Also once you identify age eligibility then we have to see if person matches weight 
		 *requirements. If person weight it more than 110 lbs → then he/she is eligible, 
		 *otherwise we cannot accept such a patient.
		 * 
		 */

	int age=20;
	double weight=160;
	
	if (age>=18) {
		System.out.println("Let's check if you meet the remaining requirements.");
		
		System.out.println("You can be a donor.");
	} else {
		System.out.println("You cannot donate blood.");
	}
	
	
	
	
}
}