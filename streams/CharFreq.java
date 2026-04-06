package com.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharFreq {

	void main() {
		Map<Character,Integer> map= new HashMap();

		
		String s="jaya";
		
		for(char ch:s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		
		
		
		
	}
	
}
