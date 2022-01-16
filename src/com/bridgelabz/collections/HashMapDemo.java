package com.bridgelabz.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		System.out.println("Size of map: " + map.size());
		System.out.println(map);
		
		if (map.containsKey("a")) {
			Integer a = map.get("a");
			System.out.println("Value of key 'a' is: " + a);
		}
		for (String key : map.keySet()) {
			System.out.println("key " + key + " value is :" + map.get(key));		
		}
		for  (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key " + entry.getKey() + ", value: " +entry.getValue());
		}
	}
}