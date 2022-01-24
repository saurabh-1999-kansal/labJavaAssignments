package com.threads.question2;

import java.util.Random;

/*
Write a program that runs 5 threads, each thread randomizes a number 
between 1 and 10. The main thread waits for all the others to finish, calculates 
the sum of the numbers which were randomized and prints that sum. You will 
need to implement a Runnable class that randomizes a number and store it in a 
member field. When all the threads have done, your main program can go over 
all the objects and check the stored values in each object.
*/
class Job implements Runnable{
	static int sum=0;
	
	public Job() {};
	
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		add();
	}
	private void add() {
		Random r = new Random();
		int s = r.nextInt(10)+1;
		System.out.println(Thread.currentThread().getName()+" : " + s);
		sum+=s;
	}
}


public class Question2 {
	public static void main(String[] args) {
		Job job = new Job();
		
		Thread t1 = new Thread(job, "Thread1");
		Thread t2 = new Thread(job, "Thread2");
		Thread t3 = new Thread(job, "Thread3");
		Thread t4 = new Thread(job, "Thread4");
		Thread t5 = new Thread(job, "Thread5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sum: "+Job.sum);
		System.out.println("Main Thread Fininshed");
	}
}
