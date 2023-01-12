package com.lcpan.m07;

public class StaticBlock {
	int num;
	static int count;
	static {
		count = 10;
	}

	public static void main(String[] args) {
	//	num++;
	//	System.out.println(num);
		count++;
		System.out.println(count);
	}
}
