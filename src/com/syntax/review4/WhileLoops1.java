package com.syntax.review4;

public class WhileLoops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int d=0;
		while(d<5) {
			System.out.println("Batch 10 is great.");
			++d;
			
			
			System.out.println("----");
			//file saved as while loop 2 in class code
			int f=0;
			while(f<10) {
				f++;
				System.out.println(f); //prints 1-10 bc f++ makes 1 print first bc its BEFORE syso
			}
			
			System.out.println("------------");
			//below file is saved as while loop3 in class code
			
			int x=10;
			while (x>0) {
				System.out.println(x);
				x--; //prints 10-1
			}
			
		}
		
	}

}
