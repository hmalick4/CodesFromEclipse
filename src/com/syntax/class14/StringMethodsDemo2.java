package com.syntax.class14;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//isEmpty method
		String name="Batch 10";
		boolean results=name.isEmpty();
		System.out.println(name.isEmpty());
		System.out.println(results);
		name=" ";
		System.out.println(name.isEmpty());
		name="     ";
		System.out.println(name.isBlank());
		
		//is blank ignores spaces. is empty does not.
		
		
		//trim method
		String str="         hello  everyone   ";
		System.out.println(str.trim());//all spaces are removed before and after words
		
		System.out.println("---------");
			
		//startsWith and endsWith method. boolean values printed
		String wow="These string methods are easy.";
		System.out.println(wow.startsWith("T")); //true executed bc starts with capital T
		System.out.println(wow.startsWith("t")); //false printed
		System.out.println(wow.startsWith("This")); //true printed
		
		System.out.println(wow.endsWith("hard")); //false
		System.out.println("--------");
		
		//contains method
		System.out.println(wow.contains("class"));//false
		System.out.println(wow.contains("i"));//true
		
		//equals method
		System.out.println(wow.equals("blah")); //false
		
		System.out.println("************");
		//ignoreCase method
		System.out.println(wow.equals("these")); //false
		System.out.println(wow.equalsIgnoreCase("These"));
		
		
		String sentence="Learn everything and get a job.";
		
		
		//charAt method
		System.out.println(sentence.charAt(0)); //L (first element) (index begins with 0)
		
		//indexOf method
		System.out.println(sentence.indexOf("e")); //1
		System.out.println(sentence.indexOf("e", sentence.indexOf("e")+2)); //calling method to get first occurrence, then calling method again to get next one which is why +1 is there. gives you 6 in output the second time.
		
		//substring method
		System.out.println(sentence.substring(3)); //executes everything at index 3 and after
		System.out.println(sentence.substring(2,4)); //executes everything in between index 2-4. gives you a range
		
		
		
		
	}

}
