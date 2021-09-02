package HwFromClass18;

public class Task2 {

	//Write a java program of Class Students that takes 
	//students name and 3 subject grades. Inside your class 
	//also have a method to Calculate Average Grade. Test 
	//Student class for 5 different students with different 
	//marks. Your program should print an average mark 
	//of each students name.
	
	//NOTE: please use different names for instance and 
	//local variables.
	
	
	String studentName;
	int gradeInMath;
	int gradeInSpanish;
	int gradeInEnglish;
	int average;
	
	Task2(String name, int grade1, int grade2, int grade3){
		name=studentName;
		grade1=gradeInMath;
		grade2=gradeInSpanish;
		grade3=gradeInEnglish;
	}
	
	void avgGrade() {
		average=(gradeInMath + gradeInSpanish + gradeInEnglish)/(3);
		System.out.println(studentName+" earned a "+average+" average ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
