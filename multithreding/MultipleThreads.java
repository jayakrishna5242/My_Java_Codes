package com.multithreding;

public class MultipleThreads {

	void main() {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Inside here");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}

}
