package com.techouts.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieMainClass {
	public static void main(String[] args) {
		
		Movie avengers= new Movie(8,"Avengers Infinity War",2018);
		Movie battleShip= new Movie(5.8,"BattleSip",2012);
		Movie starWars= new Movie(6.7,"StarWars",2019);
		
		List<Movie> movieList=new ArrayList<Movie>();
		movieList.add(starWars);
		movieList.add(avengers);
		movieList.add(battleShip);
		System.out.println("before sorting");
		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
		Collections.sort(movieList);
		System.out.println("after sorting");
		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
				
	}
}
