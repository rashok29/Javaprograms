package com.java_pgms;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_in_ArrayString {
	public static void main(String[] args) {

		String str = "Greens green technology Greens Testing software software technology";
		Map<String, Integer> mp = new HashMap<>();
		String[] allword = str.split(" ");
		for (String word : allword) {
			if (mp.containsKey(word)) {
				Integer value = mp.get(word);
				mp.put(word, value+1);
			}

			else {
				mp.put(word, 1);
			}

		}

		System.out.println(mp);

	}
}
