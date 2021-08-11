package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine = false; // change output to test different outputs

		boolean secondDose = false;

		if (vaccine) { // yes
			System.out.println("Lets see how many doses you got");
		}
		if (secondDose) {
			System.out.println("You are fully vaccinated");
		} else {
			System.out.println("You will need a second dose");
		}
		System.out.println("End of outer block");
		System.out.println("End of code");

		System.out.println("______________ANOTHER EXAMPLE OF NESTED IF______________");

		/*
		 * every friday is movie day. then check if its 13th bc want to watch a scary movie.
		 * 
		 */
		
		boolean friday=true;
		int day=13;
		
		if (friday) {
			System.out.println("I will watch a movie"); //conditional so add nested if block
		if (day==13) {
			System.out.println("I will watch a scary movie");
			} else {
				System.out.println("I am watching whatever is popular");
			} 
		} else {
		System.out.println("I will study");
		}
	}
} 
