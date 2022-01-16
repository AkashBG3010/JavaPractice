package com.bridgelabz.advanced;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		//Adding Elements
		treeSet.add("D");
		System.out.println(treeSet);
		treeSet.add("B");
		System.out.println(treeSet);
		treeSet.add("A");
		System.out.println(treeSet);
		treeSet.add("C");
		System.out.println(treeSet);
		treeSet.add("C");//it will not get added or overwrite
		System.out.println(treeSet);
		
		//Removing Elements
		treeSet.remove("B");
		System.out.println(treeSet);		
	}
}