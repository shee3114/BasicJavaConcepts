package com;

class parentClass {
	int a = 5;
	int b = 4;

	public void arithmeticMethod() {
		System.out.println("Output: " + (a - b));
	}
}

class firstChildClass extends parentClass {
	public void arithmeticMethod() {
		System.out.println("Output: " + (a + b));
	}
}

class secondChildClass extends parentClass {
	public void arithmeticMethod() {
		System.out.println("Output: " + (a * b));
	}
}

public class PolymorphismAndInheritanceConcept {

	public static void main(String[] args) {
		parentClass parent = new parentClass();
		parentClass firstChildClass = new firstChildClass();
		parentClass secondChildClass = new secondChildClass();
		parent.arithmeticMethod();
		firstChildClass.arithmeticMethod();
		secondChildClass.arithmeticMethod();
	}
}
