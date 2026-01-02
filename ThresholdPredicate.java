package com.codegnan.collections;

import java.util.function.Predicate;

public class ThresholdPredicate implements Predicate<Integer>{

	private int threshold;
	
	
	public ThresholdPredicate(int threshold) {
		super();
		this.threshold = threshold;
	}


	@Override
	public boolean test(Integer num) {
		return num >= threshold;
	}

}
