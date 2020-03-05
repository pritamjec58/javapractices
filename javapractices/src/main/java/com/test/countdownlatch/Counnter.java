package com.test.countdownlatch;

public class Counnter {
	
	int count;
	
	public Counnter(int count) {
		this.count = count;
	}
	
	public void await()  throws InterruptedException{
		while(count > 0) {
			System.out.println("hello");
		}
	}
	
	public void countDown() {
		count = count - 1;
	}
	

	public int getCount() {
		return count;
	}
}
