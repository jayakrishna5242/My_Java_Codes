package com.multithreding;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorFrameWork {

	
	void main() {
		
		ExecutorService ex=Executors.newFixedThreadPool(5);
		ExecutorService ex1=Executors.newFixedThreadPool(5);

		Runnable r=()->{
			System.out.println("Current Instructions"+"is executing by "+Thread.currentThread().getName());
		};
		
		
		// For Every Iteration new Thread is created 
		for(int i=0;i<10;i++) {
			
			Thread t=new Thread(r);
			t.start();
			
		}
		
		
		
		// Here We Are using only 5 threads  Which are stored in Thread Pool
		for(int i=0;i<10;i++) {
			
			ex.execute(r);
			
		}
		
		// Here We Are using only 5 threads  Which are stored in Thread Pool
		for(int i=0;i<10;i++) {
			
			ex1.execute(r);
			
		}
		
		
		ex.shutdown();
		ex1.shutdown();
		
		
	}
}
