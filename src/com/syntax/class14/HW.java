package com.syntax.class14;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Accept username, password and confirm password from a user and check following requirements:
			Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			Password should be minimum 8 characters, if less → message=”Password is too short”.
			Password cannot contain username if so, → message=”Password cannot contain username”.
			Password should match confirmed password, if not  → message=“Passwords do not match”.
			Only after all requirements met → message “Your username and password has been created”
		 */

		
	String username="hira";
	String password="jkjkjkjk";
	String confirmPassword="kjfiajf";
	
	if(!(username.isEmpty() || password.isEmpty())) {
		if(password.length()>=8) {
			if(!password.contains(username)) {
				if(password.equals(confirmPassword)) {
					System.out.println("Your username and password have been created.");
				}else {
					System.out.println("Passwords don't match.");
				}
			}else {
		System.out.println("Password can't contain username.");
	}
	} else {
		System.out.println("Password is too short.");
	}
	} else {
		System.out.println("Username or password can't be empty.");
	}
	}

	
		
/*
 * 
2. Write a program that reads two people's first names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
 * 
 */
	String dadsName="Ali"; 
	String momsName="Maria"; 
	String expectation="girl"; {
	
	if(expectation.equalsIgnoreCase("boy")) { 
		String firstHalf=dadsName.substring(0,dadsName.length()/2); 
		String secondHalf=momsName.substring(momsName.length()/2); 
		System.out.println(firstHalf+secondHalf); 
	}else { 
	String firstHalf=momsName.substring(0,momsName.length()/2); 
	String secondHalf=dadsName.substring(dadsName.length()/2); 
	System.out.println(firstHalf+secondHalf); 
	} 


	
/*
* 3. Create a string and if the String is not empty, perform the following:
* if the string has an odd number of characters and has three or more characters,
* print the character in the middle of the String.
* 
*/
		String name="hello";
		if(!name.isEmpty()) {

				if(name.length()>3 && name.length()%2!=0) {
					System.out.println();
						}
			}

/*
* 4. Create a String and print it in reverse order (sunday --> yadnus).
*/
//important bc could be an interview question!!!

			String name1="Sunday";
			String reversed=" ";

				for (int i=name1.length()-1; i>=0; i--){
					reversed+=name1.charAt(i);
				}
				System.out.println(reversed);


}
}
		


