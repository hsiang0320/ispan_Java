package com.lcpan.m03;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Enter an integer (1~4):");
		int num = 3;
		switch (num) {
		case 1:
			System.out.println("input 1");
			break;
		case 2:
			System.out.println("input 2");
			break;
		case 3:
			System.out.println("input 3");
			break;
		case 4:
			System.out.println("input 4");
			break;
		default:
			System.out.println("input error");
		} // end of switch
		System.out.println("Thank you!");
	}
}
