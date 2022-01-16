package com.bridgelabz.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Student john = new Student(2, "John", 21);
		Student jane = new Student(1, "Jane", 18);
		Student tom = new Student(3, "Tom", 20);
		
		list.add(john);
		list.add(jane);
		list.add(tom);
		
		Collections.sort(list);
		System.out.println("Students after Sorting: ");
		list.forEach(student -> System.out.println(student.getName()));
	}
}