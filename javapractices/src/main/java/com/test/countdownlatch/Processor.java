package com.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Processor {

	public static void main(String[] args) {
	
		Counnter countDownLatch = new Counnter(args.length);
		Thread fpThread = new Thread(new FoodProcessor(countDownLatch,args));
		fpThread.start();
		try {
			System.out.println("Order is received and being processed!");
			countDownLatch.await();
			System.out.println("Order is processed successfully and is ready to get dispatched!");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
