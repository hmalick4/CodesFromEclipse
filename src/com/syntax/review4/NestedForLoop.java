package com.syntax.review4;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		for(int i=0; i<10; i++) {
			x=i;
			while(x<5) {
				System.out.println(x);
				x++;
			}
			
			System.out.println("--------");
			//saved as nested forloop2 in class codes
			for (int d=0; d<2; d++) {
				System.out.println(d);
				for(int j=0; j<2; j++) {
					System.out.println(j);
				}
			}
		}
		
	}

}
