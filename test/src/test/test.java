package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyJob3 implements Runnable {

	private Thread thread;

	public MyJob3(String name) {

		thread = new Thread(this, name);
	}

	public void startThread() {
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("My fourth thread");

	}

}

class MyJob2 extends Thread {
	@Override
	public void run() {
		System.out.println("my second thread");
	}
}

class MyJob1 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Q {
	int n;
	boolean valueSet = false;

	// consumer
	synchronized int get() {
		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("get: " + n);
		valueSet = false;
		notify();
		return n;
	}

	// producer
	synchronized void put(int n) {
		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("put: " + n);
		valueSet = true;
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	public Producer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		new Thread(this).start();
	}

	@Override
	public void run() {

		while (true) {
			q.get();
		}
	}
}

class Cal implements Runnable {
	private int x, y, sum;
	private boolean isDone = false;

	public Cal(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		sum = x + y;
		isDone = true;
		synchronized (this) {
			notifyAll();
		}
	}

	public synchronized int getSum() {
		if (!isDone) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return sum;
	}
}

class MyJob implements Runnable {

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("foo.txt"));
			//
			System.out.println("file is found");
		} catch (FileNotFoundException ex) {
			System.out.println("file is not found");
			throw new RuntimeException(ex);
		}
	}

}

class MyThreadExcptionHandler2 implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("exception is handled by 2" + e);
	}

}

class MyThreadExcptionHandler implements UncaughtExceptionHandler {

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("exception is handled " + e);
	}

}

class CpuBoundProcessJob implements Runnable {

	@Override
	public void run() {
		System.out.println("cpu bound process...." + Thread.currentThread().getName());
	}

}

class Factorial implements Callable<Long> {
	private long n;

	public Factorial(long n) {
		this.n = n;
	}

	@Override
	public Long call() throws Exception {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		if (n < 0)
			throw new Exception("n should be positive integer");
		long fact = 1;
		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}



public class test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

	}
}
