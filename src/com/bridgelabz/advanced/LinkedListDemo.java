package com.bridgelabz.advanced;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding Elements 
		list.add("A");
		System.out.println(list);
		
		list.add("B");
		System.out.println(list);
		
		list.addLast("C");
		System.out.println(list);
		
		list.addFirst("D");
		System.out.println(list);
		
		list.add(2, "E");
		System.out.println(list);
		
		//Removing Elements
		list.remove(3);
		System.out.println(list);
		
		list.remove("C");
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
	}
}