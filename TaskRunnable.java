package com.codegnan.collections;

public class TaskRunnable implements Runnable{

	private String taskName;
	
	TaskRunnable(String taskName){
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		System.out.print(taskName+" ");
	}

}
