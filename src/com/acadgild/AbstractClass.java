package com.acadgild;

// Question: Create an abstract class Parent and define an abstract methods in it and implement it in the child class

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Creating an English Course, setting all score values and printing out a final score.
		
		English JohnSmith = new English();
		System.out.println("John Smith's final score for English is: " +JohnSmith.getFinalScore(80, 85, 75)+ "%");

	}

}
/*
 * Course has one abstract method, so it must be declared as an abstract class
 */
abstract class Course{
	
	protected double homeworkScore;
	protected double testScore;
	protected double examScore;
	protected double finalScore; 
	/*
	 * The final Score is calculated differently for every course because some courses
	 * put more weight on homework scores, others on test scores, and the rest on exam scores.
	 * Because the final score calculation is required for every course, and it's expected to
	 * be different for every course; it's signature has been defined, but will not be implemented. 
	 */
	public abstract double getFinalScore(double homeworkScore,	double testScore, double examScore);
}

class English extends Course{
	//Because English extends Course (an abstract class) it must implement 'getFinalScore'.
	//English score weighs homework and test scores evenly, but puts a little bit more weight on 
	//Exam scores, so it's 'getFinalScore' method is reflecting the weights respectively
	public double getFinalScore(double homeworkScore, double testScore, double examScore){
		super.finalScore = (homeworkScore*0.3) + (testScore*0.3) + (examScore*0.4);
		return finalScore;
	}
}