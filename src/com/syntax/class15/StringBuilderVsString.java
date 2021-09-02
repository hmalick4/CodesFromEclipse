package com.syntax.class15;

public class StringBuilderVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="ABCD";
		System.out.println(str.concat("Z")); //displaying results, NOT storing them in memory
		System.out.println(str); //original value is still present bc str not stored in memory. string is immutable
		System.out.println("--------------");
		
		StringBuilder str2=new StringBuilder("ABCD");
		System.out.println(str2.append("Z2")); //append in stringBuilder=concat in String. same thing, different language in both classes
		System.out.println(str2); //original variable has been changed bc stringbuilder is mutable. can safely change teh data
		
		StringBuilder str3=new StringBuilder("Sunday");
		System.out.println(str3.reverse());
		
		String name="Ali";
		StringBuilder str4=new StringBuilder(name); //converting a String to a StringBuilder
		System.out.println(str4);
		
		name=str4.toString(); //converting a StringBuilder to String
		System.out.println(name);
		
		
		
	}

}
