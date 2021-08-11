package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-------TASK 1---------");
		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

		String[] cars= {"Tesla", "Audi", "Kia", "Honda", "Toyota", "Porche"};
		for(String car:cars) {
		System.out.println("advanced loop way: "+car);
		}
	
		
		String[] car2=new String [6];
		car2[0]="Tesla";
		car2[1]="Audi";
		car2[2]="Kia";
		car2[3]="Honda";
		car2[4]="Toyota";
		car2[5]="Porche";
		
		for(int i=0; i<car2.length; i++) {
		System.out.println("for loop way: " +(car2[i]));
		}
		
	
		
		System.out.println("-------TASK 2---------");
		/*Create an array of animals and store 6 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */

		String[] animal= {"panda", "tiger", "elephant", "giraffe", "eagle", "doplhin"};
		
		for(String animals:animal) {
			System.out.println("advanced loop way: "+animals);
		}
		
		for(int a=0; a<animal.length; a++) {
			System.out.println("for loop way: "+(animal[a]));
		}
		
		
		System.out.println("-------TASK 3---------");
		//Create an array to store double values and then print those in reverse order

		double[] value= {1.99, 2.99, 3.99, 4.99};
		
		for(int x=0; x<=value.length-1; x--) {
			System.out.println(value[x]);
		}
	
				
				
		System.out.println("-------TASK 4---------");
		//Create an array on integers and calculate the sum of all elements in an array.
		int summary = 0;
		int[] num = { 10, 20, 50, 60, 80, 90 };
		for (int k = 0; k < num.length; k++) {
			summary += num[k];
		}
		System.out.println(summary);
		System.out.println();
		
		//sum using enhanced loop
		for(int sum:summary) {
			sum+=
		}//finsih
		
		
		System.out.println("-------TASK 5---------");
		//From an array of integer elements find the largest number.

		int[] numm= {3,4,5,6,7,8};
		int largest=num[0];
		
		for(int i=1; i<numm.length; i++) {
			if(numm[i]>largest) {
		}
		
	}
		System.out.println(largest);
		
		System.out.println("--------------using enhanced loop");
		
		largest=num[0];
		for(int n:numm) {
			if(n>largest) {
				largest=n;
				
				//finish
				
				
				
			}
		
	}
	
	}  }
