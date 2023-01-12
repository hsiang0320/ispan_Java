package com.lcpan.m03;

public class Ternary {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int max = (x > y) ? x : y;
		System.out.println(max);
		int score = 88;
		String status = (score >= 60) ? "pass" : "fail";
		System.out.println(status);
		
	}
}
