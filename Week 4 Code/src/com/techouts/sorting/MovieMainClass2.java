package com.techouts.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieMainClass2 {

	public static void main(String[] args) {
		Movie avengers = new Movie(8, "AvengersInfinityWar", 2018);
		Movie battleShip = new Movie(5.8, "BattleSip", 2012);
		Movie starWars = new Movie(6.7, "StarWars", 2019);
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(avengers);
		movieList.add(battleShip);
		movieList.add(starWars);

		Comparator<Movie> ratingCompare = new RatingCompare();
		Collections.sort(movieList, ratingCompare);

		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
		System.out.println("Sorting by names:");
		NamesCompare nameCompare= new NamesCompare();
		Collections.sort(movieList,nameCompare);
		for (int i = 0; i < movieList.size(); i++) {
			System.out.println(movieList.get(i));
		}
		
	}

}

class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie movie1, Movie movie2) {
		if (movie1.getRating() < movie2.getRating()) {
			return 1;
		} else if (movie1.getRating() > movie2.getRating()) {
			return -1;
		}
		return 0;
	}

}

class NamesCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie movie1, Movie movie2) {

		return movie1.getName().compareTo(movie2.getName());
	}

}