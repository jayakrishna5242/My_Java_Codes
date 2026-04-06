package com.Java_Practice;

public class DFD   {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(545675);
		Thread t1=new Thread();
//		t1.sleep(1000);
		ThreadGroup t2=new ThreadGroup("Jaya");
		System.out.println(t2.getName());
		System.out.println(t2.activeCount());
		System.out.println(545675);
		t1.sleep(1000);
		System.out.println(t1.getState());
		

		
	}

}
