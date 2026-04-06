package com.TrickkyQuestions;

public class MultipleMainClasses {

	int a;
	void main() {
		System.out.println("Hello From Void Main");
		System.out.println(getA());
	}
	public static void main(int[] args) {
		System.out.println("Hello From Public static");
		
	}
	
	int getA(){
		return a;
	}
}
