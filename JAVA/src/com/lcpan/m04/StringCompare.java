package com.lcpan.m04;

public class StringCompare {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String s4 = "hello";
		System.out.println(s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));
		System.out.println(s2.compareTo(s3));
	}
}
