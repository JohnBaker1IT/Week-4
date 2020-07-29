package com.to.stringProblems;

import java.util.Scanner;


    
		/*InputHelper helper = new InputHelper();   // create an instance inputhelper
		String s1 = helper.getInput("Enter a numeric value: ");
        String s2 = helper.getInput("Enter a numeric value: ");
        String op = helper.getInput("Choose an operation (+ - * /):");*/

	
	public class InputHelper {                          //class to get input
		String getInput(String prompt) {   //getter method
	        System.out.print(prompt);
	        Scanner sc = new Scanner(System.in);
	        return sc.nextLine();		
	        
	}
    
 }

    
