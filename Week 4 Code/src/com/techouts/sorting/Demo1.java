package com.techouts.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo1 {
	public static void main(String[] args) {
		
		//sorting a integer array
		int [] iarray=new int[]{8787,97,98,875,997};
		Arrays.sort(iarray);
		System.out.println("Sorting integer array:-");
		for(int i=0;i<iarray.length;i++) {
			System.out.println(iarray[i]);
		}
		
		//sorting a list of integer
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(453);
		list.add(675);
		list.add(89);
		list.add(535);
		Collections.sort(list);
		System.out.println("Sorting integer list:-");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		String[] sarray= new String[] {"java","is","robust"};
		Arrays.sort(sarray);
		System.out.println("Sorting String array:-");
		for(int i=0;i<sarray.length;i++) {
			System.out.println(sarray[i]);
		}
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("java");
		list2.add("is");
		list2.add("robust");
		
		Collections.sort(list2);
		System.out.println("sorting a list of string ");
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}
}
