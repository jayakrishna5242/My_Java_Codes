package com.multithreding;

import java.util.ArrayList;
import java.util.List;

class Resource1 {

	int i;

	boolean flag;

	synchronized void get() {

		while (flag) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Get : " + i);
		flag = true;
		notify();

	}

	synchronized void put(int i) {

		this.i = i;
		System.out.println("Put :" + i);
		flag = false;
		notify();
	}

}

class Producer1 extends Thread {

	Producer1(Resource1 r1) {
		this.r1 = r1;
	}

	Resource1 r1;

	public void run() {

		int i = 0;
		while (true) {

			r1.put(i++);

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}

class Consumer1 extends Thread {

	Resource1 r1;

	Consumer1(Resource1 r1) {
		this.r1 = r1;
	}

	public void run() {

		while (true) {
			r1.get();
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}

public class ProducerConsumer2 {

	void main() {
		Resource1 r1 = new Resource1();

		Producer1 p1 = new Producer1(r1);
		Consumer1 c1 = new Consumer1(r1);

		p1.start();
		c1.start();
	}

}
