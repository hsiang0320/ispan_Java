package com.lcpan.m11;

public class JoinDemo {
	public static void main(String[] args) {
		RunnableDemo nt1 = new RunnableDemo("Thread 1");
		RunnableDemo nt2 = new RunnableDemo("Thread 2");
		System.out.println(nt1.t.getName() + ":" + nt1.t.isAlive());
		System.out.println(nt2.t.getName() + ":" + nt2.t.isAlive());
		try {
			nt1.t.join();
			nt2.t.join();
		} catch (InterruptedException e) {
		}
		System.out.println(nt1.t.getName() + ":" + nt1.t.isAlive());
		System.out.println(nt2.t.getName() + ":" + nt2.t.isAlive());
	}
}
