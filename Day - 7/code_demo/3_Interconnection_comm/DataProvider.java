package com.accenture.lkm.threads;

//Resource shared between Producer and Consumer Threads
public class DataProvider {
	int number;
	boolean flag;
	//Synchronized methods to produce data
	public synchronized void generateData(int number)
	{
		if(flag)
		{
			try
			{
				//Making other threads to wait till data is generated
				wait();
			}
			catch(InterruptedException ex)
			{
				System.out.println("Exception caught");
			}
		}
		this.number=number;
		flag=true;
		System.out.println("Data Produced ::: " + this.number);
		//Notify the other threads that data is generated and ready to consume.
		notify();
	}
	public synchronized void getData()
	{
		if(!flag)
		{
			try
			{
				//Making the Producer thread to wait until generated data is consumed by the Consumer thread
				wait();
			}
			catch(InterruptedException ex)
			{
				System.out.println("Exception caught");
			}
		}
		System.out.println("Data consumed ::: " + number);
		flag=false;
		//Notify the producer thread to generate a new data
		notify();
		
	}
	//Depending on the value of flag variable, the threads will wait.

}
