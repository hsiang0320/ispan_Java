package com.lcpan.m04;

public class OneDimArray {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = { 2, 6, 1, 4, 3, 5 };
		// �[�`arr�U��������
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println("sum = " + sum);
	}
}
