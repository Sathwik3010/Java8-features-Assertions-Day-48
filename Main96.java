package com.codegnan.collections;

import java.util.Scanner;

public class Main96 {

	static class TaskRunner implements Runnable{

		private String taskName;
		
		public TaskRunner(String taskName) {
			super();
			this.taskName = taskName;
		}

		@Override
		public void run() {
			System.out.println(taskName+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Thread[] threads = new Thread[n];
		
		for(int i=0; i<n; i++) {
			String task = sc.next();
			
			threads[i]= new Thread(new TaskRunner(task));
			threads[i].start();
		}
		sc.close();
	}

}
