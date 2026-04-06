package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Filter {

	void main() {
		List<Integer> arr= Arrays.asList(1,3,2,5,6);
		
		List<Integer> o=arr.stream().filter(i->i%2!=0).toList();
		
		
		System.out.println(o);
		
	}
	
}
