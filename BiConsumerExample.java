package com.codegnan.java8;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, Integer>printMarks=(name, marks)->
		System.out.println(name+" scored "+marks+" marks");
		printMarks.accept("malli", 98);
	}

}
