package com.to.threadProblems;

public class T1MultiThreading extends Thread{ 
	public void run() {
		for(int i=1;i<10;i++){
			System.out.println(i);
		}
	}

	public static void main(String[] args){
		T1MultiThreading obj = new T1MultiThreading();
		obj.start();
	}
}
