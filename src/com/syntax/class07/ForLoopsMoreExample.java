package com.syntax.class07;

public class ForLoopsMoreExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * i want to print a multiplication table
		 */
		
		int num=3;
		
		for (int i=1; i<=10; i++) {
			System.out.println(num+"X" +i+"="+num*i);
		}
		
		System.out.println("What is the output?");
		int sum=0;
				for (int i=1; i<=5; i++) {
					sum=sum+i;
				}
		System.out.println(sum);//15
			
		System.out.println("What is the output this time?");
			sum=0;
			
			for (int i=0; i<=40; i+=10) {
				sum+=1;
			}
			System.out.println(sum);
			
			System.out.println("What is the output the third time?");
			int total=1;
			
			for(int i=1; i<10; i++) {
				total*=i;
			}
			System.out.println(total);
			
			
			}
	}


