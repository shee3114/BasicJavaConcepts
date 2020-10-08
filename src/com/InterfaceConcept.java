package com;

interface Animal {

	public void animalSound();

	public void animalSleep();
}

class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("bow.. bow...");
	}

	@Override
	public void animalSleep() {
		System.out.println("Dog is sleeping");
	}

	public void dogMethod() {
		System.out.println("This is metod for dog class");
	}
}

public class InterfaceConcept {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.dogMethod();

		Animal animal = new Dog();
		animal.animalSleep();
		animal.animalSound();

	}

}
