package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main95 {

	static class StringComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			// TODO Auto-generated method stub
			return s1.compareTo(s2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<n ; i++) {
			list.add(sc.next());
		}
		
		Collections.sort(list, new StringComparator());
		
		for(String s : list) {
			System.out.println(s+" ");
		}
		sc.close();
	}

}
