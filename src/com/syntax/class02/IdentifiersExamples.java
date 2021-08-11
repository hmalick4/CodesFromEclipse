package com.syntax.class02;

public class IdentifiersExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//RULES for identifiers: identifiers- name we give to classes, variables, and methods
		 /* keywords cannot be used as identifiers
		 * identifiers cannot begin with numbers
		 * identifiers cannot have special characters except: _ AND $
		 * 
		 * 
		 */
		char singleletter='c'; //no spaces between single letter
		//boolean new=true; //new is a keyword so cant use new as a value to declare true
		//int 1num=5; //error is that the identifier is beginning with a digit
		int num1=6; //valid
		
		boolean _boo=true; //valid
		double $price=2.99; //valid
		//byte #yo=4 //error 
				
		//preferences: 
				/* camelcasing bc its professional and makes reading easier
				* Java Classes should start with an upper case, and follow camel casing
				* variables and methods in java should begin with lowercase and follow camelcasing
				*/
		
		short thisismyhat=10; //should be thisIsMyHat (preferred)
		
	}

}
