package com.codegnan.java8;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
//		Predicate<Integer>p = i-> i>10;
//		System.out.println(p.test(15));
//		System.out.println(p.test(5));
		
		
		// string length is more than  or not.
		// write a predicate to check if a number is even
		// check if a collection is empty or not.
		Predicate<String> p = s-> s.length()>5;
		System.out.println(p.test("dev"));
		
		Predicate<Integer>p1 = n->n%2==0;
		System.out.println(p1.test(20));
		System.out.println(p1.test(25));

		Predicate<Collection<?>>p2 = c->c.isEmpty();
		Collection<String> list1 = List.of();
		Collection<String> list2 = List.of("malli", "mahi", "mani");
		System.out.println(p2.test(list1));
		System.out.println(p2.test(list2));

		Predicate<Employee> highSalary = e->e.getSalary()>50000;
		Employee e1 = new Employee("malli", 60000);
		Employee e2 = new Employee("arjun", 60000);
		System.out.println(e1.getName()+" earns high salary? "+highSalary.test(e1));
		System.out.println(e2.getName()+" earns high salary? "+highSalary.test(e1));

	}

}
