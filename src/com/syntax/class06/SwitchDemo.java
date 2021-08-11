package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if statements are like a ladder or stairs
		int day=5;
		if (day==1) {
			System.out.println("Today is Monday");
		}else {
			System.out.println("Today is not Monday");
		}
		
		System.out.println("--------USING SWITCH STATEMENT");
		//switch is a value-based statement. it finds matching value cases and jumps on it right away. doesnt evaluate conditions.
		//switch statemnts are like an elevator.
		//always remember: variable type and case values MUST be of the same datatype
		//always use break to stop execution and get out of the switch block
		//default is optional in switch case
		String dayName;
		
		switch(day) {
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		default: //works like the else block
			dayName="Invalid";
			break;
		}
		System.out.println("Today is "+dayName);
	}

}
