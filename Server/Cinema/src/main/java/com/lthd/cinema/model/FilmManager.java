package com.lthd.cinema.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lthd.cinema.model.dao.Film;
import com.lthd.cinema.model.dao.SlideShow;

public class FilmManager {
	public static List<Film> films = new ArrayList();
	public static Map<String, List<SlideShow>> slideShows = new HashMap();
	
	public static void clearShowTime() {
		for (Film film : films)
			film.showTimes.clear();
	}
	
	public static void SortShowtimes() {
		for (Film film : films)
			for (String cine : film.showTimes.keySet()) {
				Comparator<List<String>> compDate = new Comparator<List<String>>() {
					public int compare(List<String> a, List<String> b) {
						String ya = a.get(0).substring(6, 10);
						String yb = b.get(0).substring(6, 10);
						if (!ya.equals(yb))
							return ya.compareTo(yb);
						
						String ma = a.get(0).substring(3, 5);
						String mb = b.get(0).substring(3, 5);
						if (!ma.equals(mb))
							return ma.compareTo(mb);
						
						String da = a.get(0).substring(0, 2);
						String db = b.get(0).substring(0, 2);
						
						return da.compareTo(db);
					}
				};

				Collections.sort(film.showTimes.get(cine), compDate);
				
				for(List<String> date : film.showTimes.get(cine)) {
					Comparator<String> compHour = new Comparator<String>() {
						public int compare(String a, String b) {
							
							if (a.length() == 10)
								return -1;
							if (b.length() == 10)
								return 1;
							return a.compareTo(b);
						}
					};

					Collections.sort(date, compHour);
				}
			}
	}
}