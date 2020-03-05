package com.test.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable{

	private final Counnter latch;
	private final String [] items;
	
	public FoodProcessor(Counnter latch , String [] items) {
		this.latch = latch;
		this.items = items;
	}
	@Override
	public void run() {
for (int i = 0; i < items.length; i++) {
	try {
		System.out.println("Before processing items the value of count down latch is :"+latch.getCount());
		Thread.sleep(1000);
		
		System.out.println("item "+items[i]+" is prepared");
		latch.countDown();
		System.out.println("After processing items the value of count down latch is :"+latch.getCount());
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
		
	}

}
