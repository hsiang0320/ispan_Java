package com.lcpan.m04;

public class Overloading {
	public static void greeting() {
		System.out.println("Hello!");
	}

	public static void greeting(String name) {
		System.out.println("Hello! " + name);
	}

	public static void greeting(String name, int num) {
		for (int i = 1; i <= num; i++)
			System.out.println("Hello! " + name);
	}

	public static void main(String[] args) {
		greeting();
		greeting("John");
		greeting("Mary", 3);
	}

}
