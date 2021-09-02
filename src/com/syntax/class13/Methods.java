package com.syntax.class13;

public class Methods {

	void RepeatWords(int times, String word) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
		
		void isItRaining(boolean isRain) {
			if(isRain) {
				System.out.println("Please take an umbrella.");
				
			} else {
				System.out.println("Let's go for a walk.");
			}
		}
		
		int add(int number1, int number2) {
			return number1+number2;
		
		}
}