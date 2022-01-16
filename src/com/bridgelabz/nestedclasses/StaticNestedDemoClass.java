package com.bridgelabz.nestedclasses;

public class StaticNestedDemoClass {

	public static void main(String[] args) {
		//Accessing the class in different class
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
		nestedObject.display();
	}
}