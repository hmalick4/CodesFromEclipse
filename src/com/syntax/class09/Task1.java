package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * create an array of chars and store grades into it: A B C D E F.
		 * then print grade B
		 */
		
		System.out.println("------TASK 1---------");
		
		char[] grade= new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		int size=grade.length; //will tell you number of elements in the array.  length property is only with array variables.
		System.out.println("Number of elements in the array grade "+size);
		System.out.println(grade[1]);
		
		System.out.println("another way to list variables");
		
		char[] grades= {'A','B','C','D','E'};
		System.out.println(grades[1]);
		
		
		
		
		
	
		/*
		 * create an array of names and store all names.
		 * then print your name.
		 */
		
		System.out.println("-------TASK 2-------------");
		
		String[] name=new String[8];
		name[0]="Hira";
		name[1]="Mario";
		name[2]="Dinara";
		name[3]="Zied";
		name[4]="Rania";
		name[5]="Sampada";
		name[6]="Javed";
		name[7]="Abdul";

		System.out.println(name[0]);
		
		System.out.println("------ANOTHER WAY TO LIST VARIABLES---------");
		//declaration and storing values must be completed first
		String[] names= {"Hira", "Mario", "Dinara"};
		System.out.println(names[2]);
		names[1]="Zied"; //changing mario to zied
		
		System.out.println(names[1]);

		System.out.println("-------TASK 3------------");
		/*
		 * create an array of words: java, saturday, day, coding, is.
		 * print: saturday is java coding day.
		 */
		
		String[] words= {"java", "saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
	}

}
