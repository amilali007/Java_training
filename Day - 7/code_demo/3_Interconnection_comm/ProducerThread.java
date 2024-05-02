package com.accenture.lkm.threads;

public class ProducerThread extends Thread {
	DataProvider provider;
	public ProducerThread(DataProvider provider)
	{
		this.provider=provider;
	}
	@Override
	public void run()
	{
		int data=700;
		while(true)
		{
			System.out.println("generateData() method called by Producer Thread");
			provider.generateData(++data);
		}
	}

}
