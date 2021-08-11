package com.syntax.class02;

public class ShortHandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=20;
		num=num+100; //took same number and performing operation and reassigning for same variable
		//num+=100 is shorthand  way. 1 step		
		
		System.out.println(num); //120
		
		num=num-60;
		System.out.println(num); //60
				
	
		int number=100; //take this and add or subtract. use shorthandoperator
		number+=100; //part1 long way
		System.out.println(number); //part2 long way 200
		
		number-=30; //shortcut: number-30
		System.out.println(number); //170
		
		
		number/=10;
		System.out.println(number); //17
		
		number*=2; //number=number*2
		System.out.println(number); //34
		
		
	}

	
}
