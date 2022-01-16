package com.bridgelabz.advanced;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		//Adding Elements 
		hashSet.add("A");
		System.out.println(hashSet);
		hashSet.add("B");
		System.out.println(hashSet);
		boolean r1 = hashSet.add("C");
		System.out.println(r1);
		boolean r2 = hashSet.add("C");
		System.out.println(r2);
		System.out.println(hashSet);
		
		System.out.println("Set contains C or not? " + hashSet.contains("C"));
		
		//Removing Elements
		hashSet.remove("A");
		System.out.println(hashSet);
		
//		for (String item : hashSet) {
//			System.out.println(item);
//		}
	}
}