package com.lcpan.m11;

public class RunnableDemo implements Runnable {
	Thread t;

	public RunnableDemo(String threadName) {
		t = new Thread(this, threadName);
		t.start();
	}

	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println(t.getName() + ": Number " + i);
	}

	public static void main(String[] args) {
		new RunnableDemo("Thread 1");
		new RunnableDemo("Thread 2");
	}
}
