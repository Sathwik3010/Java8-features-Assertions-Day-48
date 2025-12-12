package com.codegnan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		c.accept("Welcome to java 8!");
		
		Consumer<Integer> c1 = n->System.out.println(n*n);
		c1.accept(8);
		
		Consumer<String> c2 = s->System.out.println(s.toUpperCase());
		c2.accept("Sathwik");
		
		List<String> languages = Arrays.asList("java","python", "c++","Kotlin");
		Consumer<String>printer=lang->System.out.println("Language: "+lang);
		languages.forEach(printer);
		
		Consumer<Employee> employee = e->
							System.out.println("Employee: "+e.getName()+", Salary: "+e.getSalary());
        Employee e1 = new Employee("Revi", 50000);
        Employee e2 = new Employee("Sita", 700);
        Employee e3 = new Employee("Don", 560);
        employee.accept(e1);
        employee.accept(e2);
        employee.accept(e3);


	}

}
