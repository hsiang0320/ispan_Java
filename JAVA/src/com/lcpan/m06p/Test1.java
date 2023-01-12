package com.lcpan.m06p;

public class Test1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.run();
		Dog dog = new Dog();
		dog.run();
		animal = dog;
		animal.run();
		animal = new Cat();
		animal.run();
		animal = new Lion();
		animal.run();
		Feline feline = new Lion();
		feline.run();
	}

}
