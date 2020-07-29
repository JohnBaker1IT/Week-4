package com.to.threadProblems;

public class T2MultiThreadingRunnable implements Runnable{ 
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println(i);
		}
	}

	public static void main(String[] args){
		Runnable r = new T2MultiThreadingRunnable(); 
		Thread obj = new Thread(r);
		obj.start();
	}
}
