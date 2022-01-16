package com.bridgelabz.examples;

public class IfElseDemo {
	public static void main(String[] args) {
		int score = 55;
		char grade;
		
		if (score > 90) {
			grade = 'A';
		}
		else if ((score >= 80) && (score <= 90)) {
			grade = 'B';	
		}
		else if ((score >= 70) && (score < 80)) {
			grade = 'C';
		}
		else if ((score >= 60) && (score < 70)) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("Grade: "+"'"+grade+"'");
	}
}