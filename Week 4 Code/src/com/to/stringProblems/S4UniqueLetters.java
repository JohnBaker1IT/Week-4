package com.to.stringProblems;

public class S4UniqueLetters {

	public static void main(String[] args) {
		InputHelper helper = new InputHelper();   // create an instance inputhelper
		String s1 = helper.getInput("Enter string to find unique letters : ");
		String test = s1;
		    String temp = "";
		    for (int i = 0; i < test.length(); i++){
		        char current = test.charAt(i);
		        if (temp.indexOf(current) < 0){
		            temp = temp + current;
		        } else {
		            temp = temp.replace(String.valueOf(current), "");
		        }
		    }

		    System.out.println(temp + " ");

		

	}

}
