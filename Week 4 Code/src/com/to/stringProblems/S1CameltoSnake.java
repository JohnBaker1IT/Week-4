package com.to.stringProblems;

public class S1CameltoSnake {

	public static void main(String[] args) {
		InputHelper helper = new InputHelper();   // create an instance inputhelper
		String s1 = helper.getInput("Enter camel case string : ");
       
		System.out.println(camelToSnake(s1,true));
		
	
	}
	
	public static String camelToSnake(String camel, boolean upper) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : camel.toCharArray()) {
            char nc = upper ? Character.toUpperCase(c) : Character.toLowerCase(c);
            if (Character.isUpperCase(c)) {
                stringBuilder.append('_').append(nc);
            } else {
                stringBuilder.append(nc);
            }
        }
        return stringBuilder.toString();
    }

}

