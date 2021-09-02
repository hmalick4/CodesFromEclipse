package com.syntax.class13;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student Michael=new Student();
		Michael.name="Michael";
		Michael.id="123";
		Michael.gender='M';
		Michael.school="Syntax";
		Michael.tuition=5;
		
		//methods aka behaviors
		Michael.study(); //calling a method is what this is called
		Michael.paysTuition();
		
		
	}

}
