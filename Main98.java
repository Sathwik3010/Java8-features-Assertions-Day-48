package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class Main98 {

	static class StringLengthFunction implements Function<String, Integer>{

		@Override
		public Integer apply(String s) {
			return s.length();
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.next());
		}
		
		StringLengthFunction func = new StringLengthFunction();
		
		for(String str: list) {
			System.out.println(func.apply(str)+" ");
		}
		sc.close();
	}

}
