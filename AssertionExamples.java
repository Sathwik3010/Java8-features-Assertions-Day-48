package com.codegnan.java8;

public class AssertionExamples {

	public static void main(String[] args) {
		int age = 20;
		assert(age>=28);               // simple version
		System.out.println("valid student age: "+age);
		
		int marks = 120;
		assert(marks<=100): "Marks cannot exceed 100! you entered " +marks;  // argumented version
		System.out.println("marks "+marks);
	}

}
