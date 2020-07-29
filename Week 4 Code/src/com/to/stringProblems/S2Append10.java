package com.to.stringProblems;

public class S2Append10 {
	
	public static void main(String[] args) {
	final int ITERATION = 10;
		// StringBuilder example to concate two String in Java 
		
		StringBuilder builder = new StringBuilder(); //default size for worst case 
		InputHelper helper = new InputHelper();   // create an instance inputhelper
		
		for (int i = 0; i < ITERATION; i++) { 
			String s1 = helper.getInput("Enter string "+(i+1)+": ");
			builder.append(s1); 
			System.out.println(builder);
		} 
		
		
		
	}
}