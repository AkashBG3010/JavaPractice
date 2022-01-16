package com.bridgelabz.equalshashcode;

public class Main {
	public static void main(String[] args) {
		Student john1 = new Student(1, "John", "23 East, California" );
		Student john2 = new Student(2, "John", "23 East, California" );
		Student john3 = new Student(1, "John", "23 East, California" );
		
		System.out.println(john1.equals(john2));
		System.out.println(john1.equals(john3));
	}
}