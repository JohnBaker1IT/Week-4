package com.techouts.sorting;

class Unboxing {
	public static void main(String[] args) {
		Character ch = new Character('a');

		// unboxing - Character object to primitive conversion
		char a = ch;
		System.out.println(a);

		Integer integer = new Integer(24);

		int num = integer;

		// printing the values from primitive data types
		System.out.println(num);
	}
}