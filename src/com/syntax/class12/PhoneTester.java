package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="iPhone";
		iphone.year=2020;
		iphone.camera=true;
		iphone.screenSize=5.5;
		iphone.makeCall();
		iphone.takePictures();
		
		Phone android=new Phone();
		android.make="Samsung";
		android.model="Galaxy";
		android.year=2000;
		android.camera=false;
		android.screenSize=7;
		android.makeCall();
		android.takePictures();
		
		Phone nokia=new Phone();
		nokia.make="Nokia";
		nokia.model="whatever";
		nokia.year=1999;
		nokia.camera=false;
		nokia.screenSize=2.2;
		nokia.makeCall();
		nokia.takePictures();
		
		
		
		
	}

}
