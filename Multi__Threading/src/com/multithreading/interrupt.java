package com.multithreading;
//join method
class t implements Runnable{

	@Override
	public void run() {
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Focus on work");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}
public class interrupt {
	public static void main(String[] args) throws InterruptedException {
		//main thread phle chlta fir khatam hota hai fir dusra thread chlta hai
		System.out.println("main thread executed");
		t d= new t();
		Thread t1 = new Thread(d);
		t1.start();
		t1.interrupt();
//		t1.join();
		System.out.println("main thread finished");
	}
}
