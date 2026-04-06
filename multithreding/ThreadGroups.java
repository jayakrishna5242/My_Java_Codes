package com.multithreding;

public class ThreadGroups{

	
	Runnable r=()->{
		try {
			System.out.println("Executing by "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
		catch(Exception e){
			
		}
	};
	
	void main() throws Exception {
		ThreadGroup t= new ThreadGroup("Group2");
		Thread t1= new Thread(t,r);
		Thread t2= new Thread(t,r);
		Thread t3= new Thread(t,r);
		Thread t4= new Thread(t,r);
		Thread t5= new Thread(t,r);
		Thread t6= new Thread(t,r);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();

		System.out.println(t.activeCount());
		
//		t.wait(1000);
		System.out.println(t1.getThreadGroup().getName());;
		
		
		
	}
	
	
	
	
	
}
