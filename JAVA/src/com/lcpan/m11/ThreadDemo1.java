package com.lcpan.m11;

public class ThreadDemo1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println(getName() + ": Number " + i);
	}

	public static void main(String[] args) {
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.setName("Thread 1");
		t1.start();
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.setName("Thread 2");
		t2.start();
	}
}
