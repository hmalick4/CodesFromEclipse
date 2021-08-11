package com.syntax.class09;

public class RetrievingAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		int size=grades.length; //gives the size- how many elements in this array. highest index
		System.out.println("size is equal to "+size); //aka highest index is 6
		
		System.out.println(grades[1]);
		
		int i=0;
		System.out.println(grades[i]);
		
		i++;
		System.out.println(grades[i]);
		
		System.out.println("RETRIEVING ALL VALUES USING FOR LOOP");
		for(int j=0; j<size; j++) {
			System.out.println(grades[j]);
		}
		
		String[] names= {"Jose", "Sule", "Blake", "Enes"};
		int size1=names.length;
		System.out.println(size1);
		for (int k=0; k<size1; k++) {
		System.out.println(names[k]);
		}
	}

}
