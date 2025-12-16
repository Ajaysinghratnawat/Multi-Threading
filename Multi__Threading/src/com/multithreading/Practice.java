package com.multithreading;

public class Practice extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		Practice p = new Practice();
		//Direct call by classname
//		p.run();
		//call by start
		p.setName("My Thread");
		p.setPriority(MAX_PRIORITY);
		
		System.out.println(p.getName());
		System.out.println(p.getId());
		System.out.println(p.getPriority());
		
		p.start();
//		p.start(); IllegalThreadStateException
	}
}
