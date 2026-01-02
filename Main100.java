package com.codegnan.java8;

import java.util.Scanner;

public class Main100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String task = sc.next();
			
			Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(task+" ");
				}
			});
			t.start();
		}
		sc.close();
	}

}
