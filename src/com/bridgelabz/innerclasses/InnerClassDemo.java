package com.bridgelabz.innerclasses;

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass.InnerClass in = new OuterClass().new InnerClass();
		in.display();
		
		OuterClass outerClass = new OuterClass();
		outerClass.outerClassMethod();
	}
}