package com.to.stringProblems;

public class S3StringSequence {

	public static void main(String[] args) {
		String s1 = "MYHOMEISJEWEL";
		String sub1 = s1.substring(0,2);
		System.out.println (sub1);
		String sub2 = s1.substring(2,6);
		System.out.println (sub2);
		String sub3 = s1.substring(6,8);
		System.out.println (sub3);
		String sub4 = s1.substring(8,13);
		System.out.println (sub4);
		String output = sub4 + sub3 + sub1 + sub2;
		System.out.println (output);
		
		//with string builder
		StringBuilder b = new StringBuilder();
		b.append(sub4);
		b.append(sub3);
		b.append(sub1);
		b.append(sub2);
		System.out.println (b);
				
	}

}
