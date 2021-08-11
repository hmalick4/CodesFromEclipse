package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//one way to declare and initialize array:
		String[]array =new String[3];
		array[0]="Hello";
		array[1]="Hi";
		
		
		//another way to declare and initialize:
		String a[]=new String[2];
		System.out.println(a.length); //no values stored so compiler will add default values
		
		//syso(array3)---gives out of bounds error
		
		System.out.println(array[2]); //null is default value
		int size=array.length;
		System.out.println(size);

		array[2]="How are you?";
		System.out.println(array[2]); //how are you
		
		for(int i=0; i<array.length; i++); {
			System.out.print(array[i]+"; ");
		}
		
		System.out.println("-------------------");
		for(String arr:array) {
			System.out.println(arr+"; ");
		}
		
	}

}
