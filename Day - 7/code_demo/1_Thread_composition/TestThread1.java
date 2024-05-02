package com.accenture.lkm.thread;

public class TestThread1 extends Thread {
	public TestThread1(String threadName) {
		//Call to Thread class constructor to give a name to current thread
		super(threadName);
	}
	@Override
	public void run() {
		//
		System.out.println("Current Thread in execution in run () method:: " 
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
