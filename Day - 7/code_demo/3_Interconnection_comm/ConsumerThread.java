package com.accenture.lkm.threads;

public class ConsumerThread extends Thread {
	DataProvider provider;
	public ConsumerThread(DataProvider provider)
	{
		this.provider=provider;
	}
	@Override
	public void run()
	{
		
		while(true)
		{
			System.out.println("getData() method called by Consumer Thread");
			provider.getData();
		}
	}
}
