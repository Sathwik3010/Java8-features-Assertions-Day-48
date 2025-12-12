package com.codegnan.java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer,Integer> f1 = i->i*i;
		System.out.println(f1.apply(4));
		System.out.println(f1.apply(25));
		
		// find out the string length.
		// convert string to uppercase.
		
		Function<String , Integer> f2 = s->s.length();
		System.out.println(f2.apply("Dev"));
		
		Function<String , String> f3 = s->s.toUpperCase();
		System.out.println(f3.apply("Dev"));
		
		Function<Student, String> f4 = student->{
			if(student.marks>=80) {
				return "A Grade";
			} else {
				if(student.marks>=60) {
					return "B Grade";
				} else {
					if(student.marks>=40) {
						return "C Grade";
					} else {
						return "fail";
					}
				}
			}
		};
		Student s1 = new Student("venu", 85);
		Student s2 = new Student("renu", 65);
		Student s3 = new Student("arjun", 45);
		Student s4 = new Student("maine", 30);

		System.out.println(s1.name + "--->" + f4.apply(s1));
		System.out.println(s2.name + "--->" + f4.apply(s2));
		System.out.println(s3.name + "--->" + f4.apply(s3));
		System.out.println(s4.name + "--->" + f4.apply(s4));

	}

}
