package com.bridgelabz.examples;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int arr[];//declaring an array of integers
		arr = new int[5];//allocating the memory of 5 to the array 
		
		arr[0] = 0;//first element
		arr[1] = 1;//second element
		arr[2] = 2;//third element
		arr[3] = 3;//fourth element
		arr[4] = 4;//fifth element
		
		System.out.println("Element of index 0: " +arr[0]);//printing the element in index 0 of the array
		System.out.println("Element of index 1: " +arr[1]);//printing the element in index 1 of the array
		System.out.println("Element of index 2: " +arr[2]);//printing the element in index 2 of the array
		System.out.println("Element of index 3: " +arr[3]);//printing the element in index 3 of the array
		System.out.println("Element of index 4: " +arr[4]);//printing the element in index 4 of the array
	}
}