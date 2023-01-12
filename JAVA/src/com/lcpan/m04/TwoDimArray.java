package com.lcpan.m04;

public class TwoDimArray {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = { { 2, 6, 1 }, { 4, 3, 5 } };
		// 加總arr各元素的值
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++)
				sum += arr[i][j];
		System.out.println("sum = " + sum);
	}
}
