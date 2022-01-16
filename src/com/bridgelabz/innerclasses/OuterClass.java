package com.bridgelabz.innerclasses;

public class OuterClass {
	class InnerClass {
		public void display() {
			System.out.println("This is the inner class method");
		}
	}
		void outerClassMethod() {
			System.out.println("In the Outer Class method");
			
			class MethodLocalClass {
				void localInnerMethod() {
					System.out.println("In the Method local class - Method");
				}
			}
			MethodLocalClass mlc = new MethodLocalClass();
			mlc.localInnerMethod();
	}
}