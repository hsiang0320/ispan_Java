package com.lcpan.m08;

public class Exception1 {
	public static void method() throws Exception {
		try {
			System.out.println("in method()");
			throw new Exception();
		} catch (RuntimeException e) {
			System.out.println("Exception handling in method()");
		}
	}
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("Exception handling in main()");
		}
	}
}
