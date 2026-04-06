package com.multithreding;

public class ThreadJoin {

	void main() {

		Runnable r1 = new Runnable() {
			public void run() {

				for (int i = 0; i <= 20; i++) {
					System.out.println("Thread 1 : " + i);
					if(i>15) {

						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		};

		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 20; i++) {
					System.out.println("Thread 2 : " + i);
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				notify();
			}

		};
		Runnable r3 = new Runnable() {
			public void run() {
				for (int i = 0; i <= 20; i++) {
					System.out.println("Thread 3 : " + i);
				}
				notify();
			}

		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

	}
}
