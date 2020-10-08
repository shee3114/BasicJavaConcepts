package com;

public class preIncrementAndPostIncrementConcept {

	public static void main(String[] args) {
		int a = 5;

		System.out.println(a++);
		System.out.println("The pre increment value of a: " + ++a);

		// System.out.println("The post increment value of the a: " + a++);

		// System.out.println(++a);

		int b = 6;

		System.out.println("Decrement: " + b--);

		System.out.println(--b);
	}
}
