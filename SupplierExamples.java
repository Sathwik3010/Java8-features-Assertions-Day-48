package com.codegnan.java8;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExamples {

	public static void main(String[] args) {
		Supplier<String>message = ()-> "Hello";
		System.out.println(message.get());
		
		Supplier<Integer>randomNum=()->(int)(Math.random()*100);
		System.out.println("Random Number: "+randomNum.get());
		
		Supplier<LocalDateTime> datetime=()->LocalDateTime.now();
		System.out.println(datetime.get());
	}

}
