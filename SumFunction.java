package com.codegnan.collections;

import java.util.List;
import java.util.function.Function;

public class SumFunction implements Function<List<Integer>, Integer>{

	@Override
	public Integer apply(List<Integer> list) {
		int sum = 0;
		for(Integer num : list) {
			sum+=num;
		}
		return sum;
	}

}
