package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main92 {

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
				System.out.print(num+" ");
			}
		}
		sc.close();
	}

}
