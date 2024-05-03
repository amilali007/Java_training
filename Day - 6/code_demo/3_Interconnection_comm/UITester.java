package com.accenture.lkm.threads;

public class UITester {

	public static void main(String[] args) {
		DataProvider provider=new DataProvider();
		
		//Creating the instance of Producer Thread and allocating the resource i.e. DataProvider
		ProducerThread producer=new ProducerThread(provider);
		
		//Creating the instance of Consumer Thread and allocating the resource i.e. DataProvider
		ConsumerThread consumer=new ConsumerThread(provider);
		
		//Start the producer and consumer thread
		producer.start();
		consumer.start();
		

	}

}
