package com.multithreading;
//program swing the concept of thread
//no need of thread object in thread class
//setName setPriority
public class ThreadDemo2 extends Thread {
	@Override
	public void run() {
		
		System.out.println("run method executed");
		System.out.println("Current Thread "+Thread.currentThread());
	}
	public static void main(String[] args) {
		ThreadDemo2 t2 = new ThreadDemo2();
		t2.setName("My Thread");
//		t2.setPriority(Thread.MAX_PRIORITY);
//		t2.setPriority(MIN_PRIORITY);
//		t2.setPriority(NORM_PRIORITY);
		t2.setPriority(8);
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		t2.start();
//		t2.start();  //Exception - IllegalThreadStateException
	}
}
