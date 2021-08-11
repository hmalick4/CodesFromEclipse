package com.syntax.review2;

import java.util.Scanner;

public class IfElseConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String storedUserName="Sharif";
		String storedPassword="pass123";
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your username.");
		String userName=scanner.nextLine();
		System.out.println("Please enter your password.");
		String password=scanner.nextLine();
		if(storedUserName.equals(userName)) {
			System.out.println("Correct username");
		if (storedPassword.equals(password)) {
			System.out.println("Password is also correct.");
		}else {
			System.out.println("Username is correct but password is not.");
		}
		
		
		} else {
			System.out.println("Username is not correct.");
		
		
		
	}

} }
