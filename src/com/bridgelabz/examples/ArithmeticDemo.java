package com.bridgelabz.examples;

public class ArithmeticDemo {

	public static void main(String[] args) {
		int result = 1 + 2;//addition
		System.out.println("1 + 2 = " +result);
		int originalResult = result;
		
		result = result - 1;//subtraction
		System.out.println(originalResult+ " - 1 = " +result);
		originalResult = result;
		
		result = result * 2;//multiplication
		System.out.println(originalResult+ " * 2 = " +result);
		originalResult = result;
		
		result = result / 2;//division
		System.out.println(originalResult+ " / 2 = " +result);
		originalResult = result;
		
		result = result % 2;//modulus(remainder)
		System.out.println(originalResult+ " % 2 = " +result);
	}
}