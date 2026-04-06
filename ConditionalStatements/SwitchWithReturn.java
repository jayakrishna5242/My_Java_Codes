package com.ConditionalStatements;

public class SwitchWithReturn {

	String getDayInfo(int day) {
		//returning value from switch
		return switch (day) {
		case 1, 7 -> "Weekend";
		case 2 -> "Lazy Monday !!!!";
		case 3, 4, 5 -> "Boring Week Days";
		case 6 -> "Funny Friday";
		default -> "Invaild Day";

		};
	}

	void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 2;

		String dayname = getDayInfo(day);
		System.out.println(dayname);

		// Storing value came from switch
		int s = switch (day) {
		case 1 -> 1;
		default -> 0;
		};
		System.out.println(s);

	}

}
