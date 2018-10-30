package org.practice.Inheritance;

public class Student extends Person {
	
	private int[] testScores = {100, 80};
	String grade;

	Student(String firstName, String lastName, int id, int [] testScores) {

		super(firstName, lastName, id);
		this.testScores = testScores;
		this.grade = calculate();
		

	}
	
	private String calculate(){
		String grade = "T";
		int total = 0;
		int average = 0;
		int [] testScores = this.testScores;
		for (int i : testScores) {
			total += i;
		}
		average = total / testScores.length;
		
		if (average >= 90  && average <= 100){
			grade = "O";
		} else if (average >= 80  && average < 90){
			grade = "E";
		} else if (average >= 70  && average < 80){
			grade = "A";
		} else if (average >= 55  && average < 70){
			grade = "P";
		} else if (average >= 40  && average < 55){
			grade = "D";
		} else if (average < 40){
			grade = "T";
		}		
		
		
		return grade;
	}

	public static void main(String[] args) {

		String firstName = "Heraldo";
		String lastName = "Memelli";
		int id = 2;
		int[] testScores = {100, 80};

		if ( (firstName.length() <= 1 || firstName.length() <= 10) && (lastName.length() <= 1 || lastName.length() <= 10) ) {
			Student s = new Student(firstName, lastName, id, testScores);
			s.printPerson();
			System.out.println("Grade: " + s.calculate() );
		}

		
	}

	
}