package com.syntax.class02;

public class HomeworkClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare variable and increase by first 500 and then 200 using shorthand
				// operator.
				int num1=1;
				num1+=500;
				System.out.println(num1);
				num1+=200;
				System.out.println(num1);
				// Declare variable and decrease by 60 using shorthand operator
				int num2=100;
				num2-=60;
				System.out.println(num2);
		// Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
				int cakePiece=11;
				cakePiece/=4;
				System.out.println(cakePiece);
		//Declare variable cake=25 and divide cake between 7 people.
				int cake=25;
				cake/=7;
				System.out.println(cake);
		//found out how many pieces of cake left after it was distributed equally among 7 people
				cake%=7;
				int extra=25%7;
				System.out.println(extra);
		
		
		
		
	}

}
