package com.bridgelabz.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		
//		List<Integer> squaresList = new ArrayList<>();
//		for (Integer i : numbersList) {
//			squaresList.add(i*i);
//		}
		//The below code replaces above block of code
		
//		List<Integer> squaresList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
//		System.out.println("List of Squared numbers: " + squaresList);
		
//		Set<Integer> squareSet = new HashSet<>();
//		for(Integer i : numbersList) {
//			squareSet.add(i*i);
//		}
//		Set<Integer> squaresSet = numbersList.stream().map(x -> x*x).collect(Collectors.toSet());
//		System.out.println("Set of Squared numbers: " + squaresSet);
		
		List<String> languages = new ArrayList<>();
		
		languages.add("scala");
		languages.add("java");
		languages.add("python");
		languages.add("basic");
		
//		List<String> filterResult = new ArrayList<>();
//		for (String s : languages) {
//			if(s.startsWith("p")) {
//				filterResult.add(s);
//			}
//		}
//		List<String> filterResult = languages.stream().filter(s -> s.startsWith("p")).collect(Collectors.toList());
//		System.out.println("Languages starting with 'p': " + filterResult);
		
//		List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
//		System.out.println("Languages sorted alphabetically: " + sortedList);
//		
//		System.out.println("Printing all the elements one by one: ");
//		languages.stream().forEach(y->System.out.println("element is: " + y));
		//for multiple line operations, add curly brackets to the block of code
		
		//reduce method
		int sum = numbersList.stream().reduce(0,(ans,i)-> ans+i);
		System.out.println("Sum of all elements in numbersList is: " + sum);
	}	
}