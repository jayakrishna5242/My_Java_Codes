package com.TrickkyQuestions;

class kumar{
	static int a=15;
	static void hello() {
		
		System.out.println(a);
	}
}
public class RuntimePolymorphism  extends kumar{
	static int a=18;
	static void hello() {
		System.out.println(a);
	}
	void main() {
		kumar k= new RuntimePolymorphism();
		k.hello();
	}
	
}
