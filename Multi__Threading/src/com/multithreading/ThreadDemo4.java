package com.multithreading;
//MAX, MIN, NORM Priority 
public class ThreadDemo4 extends Thread {
	@Override
	public void run() {
		System.out.println("Current Thread :"+Thread.currentThread());
	}
	public static void main(String[] args) {
		ThreadDemo4 obj1 = new ThreadDemo4();
		ThreadDemo4 obj2 = new ThreadDemo4();
		ThreadDemo4 obj3 = new ThreadDemo4();
		
		obj1.setName("My Thread 1");
		obj2.setName("My Thread 2");
		obj3.setName("My Thread 3");
		
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MAX_PRIORITY);
		
		obj1.start();
		obj2.start();
		obj3.start();
		
		
	}
}
