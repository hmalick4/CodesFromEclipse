package com.syntax.class12;

public class Dog {

	//creating a class dog
	
	//define attributes of the dog
	String name; 
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
//writing void is for not returning a value
	void bark() {
		System.out.println("Dog can bark");
	}
	
	void sleep() {
		System.out.println("Dog can sleep");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating an object called dog1
		Dog dog1= new Dog ();
		
		dog1.name="james";
		dog1.breed="bull dog";
		dog1.color="grey";
		dog1.age=20;
		dog1.height=15;
		dog1.gender='m';
		
		dog1.bark(); //wrote this method which is why it prints when written here
		dog1.sleep();
		
		
		Dog dog2= new Dog();
		dog2.name="Bongo";
		dog2.breed="shitzu";
		dog2.color="blue";
		dog2.age=5;
		dog2.height=80;
		dog2.gender='f';
		
		dog2.bark();
		
	}

}
