package com.multithreading;


public class practice2 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getClass());
		
	}
	public static void main(String[] args) {
		practice2 p = new practice2();
		Thread t = new Thread(p);
		t.setName("My Thread");
		t.setPriority(4);
	}
}
