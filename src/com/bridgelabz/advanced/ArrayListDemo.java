package com.bridgelabz.advanced;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(5);
		
		for (int i=1; i<=5; i++ ) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		
		arrayList.remove(0);
		System.out.println(arrayList);
		
//		for (int i=0; i<arrayList.size(); i++) {
//			System.out.println(arrayList.get(i) + " ");
//		}
		//this block of code replaces above block of code
		for (int i : arrayList) {
		System.out.println(i + " ");
		}
	}
}