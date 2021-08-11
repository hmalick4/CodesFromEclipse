package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create an array to store four elements of decimal values
		
		double[] d=new double[4]; 
		//d[0]=0 will be default if not written in code. have to still store FOUR elements
		d[1]=10.99;
		d[2]=12.99;
		d[3]=10;
		
		
		System.out.println(d[3]);
		
		
		int[] numbers=new int[2];
		numbers[0]=100;
		numbers[1]=200;
		
		System.out.println(numbers[1]);
		
		//preferred and not preferred ways of declaring variables
		
		
		int num;//declare a variable
		int arrayVar[]; //declare an array
		int[] arr;
		
		num=10;
		arr=new int[3]; //initialize number of elements
		
	}

}
