package com.javaintro;

class Vehicle {
	public static void vehicle() {
		System.out.println("Vehicle Class is Here");
	}
}

public class Loader {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.javaintro.Hello");
		System.out.println("Hello Class Loaded");

		Class.forName("com.javaintro.Vehicle");

		System.out.println("Vehicle Class Loaded");
		
		
		Vehicle obj1=new Vehicle();
		System.out.println("Vehicle Class Object Created Successfull");
		obj1.vehicle();
		
	}

}
