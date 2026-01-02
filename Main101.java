package com.codegnan.java8;

import java.util.Scanner;
import java.util.function.Function;

public class Main101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Function<String, Integer> lengthFunction = new Function<String, Integer>(){
			@Override
			public Integer apply(String s) {
				return s.length();
			}
		};
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			System.out.println(lengthFunction.apply(str)+" ");
		}
		sc.close();
	}

}
