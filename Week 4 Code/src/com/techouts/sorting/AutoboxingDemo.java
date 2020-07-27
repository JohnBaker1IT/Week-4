package com.techouts.sorting;

import java.util.ArrayList;

public class AutoboxingDemo {
	public static void main(String[] args) {
		char ch = 'a';

		// Autoboxing- primitive to Character object conversion
		Character a = ch;
		System.out.println(a);
		int num = 25;
		// Autoboxing- primitive to Integer object conversion
		Integer integer = num;
		System.out.println(integer);
	}
}
