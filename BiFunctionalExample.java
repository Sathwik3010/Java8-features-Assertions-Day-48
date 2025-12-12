package com.codegnan.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiFunctionalExample {

	public static void main(String[] args) {
		BiFunction<Double, Double,Double>totalPrice=(p1,p2)->p1+p2;
		System.out.println(totalPrice.apply(20.5, 10.7));

		//combine first and lastlane
		// calculate percentage.
		// compare student marks.
		
		BiFunction<Integer, Integer, String>topScore = (m1, m2)->(m1>m2)?"student1 is topper":"student2 is topper";
		System.out.println(topScore.apply(91, 88));
		
			
	}

}
