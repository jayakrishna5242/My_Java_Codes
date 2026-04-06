package com.GUT;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class QueueRotation {

	void main() {

		Deque<Integer> que = new LinkedList();

		que.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		int rotations = 4;

		for (int i = 0; i < rotations; i++) {
			que.offerFirst(que.pollLast());
		}

		for (int i : que) {
			System.out.print(i + " ");
		}

	}

}
