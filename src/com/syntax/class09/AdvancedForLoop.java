package com.syntax.class09;

public class AdvancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("----------numbers array-------------");
		int[] numbers= {100, 20, 67, 45, 90, 23};
		
		//regular for loop
		for(int c=0; c<numbers.length; c++) {
			System.out.println(numbers[c]);
		}
		
		System.out.println("----------advance for loop/enhanced for loop/for each loop-----");
		for(int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println("---------CHAR ARRAY----------------");
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};

		for(char grade:grades) {
			System.out.println(grade +" ");
		}
		//loops are only in ONE DIRECTION. cant read them backwards, unless you do this..
		System.out.println("I want to print my values backwards");
		
		for(int i=grades.length-1; i>=0; i--) {
			System.out.println(grades[i]);
		}
		
	}

}
