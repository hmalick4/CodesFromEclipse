package com.syntax.class15;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I am a good tester. I am a good person.";
		System.out.println(str.replace("a", "A"));
		System.out.println(str.replace("good", "Naughty"));
		
		String str2="abcdefgABCDDDDDDDDEFGXYZxyzkdjkfaPPPLLJHHNJdjfoi3u92357932893urkdnfams@$*%$#$#";
		System.out.println(str2.replaceAll("[0-9]","-")); //will replace all the numbers from 0-9 in the string
		System.out.println(str2.replaceAll("[A-Z]","")); //will remove (and not replace) all the uppercase letters in the original string
		System.out.println(str2.replaceAll("[a-z]", "5"));
		System.out.println("----------------------------------");
		System.out.println(str2.replaceAll("[a-z5-9]", "")); //will remove all the lower case letters and numbers 5-9
		System.out.println(str2.replaceAll("[a-z5-9]", "")); //will remove all the lower case letters and numbers
		System.out.println(str2.replaceAll("[a-z5-9A-Z]", "-")); //will remove all the lower case letters and numbers
		System.out.println(str2.replaceAll("[^a-z5-9]", "")); //not operator inserted. so replace everything (special characters and some numbers) except what is written
		System.out.println(str2.replaceAll("[0-9]", "").replace("D", "B")); //chaining the conditions

		
		
		
		
	}

}
