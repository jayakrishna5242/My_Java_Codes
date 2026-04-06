package com.Java_Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AnagramHashMap {
	static Map<String, List<String>> map = new LinkedHashMap();
	boolean containsAnyKey(String s) {
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			char[] ch1 = (s.toCharArray());
			char[] ch2 = (key.toCharArray());
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.toString(ch1).equals(Arrays.toString(ch2))) {
				entry.getValue().add(s);
			} else
				continue;
		}
		return false;
	}
	void main() {
		List<String> arr = Arrays.asList("cat", "tea", "act", "bat", "tab", "ate", "eat", "hat");
		for (String s : arr) {
			List<String> list = new LinkedList<>();
			if (containsAnyKey(s)) {
				arr.remove(s);
			} else {
				list.add(s);
				map.put(s, list);
			}
		}
		System.out.println(map);
	}
}
