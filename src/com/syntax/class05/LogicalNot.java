package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=!true;
		boolean a=!false;
		
		System.out.println(b); //false
		System.out.println(a); //true
		
		boolean hungry=true;
		
		if(hungry) {
			System.out.println("I am not hungry");
		}
		boolean hot=false;
		if(!hot) {
			System.out.println("I will go for a walk");
		}
		System.out.println("End of the class code");
		
		String name="asel";
		if(!name.equals("Stephanie")) {
			System.out.println("Then you are someone else.");
		}
				
				
				
				
	}

}
