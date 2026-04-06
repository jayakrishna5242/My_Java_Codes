package com.multithreding;

public class SampleThread extends Thread {

	@Override
	public void run() {
		System.out.println("Executing Thread 1");
		System.out.println("Executing Thread 1");
		System.out.println("Executing Thread 1");
		System.out.println("Executing Thread 1");
		System.out.println("Executing Thread 1");

	}

	void main() {
		System.out.println(Thread.currentThread());
		SampleThread t1 = new SampleThread();
		t1.start();

		System.out.println("Executing main Thread");
		System.out.println("Executing main Thread");
		System.out.println("Executing main Thread");
		System.out.println("Executing main Thread");
		System.out.println("Executing main Thread");

	}

}
