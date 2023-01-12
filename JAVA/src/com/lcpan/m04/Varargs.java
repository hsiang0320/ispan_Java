package com.lcpan.m04;

public class Varargs {
	public static int sum(int... nums) {
		int total = 0;
		for (int n : nums) {
			total += n;
		}
		return total;
	}

	public static void main(String... args) {
		System.out.println(sum(1, 3, 5));
		System.out.println(sum(1, 2, 3, 4, 5));
	}
}
