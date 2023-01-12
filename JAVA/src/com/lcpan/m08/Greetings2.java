package com.lcpan.m08;

public class Greetings2 {
	public static void main(String[] args) {
		String[] greetings = { "Hello", "Hi! ", "Good" };
		try {
			for (int i = 0; i <= greetings.length; i++)
				System.out.println(greetings[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of range");
		} catch (Exception e) {
			System.out.println("Exception happened!");
		} finally {
			System.out.println("Always printed");
		}
		System.out.println("Program end!");
	}
}
