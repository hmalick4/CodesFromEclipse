package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * create an array of cars and store 6 elements into it.
		 * print all the values from the array.
		 */
		
		System.out.println("-----CARS ARRAY---------");
		String[] car= {"Merc", "Beamer", "Honda", "Audi", "Ford", "Toyota"};
		int size=car.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(car[i]);
		}
		
		System.out.println("------Advanced for loop/enhanced loop/ for each loop----");
		for(String car1:car) {
		System.out.println(car1);
		}
		
		
		
		
		
	}


}
