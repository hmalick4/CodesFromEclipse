package com.syntax.class13;

public class HWTask1Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HWTask1 task1=new HWTask1();
		
		task1.printGreater(5, 6);
		task1.oddOrEven(12);
		task1.printHello("USA");
		System.out.println(task1.createEmail("Bugs", "Bunny", "gmail"));		
		System.out.println(task1.createEmail("Olena", "Bogdan", "yahoo"));
	
		System.out.println("-------");
		System.out.println(task1.prime(4));
		
		System.out.println(task1.getGrade(72));
	}

	
}
