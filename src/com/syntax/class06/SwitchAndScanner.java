package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * i want to ask, where are you from?
		 * based on the country, what is your traditional food?
		 */
		
		Scanner in;
		in=new Scanner(System.in);
		String country, traditionalFood;
		
		System.out.println("Which country are you from?");
		country=in.nextLine();
		
		switch (country) {
		case "USA":
			traditionalFood="burger";
			break;
		case "Afghanistan":
			traditionalFood="qabeli pulao";
			break;
		case "Peru":
			traditionalFood="ceviche";
			break;
		case "Italy":
			traditionalFood="pasta";
			break;
		case "Tajikistan":
			traditionalFood="pasta";
			break;
		case "Turkey":
			traditionalFood="borek";
			break;
		case "Kazakhstan":
			traditionalFood="beshbarmak";
			break;
		default:
			traditionalFood="unknown";
		}
		System.out.println("You are from " +country +" and your traditional food is " +traditionalFood +".");
	
			
		
	}
	}

