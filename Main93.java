package com.codegnan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			numbers.add(sc.nextInt());
		}
		
		SumFunction sumFunction = new SumFunction();
		
		int result = sumFunction.apply(numbers);
		
		System.out.println(result);
		sc.close();
	}

}
