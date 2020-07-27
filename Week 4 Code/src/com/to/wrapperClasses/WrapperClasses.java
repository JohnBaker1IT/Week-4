package com.to.wrapperClasses;

public class WrapperClasses {

	public static void main(String[] args) {
		int a = 123;
	    Integer b = new Integer(a);     // The second line uses a primitive Int to create an integer object. 
	    Integer c = new Integer("123");
	    Integer d = Integer.parseInt("123");//The third and fourth line demonstrates two ways to turn a string representation of an integer to an integer object.
	    Integer e = a;  // The last assignment demonstrates a concept known as autoboxing. 
	    System.out.println(a+" "+b);
	    System.out.println(c+" "+d+" " +e);
	}

}
