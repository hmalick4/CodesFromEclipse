package com.syntax.class04;

public class AnotherNestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * quiz. did you take it?
		 * if grade is more than 90, earn an A
		 * if grade is more than 80, earn a B
		 * if grade is more than 70, earn a C
		 * otherwise: you should study more for a test
		 */
		
		boolean test=true;
		int score=95;
		
		if (test) {
			System.out.println("Let's check your grade.");
			if(score>90) {
				System.out.println("A Student");
			} else if (score>80) {
				System.out.println("B Student");
			} else 
				System.out.println("Please study.");
			
		} else {
			System.out.println("You should have taken the test.");
		}
		
		
	}

}
