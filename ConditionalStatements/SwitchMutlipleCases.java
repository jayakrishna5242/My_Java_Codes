package com.ConditionalStatements;

public class SwitchMutlipleCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  day=7;
		switch(day) {
		case 1,7->{
			System.out.println("WeekEnd");
		}
		case 2 -> System.out.println("Lazy Monday !!!!");
		case 3,4,5 -> System.out.println("Boring Week Days");
		case 6 -> System.out.println("Funny Friday");
		default -> System.out.println("Invaild Day");
		}

	}

}
