package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class StreamIntro {

	void main() {

		List<Integer> l = Arrays.asList(2, 4, 23, 7, 1, 32, 9, 2, 5, 3, 9, 12, 6, 23);

		Set<Integer> s = new HashSet<>(Arrays.asList(2, 4, 23, 7, 1, 32, 9, 2, 5, 3, 9, 12, 6, 23));

		Optional<Integer> max = s.stream().sorted(Collections.reverseOrder()).skip(2).findFirst();

		System.out.println(max.orElse(null));
	}
}
