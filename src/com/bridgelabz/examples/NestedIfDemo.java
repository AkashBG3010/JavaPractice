package com.bridgelabz.examples;

public class NestedIfDemo {

	public static void main(String[] args) {
		int i = 50;
		
		if (i == 50) {
			System.out.println("i is equal to 50");
			if (i < 75) {
				System.out.println("i is less than 75");
				if (i > 40) {
					System.out.println("i is greater than 40");
				}
			}
		}
	}
}