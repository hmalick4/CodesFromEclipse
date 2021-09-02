package com.syntax.class12;

public class Cat { //name of our class is CAT

	String name;
	String color;
	int age;
	
	void eat() { //behavior
		System.out.println(name+" is eating"); //behavior will include name of the cat
	}
	
	void sleep() {
		System.out.println(name+" is sleeping");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1= new Cat();
		cat1.name="Tom";
		cat1.color="Black";
		cat1.age=5;
		cat1.eat();
		cat1.sleep();
		
		//one more object of this class
		Cat cat2= new Cat();
		cat2.name="Jerry";
		cat2.color="white";
		cat2.age=2;
		cat2.eat();
		
		
		
	}

}
