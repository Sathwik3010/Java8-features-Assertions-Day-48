package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main99 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.next());
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}		
		});
		
		for(String s : list) {
			System.out.print(s+" ");
		}
		sc.close();
	}

}
