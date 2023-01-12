package com.lcpan.mx;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your name:");
		String name = scanner.next();
		System.out.println("Please input your age:");
		int age = scanner.nextInt();
		scanner.close();
		System.out.println("Your name is " + name);
		System.out.println(name + ", your age is " + age);
	}
}
