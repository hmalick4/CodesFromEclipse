package com.syntax.class02;

public class MathTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1, num2;
		
		num1=15.5f;
		num2=20.5f;		
		
		double sum=(num1+num2);
		double result=(num2-num1);
		double product=(num1*num2);
		double quotient=(num1/num2);
		char period='.';
		
		System.out.println("The sum of to two numbers "+num1+ " and "+num2+" is euqal to "+sum+period);
		System.out.println("The result of two numbers "+num1+ " and "+num2+ " is equal to " +result+period);
		System.out.println("The product of two numbers "+num1+" and "+num2+" is euqal to " +product+period);
		System.out.println("The quotient of two numbers "+num1+" and "+num2+" is equal to "+quotient+period);
		
		
		double num3=3.9;
		double square=3.9*3.9;
		
		System.out.println("The square of "+num3+" is "+square+period);
		
		int width, height;
		width=5;
		height=8;
		
		int perimeter=width+width+height+height;
		int area=width*height;
		
		System.out.println("The perimeter of a rectangle with width "+width+" and " +height+" is "+perimeter+" and the area is "+area+period);
	}

}
