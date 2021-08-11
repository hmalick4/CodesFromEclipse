package com.syntax.class06;

public class SwitchExample {

	public static void main(String [] args) {
		
		char gender='M';
				
				switch (gender) {
					case 'M':
						System.out.println("Male");
						break;
					case 'F': //cant put M again and have same case
						System.out.println("Female");
						break;
					default:
						System.out.println("Other");
						break;
					
				}
				System.out.println(" ---- LIMITATIONS ----");
				//boolean boo=true;
				////switch(boo) {
				////}double d=1.99;
				//switch (d) {
				
	}}
