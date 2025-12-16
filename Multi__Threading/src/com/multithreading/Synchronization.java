package com.multithreading;
class ajay implements Runnable{
	//synchronized so run one by one after current thread work done then next thread start working
//	@Override
//	public synchronized void run() {
//		try {
//			Thread.sleep(2000);
//			System.out.println(Thread.currentThread().getName());
//			System.out.println("Run method called");
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
//	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName());
			synchronized (this) {
				Thread.sleep(2000);
				System.out.println("Run method called");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
	//In this all execute at same time 
//	@Override
//	public void run() {
//		try {
//			Thread.sleep(2000);
//			System.out.println(Thread.currentThread().getName());
//			System.out.println("Run method called");
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
//	}
}
public class Synchronization {
	public static void main(String[] args) throws Exception {
		ajay d = new ajay();
		Thread t1 = new Thread(d);
		t1.setName("t1");
		Thread t2 = new Thread(d);
		t2.setName("t2");
		Thread t3 = new Thread(d);
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
