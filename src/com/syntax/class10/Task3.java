package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. create a 2D array where you wills tore teh following values: mr, mrs, ms, miss and smith, obama, jordan, jackson.
		 * after storing the values, print: mr. obama, mrs. smith, ms. jackson, miss jordan
		 * 
		 */
		
		System.out.println("-----TASK 1------------");
		
		String [][] name= {
			{"Mr.", "Mrs.", "Ms.", "Miss"},
			{"Smith", "Jordan", "Obama", "Jackson"}
			
		};
		
		System.out.println(name [0][0] +" " +name[1][2]);
		System.out.println(name [0][1] +" " +name[1][0]);
		System.out.println(name [0][2] +" " +name[1][3]);
		System.out.println(name [0][3] +" " +name[1][1]);
		
		/*
		 * 2. create a 2D array where the first row contains 4 names, and a second row will contain grades. then your program
		 * should print name of the studens that has A and B grade.
		 * 
		 */
		
		System.out.println("---------------TASK 2---------------");
		
		String[][] student= {
				{"Abby", "Michael", "Jan", "Sam"},
				{"A", "B", "C", "A"}
							};
		
		System.out.println(student [0][0] +" earned a " +student [1][0]);

		//how to get all values from 2D array
		System.out.println("---------getting all values from a 2d array-------");
		String[][] food= {
				{"pizza", "pasta", "soup", "bread"},
				{"chutney", "biryani", "pulao", "raita"},
				{"taco", "burrito", "sala", "guacamole"},
				{"mantu", "pulaw", "kabab"}
				};
		System.out.println(food.length);
		int sizeof1Array=food[0].length;
		System.out.println(sizeof1Array);
		vjkldfjaFINISH AFTER WATACHING LAST HALF HOR OF CLASS VIDEO
		
}

}
