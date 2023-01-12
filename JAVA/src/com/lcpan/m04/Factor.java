package com.lcpan.m04;

public class Factor {
	static int factorial(int x) {
		int result = 1;
		for (int i = x; i > 0; i--) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println(factorial(6));
		System.out.println(factorial(10));
	}
}
