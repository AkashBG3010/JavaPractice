package com.bridgelabz.exceptionhandling;

public class MyException extends Exception {
	MyException() { }
	
	MyException(String str) { super(str); }
}