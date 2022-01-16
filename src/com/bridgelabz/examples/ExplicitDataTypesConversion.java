package com.bridgelabz.examples;

public class ExplicitDataTypesConversion {
	public static void main(String[] args) {
		double a = 50.50;
		System.out.println("Double: " +a);
		float b = (float)a;
		System.out.println("Float: " +b);
		long c = (long)a;
		System.out.println("Long: " +c);
		int d =(int)a;
		System.out.println("Int: " +d);
	}
}