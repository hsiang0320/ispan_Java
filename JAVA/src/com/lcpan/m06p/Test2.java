package com.lcpan.m06p;

public class Test2 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();		
		animals[1] = new Cat();
		animals[2] = new Lion();
		for (Animal animal : animals)
			animal.run();
		
	}

}
