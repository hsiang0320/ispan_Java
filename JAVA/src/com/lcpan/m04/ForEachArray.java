package com.lcpan.m04;

public class ForEachArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] oneDim = { 2, 6, 1, 4, 3, 5 };
		for (int n : oneDim)
			sum += n;
		System.out.println("sum = " + sum);
		
		sum = 0;
		int[][] twoDim = { { 2, 6, 1 }, { 4, 3, 5 } };
		for (int[] m : twoDim)
			for (int n : m)
				sum += n;
		System.out.println("sum = " + sum);
	}
}
