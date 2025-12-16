package com.multithreading;
//change name thread using constructor
public class ThreadDemo3 extends Thread {
	public ThreadDemo3(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("run() method is executed");
		System.out.println(Thread.currentThread());
	}
	public static void main(String[] args) {
		ThreadDemo3 d = new ThreadDemo3("MyThread");
		d.start();
	}
}