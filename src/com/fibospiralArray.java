package com;

import java.util.Arrays;
import java.util.Scanner;

public class fibospiralArray {
	public static void main(String[] args) {

		boolean isFibo = true;
		boolean isSpiral = true;

		Scanner s = new Scanner(System.in);
		String count = s.nextLine(); // store the count of series as 5
		// store the series as 1 2 5 3 1
		String[] inputString = s.nextLine().split(" ");
		int n = Integer.parseInt(count);

		// ******
		/*
		 * int n = s.nextInt(); String input = s.nextLine(); String[]
		 * inputString = input.split(" ");
		 */
		//// *******

		// initialize integer array and out input values in it
		int[] intArray = new int[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = Integer.parseInt(inputString[i]);
		}
		System.out.println(intArray);

		// to check spiral behaviour
		for (int j = 0; j < n / 2; j++) {
			if (intArray[j] > intArray[n - j - 1]) {
				isSpiral = false;
				break;
			}
		}

		// sort interger array to check fibbonacci
		Arrays.sort(intArray);

		for (int k = 0; k < n - 2; k++) {
			if (intArray[k + 2] != intArray[k] + intArray[k + 1]) {
				isFibo = false;
				break;
			}
		}

		if (isSpiral && isFibo) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
