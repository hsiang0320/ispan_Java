package com.lcpan.m11;

public class ThreadDemo2 extends Thread {
	public ThreadDemo2(String threadName) {
		super(threadName);
	}

	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println(getName() + ": Number " + i);
	}

	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2("Thread 1");
		t1.start();
		ThreadDemo2 t2 = new ThreadDemo2("Thread 2");
		t2.start();
	}
}
