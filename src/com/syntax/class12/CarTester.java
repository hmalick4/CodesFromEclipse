package com.syntax.class12;

public class CarTester {

	public static void main(String[] args) { //need to have main method in order to execute
		// TODO Auto-generated method stub

		
		Car car1=new Car();
		
		car1.make="Toyota";
		car1.model="Rav4";
		car1.color="blue";
		car1.year=2020;
		
		System.out.println("I have a "+car1.make);
		car1.moveBackward();
		
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="Model3";
		car2.color="white";
		car2.year=2021;
		
		System.out.println("I want a "+car2.make);
		
		
	}

}
