package com.accenture.lkm.thread;
public class TestThread2 implements Runnable {
	Thread t;
	public TestThread2(String name ) {
		//A new thread creation
		//Thread (Runnable runnable, String threadName)
		t=new Thread(this, name);
		t.start();
	}
	@Override
	public void run() {
		//
		System.out.println("Current Thread in execution in run method():: " 
				+ Thread.currentThread().getName()); 
		for(int i=1;i<=10;i++) {
			System.out.println("Value of i :: " + i + " , " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println("Thread Interrupted");
			}
		}

	}

}
