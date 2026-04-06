package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FindMax {

	void main() {
		List<Integer> list = new ArrayList();

		Optional<Integer> max = list.stream().sorted(Collections.reverseOrder()).findFirst();

		List<Integer> list1 = new ArrayList();

		Optional<Integer> max2 = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst();

		
		
		
		
		
		
	}

}
