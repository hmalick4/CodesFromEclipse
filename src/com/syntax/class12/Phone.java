package com.syntax.class12;

public class Phone {


	/*
	 * HW: Create a Class "Phone". Create 3 Objects of it: iPhone, Android, Nokia with 
	 * specific  attributes and behaviors.
	 */
		
	String make;
	String model;
	int year;
	boolean camera;
	double screenSize;
	
	void makeCall() {
		System.out.println(make+model+" can make calls.");
	}
	
	void takePictures() {
		if (camera=true) {
			System.out.println(make+model+" takes lots of pictures.");
		}else {
			System.out.println(make+model+"can't take pictures.");
		}
	}
	
	}
	


