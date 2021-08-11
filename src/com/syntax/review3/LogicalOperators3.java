package com.syntax.review3;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
		
		String userName="Maria";
		String password="pass123";
		double availableFunds=100000;
		
		if(userName.equals("Maria") && password.equals("pass123")) {

			System.out.println("Enter the amount of money you want to transfer");
			Scanner scanner=new Scanner(System.in);
			double amountToTransfer=scanner.nextDouble();
			if(amountToTransfer<availableFunds) {
				System.out.println("Transfer successful");
			
			}else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
}