package com.lcpan.m06p;

public class Test3 {

	public static void main(String[] args) {
		Animal animal = new Dog();
	//	animal.bark();
		Dog dog = (Dog)animal;
		dog.bark();
		if (animal instanceof Dog) {
			System.out.println("Animal is a dog");
		}
	}

}
