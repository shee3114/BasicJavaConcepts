package com;

abstract class shape {

	abstract void abstractMethodOne();

	abstract void abstractMethodTwo();

	public void nonAbstractMethodOne() {
		System.out.println("This is first non abstract Method");
	}

	public void nonAbstractMethodTwo() {
		System.out.println("This is second non abstract Method");
	}
}

class circle extends shape {

	void abstractMethodOne() {
		System.out.println("This is first abstract Method.");
	}

	void abstractMethodTwo() {
		System.out.println("This is second abstract Method.");
	}

	public void circleMethod() {
		System.out.println("This is circle Method");
	}
}

public class AbstractConcept {

	public static void main(String[] args) {

		// if the reference is of the parent class and object is of the child
		// class
		// then we can access all the abstract methods from parent class which
		// are implemented in child class and non abstract method from parent
		// class
		shape myCircle = new circle();
		myCircle.abstractMethodOne();
		myCircle.abstractMethodTwo();
		myCircle.nonAbstractMethodOne();
		myCircle.nonAbstractMethodTwo();

		circle obj = new circle();
		obj.circleMethod();

	}

}
