package com.bridgelabz.examples;

public class TernaryOperatorsDemo {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result;
		
		result = a < b ? a : b;
		/*Above ternary statement operates as this block of code
		 * if (a < b) { result = a; } else { result = b; }
		 */
		System.out.println(result);
	}
}