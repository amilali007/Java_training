package com.accenture.lkm.thread;

public class UITester {

	public static void main(String[] args) {
		System.out.println("Current Thread in execution :: " 
	+ Thread.currentThread().getName()); 
		
		TestThread1 thread1=new TestThread1("Test Thread 1"); 
		
		System.out.println("Current Thread in execution before starting Thread 1:: " 
				+ Thread.currentThread().getName()); 
		
		//Start the thread
		thread1.start();
		System.out.println("Current Thread in execution after starting Thread 1:: " 
				+ Thread.currentThread().getName()); 
		
		
		//Create an instance of TestThread2
		Runnable testThread2=new TestThread2("Test Thread 2");	
		System.out.println("Current Thread in execution after creating another Thread:: " 
				+ Thread.currentThread().getName()); 
	}

}
