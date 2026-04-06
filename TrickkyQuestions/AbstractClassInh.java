package com.TrickkyQuestions;

abstract class Person{
	Person(){
		System.exit(0);
	}
}

public class AbstractClassInh extends Person {
	AbstractClassInh(){
		System.out.println("How Are You Man");
	}
	void main() {		
		System.out.println("Main Method starteed");
		
		Person p= new AbstractClassInh();
		
		System.out.println("Main Method ended");
	}
	
}
