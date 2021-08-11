package com.syntax.class04;

import java.util.Scanner; //shortcut to import is cmd+shift+0  windows ctrl+shift+o

public class ExampleOfScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Hira";
		System.out.println(name); //hard code
		
		
		Scanner scan=new Scanner(System.in); //memorize. first line in scanner
		System.out.println("Please enter your name.");
		//capture string values and store it inside variable values
		String value=scan.nextLine();
		
		System.out.println("I captured "+value); //dynamic code. user is supplying values
	}

}
