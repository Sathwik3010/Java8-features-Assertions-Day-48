package com.codegnan.java8;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer>isSumEven = (a,b)-> (a+b)%2 == 0;
		System.out.println(isSumEven.test(10, 20));
		System.out.println(isSumEven.test(11, 20));
		
		//compare two strings (case-insensitive)
		BiPredicate<String, String> compareTwoStrings = (a,b)-> a.length() == b.length();
		System.out.println(compareTwoStrings.test("Dev", "dev"));
		
		//check if one number is divides another
		// check if both Strings have same length
		// check if two employees have same salary
		
		BiPredicate<Employee, Employee> sameSalary = (e1,e2)->e1.getSalary()==e2.getSalary();
		Employee e1 = new Employee("Ravi", 25000);
		Employee e2 = new Employee("Sneha", 30000);
		Employee e3 = new Employee("mani", 30000);
		System.out.println(sameSalary.test(e2, e3));
	}

}
