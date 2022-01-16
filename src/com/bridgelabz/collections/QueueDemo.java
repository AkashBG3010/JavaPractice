package com.bridgelabz.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		
		queue.add("India");
		queue.add("Germany");
		queue.add("America");
		
		System.out.println("Original queue: " + queue);
		
		queue.remove();
		System.out.println("Queue after removing: " + queue);
		
		String head = queue.peek();
		System.out.println("Head of the queue is: " + head);
		
		head = queue.poll();
		System.out.println("Head removed is: " + head);
		
		System.out.println("Queue looks like: " + queue);
	}
}