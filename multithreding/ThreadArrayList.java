package com.multithreding;

import java.util.ArrayList;

public class ThreadArrayList {

	void main() throws InterruptedException {

		ArrayList<Integer> arr = new ArrayList();

		Runnable thread1 = new Runnable() {
			public void run() {

				arr.add(10);

			}
		};
		Runnable thread2 = new Runnable() {
			public void run() {

				arr.add(20);

			}
		};
		Runnable thread3 = new Runnable() {
			public void run() {

				arr.add(30);

			}
		};
		Runnable thread4 = new Runnable() {
			public void run() {

				arr.add(40);

			}
		};
		Runnable thread5 = new Runnable() {
			public void run() {

				arr.add(50);

			}
		};

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		Thread t4 = new Thread(thread4);
		Thread t5 = new Thread(thread5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		

		System.out.println(arr);
	}

}
