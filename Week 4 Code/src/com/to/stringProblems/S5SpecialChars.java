package com.to.stringProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class S5SpecialChars {
	public static void main(String[] args) {
		InputHelper helper = new InputHelper();   // create an instance inputhelper
		String s1 = helper.getInput("Enter string to find alphabetic,letters, and special : ");
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
 
		String str = s1;
		Matcher matcher = pattern.matcher(str);
 
		if (!matcher.matches()) {
           System.out.println("string '"+str + "' contains special characters");
		} else {
           System.out.println("string '"+str + "' doesn't contains special character");
		}
 
		String sample = s1;
		char[] chars = sample.toCharArray();
	      StringBuilder num = new StringBuilder();
	      StringBuilder alpha = new StringBuilder();
	      boolean containsNum = false;
	      boolean containsAlpha = false;
	      for(char c : chars){
	         if(Character.isDigit(c)){
	            num.append(c);
	            containsNum = true;
	         }
	         if(Character.isAlphabetic(c)){
		            alpha.append(c);
		            containsAlpha = true;
		         }
	      }
	      if (containsAlpha) {
	    	  System.out.println("string '"+sample + " contains the alphabetic characters "+alpha);
	      }
	      if (containsNum) {
	    	  System.out.println("string '"+sample + " contains the numbers "+num);
	      }
	   
  }
}