package com.codegnan.collections;

import java.util.Scanner;

public class Main91 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Thread[] threads = new Thread[n];
		
		for(int i=0; i<n; i++) {
			String task = sc.next();
			threads[i] = new Thread(new TaskRunnable(task));
			threads[i].start();
		}
		sc.close();
	}

}
