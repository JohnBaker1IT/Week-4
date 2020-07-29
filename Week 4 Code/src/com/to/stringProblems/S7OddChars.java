package com.to.stringProblems;

import java.util.*;
public class S7OddChars {
	
	public static void main(String Args[]){
		
		/*
		 * Scanner in = new Scanner(System.in); String s = in.nextLine(); //read string
		 */		
		InputHelper helper = new InputHelper();   // create an instance inputhelper
		String s1 = helper.getInput("Enter string to find odd chars : ");
		int len = s1.length();  //for storing length of string
		
		String newWord = "";  //for printing out
		
		for(int j = 1; j < len; j+=2){   
		    
		    newWord = newWord + s1.charAt(j);
		    
		}
		//loop would execute for (len / 2) times 
		//printing out the alternate characters of the string
		
		System.out.println(newWord);
	}
}
