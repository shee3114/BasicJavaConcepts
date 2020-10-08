package com;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();

		int fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num1 + " is: " + fact);

	}

}
