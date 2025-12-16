package com.multithreading;
class demo2 implements Runnable{
	//3. Running State (Thread scheduler)
	@Override
	public void run() {
		try {
			String s1 = Thread.currentThread().getName();
			System.out.println(s1);
			for(int i=0;i<5;i++) {
				//4.Blocked State [Waiting area]
				Thread.sleep(3000);
				System.out.println("Focus on development");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		//5.Terminated State(Thread is finish or destroy)
	}
}
public class Life_cycle{
	public static void main(String[] args) {
		demo2 d = new demo2();
		//1. New [Born State]
		Thread t = new Thread(d);
		System.out.println(t.isAlive());
		//2. Runnable State
		t.start();
		//thread alive state mai tab hota hai jab start kar rhe hai
		System.out.println(t.isAlive());
	}
}

//syncronization -> Restricted area
//ek time pe ek hi thread chl sakta hai jab tak iska kaam khatam nhi hoga tab tak dusra thread kaam shuru nhi kar sakta use restricted area bolte hai