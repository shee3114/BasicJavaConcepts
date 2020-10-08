package com;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		System.out.print("Enter the number: ");
		Scanner s = new Scanner(System.in);
		int inputValue, num;
		inputValue = s.nextInt();
		num = inputValue;
		int total = 0;
		while (num != 0) {
			int digit = num % 10;
			total = total + (digit * digit * digit);
			num = num / 10;
		}
		if (total == inputValue) {
			System.out.println(total + " is Armstrong number");
		} else {
			System.out.println("is not armstrong number");
		}
	}

}
