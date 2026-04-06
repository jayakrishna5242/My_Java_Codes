package com.GUT;

import java.util.LinkedHashMap;
import java.util.Map;

public class SubStrings {

	void main() {
		String str = "bacdae";


		int max = 0;
		Map<Character, Integer> map = new LinkedHashMap();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (map.containsKey(c)) {
				System.out.println(map);
				i--;
				map.remove(c);
			} else {
				map.put(c, 1);
			}

			if (map.size() > max) {
				max = map.size();
			}

		}

		System.out.println(map);
		System.out.println(max);

	}

}
