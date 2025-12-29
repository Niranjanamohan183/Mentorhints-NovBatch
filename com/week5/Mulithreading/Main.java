package com.week5.Mulithreading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1 = new Mythread("thread 1");
		Mythread t2 = new Mythread("thread 2");
		Mythread t3 = new Mythread("thread 3");
		
		//Start the thread
		t1.start();
		t2.start();
		t3.start();
		
		//wait all thread to finish
	
			t1.yield();
			t2.yield();
			t3.yield();
		
		System.out.println("All thread are finished");
	}

}
