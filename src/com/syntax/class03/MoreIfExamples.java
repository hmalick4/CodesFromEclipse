package com.syntax.class03;

public class MoreIfExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double temp=70;
		if (temp<32) {
			System.out.println("Water will freeze with temperature" +temp);
			
		} else {
			System.out.println("water will not freeze with temperature" +temp);
			System.out.println("Because it is warm outside");;
		}
		
		System.out.println("____________________________");
		
		boolean isBreakTime=true;
		
		if (isBreakTime==true) {
			System.out.println("I am getting food");
		}else {
		System.out.println("I am focusing on the class");
		
		}
	}
}
