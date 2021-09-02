package com.syntax.class15;

public class SplitMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="This is Batch 10 Batch 10 is great.";
		String[] strArr=str.split(" "); //splits each word based off of the space
		String[] strArrStrings=str.split("[.]"); //splits each word based on the period
		System.out.println(strArr[0]);
		System.out.println(strArr[3]);
		
		String [] strArray=str.split("");
	//	for (String string: strArray) {
	//		System.out.println(string);
		}
		
		
	}


