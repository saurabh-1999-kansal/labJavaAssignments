package com.thread.question1;

/*
 * Create a multithreaded program by using Runnable interface and then create, 
initialize and start three Thread objects from your class. The threads will 
execute concurrently and display from 0 to 100 in the format [thread name : 
number].
*/

class Job implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<=100) {
			System.out.println(Thread.currentThread().getName()+" : " + i++);
		}
			
	}
}

public class Question1 {
	public static void main(String[] args) {
		Job job = new Job();
		
		Thread t1 = new Thread(job, "Thread1");
		Thread t2 = new Thread(job, "Thread2");
		Thread t3 = new Thread(job, "Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("Main Thread Fininshed");
	}
}
