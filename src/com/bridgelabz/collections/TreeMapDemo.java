package com.bridgelabz.collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "a");//integer is the key and string is value
		treeMap.put(2, "b");
		treeMap.put(1, "c");
		
		System.out.println(treeMap);
	}
}