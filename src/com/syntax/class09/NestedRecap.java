package com.syntax.class09;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=5; i++) {
			System.out.print("Loop P");
			
		for (int j=1; j<4; j++) {
			System.out.println("Loop j");
		}
		}
		
		//multiplication table
		System.out.println("-----------multiplication table---------");
		
		for (int a=1; a<=10; a++) {
			for(int b=1; b<=10; b++) {
				System.out.println(a+" X " +b +" = "+(a*b));
			}
		}
		System.out.println("--------------clock----------------");
		
		for (int h=00; h<=23; h++) {
			for (int m=00; m<=59; m++)
				System.out.println(h+":"+m);
		}
		System.out.println("-------another more accurate way for clock with extra 0s-------");
		///fix 00s in this
		for(int c=0; c<=23; c++) {
			for(int d=0; d<=59; d++) {
				if(c<= 9 && d<=0) {
					System.out.println("0" + c + ":0" + d);
				
				}else if(c<=9) {
					System.out.println(c + ":0"+ d);
				
				}else if(d<=9) {
					System.out.println("0"+ c + ":" + d);
				
				}else {
				System.out.println(c + ":" + d);
			}
			System.out.println();
		}
		
		
	}
System.out.println("------another example of clock--------------");

		
		String min = "", hour = "";
		
		for (int h = 0; h <=23; h++ ) {
			
			for (int m = 0; m <= 59; m++) {
				
				
				if (h<10) {
					hour = "0" + h;
				} else {
					hour = "" + h;
				}
					
				
				if (m<10) {
					min = "0" + m;
				} else {
					min = "" + m;
				}
				
				System.out.println(hour + ":" + min);
			}
		}

		System.out.println("---------what is the output------");

		for (int i=0; i<=3; i++) {
			System.out.println("Outer loop " +i);
			for (int j=0; j<3; j++) {
				System.out.println("inner loop "+j);
				break;
			}
		System.out.println("-----------");
		}
		boolean boo=true;
		
		for (int i=1; i<3; i++) {
			System.out.println("outer for loop" +i);
			while(boo) {
				System.out.println("i am nested while loop");
				break;
			} 
		}
		
		
		
		
		
} }
