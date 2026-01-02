package com.codegnan.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main103 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.next());
		}
		
		Collections.sort(list, (s1, s2)->s1.compareTo(s2));
		
		for(String s : list) {
			System.out.print(s+" ");
		}
		sc.close();
	}

}
