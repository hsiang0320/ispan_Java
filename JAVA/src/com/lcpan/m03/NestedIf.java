package com.lcpan.m03;

public class NestedIf {
	public static void main(String[] args) {
		int num = 70;
		if (num >= 60) {
			System.out.println("passed!!");
			if (num < 80)
				System.out.println("so so!!");
			else
				System.out.println("good!!");
		} else
			System.out.println("failed!!");
	}
}
