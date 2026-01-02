package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main97 {

	static class ThresholdPredicate implements Predicate<Integer>{

		private int threshold;
		
		
		public ThresholdPredicate(int threshold) {
			super();
			this.threshold = threshold;
		}


		@Override
		public boolean test(Integer num) {
			// TODO Auto-generated method stub
			return num>= threshold;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		int threshold = sc.nextInt();
		
		ThresholdPredicate predicate = new ThresholdPredicate(threshold);
		
		for(Integer num : list) {
			if(predicate.test(num)) {
				System.out.println(num+" ");
			}
		}
		sc.close();
	}

}
