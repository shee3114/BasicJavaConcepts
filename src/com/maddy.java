package com;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class maddy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		String line = s.nextLine();

		String[] test = line.split(" ");

		int[] intArray = new int[n];
		for (int i = 0; i < n; i++) {

			intArray[i] = Integer.parseInt(test[i]);
		}

		boolean isSpiral = true;
		for (int i = 0; i <= n / 2; i++) {
			if (intArray[i] > intArray[n - i - 1]) {
				isSpiral = false;
				break;
			}
		}

		Arrays.sort(intArray);
		boolean isFib = true;

		for (int i = 0; i < n - 2; i++) {
			if (intArray[i + 2] != intArray[i] + intArray[i + 1]) {
				isFib = false;
				break;
			}
		}

		if (isSpiral && isFib) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
