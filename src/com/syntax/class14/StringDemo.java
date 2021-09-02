package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hi="Hello";
		
		String hi2=new String("Hello"); 
		//creating an object of string data type up above.
		
		//STRING METHODS
		
		System.out.println(hi.length()); //length method. gives number of characters present in string.
		
		String name="JACKSON";
		System.out.println(name.toLowerCase()); //converts to lowercase
		
		String name2="khan5"; 
		System.out.println(name2.toUpperCase()); //converts to uppercase. numbers printed as is.
		
		String firstName="Bugs";
		String lastName=" Bunny";
		System.out.println(firstName.concat(" ").concat(lastName)); //combines both );
		//plus + is used more often in the industry. two concat bc added space
		
		String name3="bubble";
		System.out.println(name3.toUpperCase());
		
		System.out.println(hi.length()); //prints 5
	}

}
