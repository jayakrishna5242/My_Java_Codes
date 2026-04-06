package com.TrickkyQuestions;

abstract  class krishna extends Object{
	 krishna() {
		System.out.println("I am From dont know");
	}
	 int i;
}
public class AbstractWithFinal extends krishna {
	AbstractWithFinal(){
		System.out.println("Constructor from Abstract Class");
		System.out.println(i);
	}
	public void main() {
		System.out.println("Main method Started");
	}
}
