package com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int flag = 0;
		if (num1 == 0|| num1 == 1) {
			System.out.println(num1 + " is not prime Number");
		} else {
			for (int i = 2; i < num1 / 2; i++) {
				if (num1 % i == 0) {
					System.out.println(num1+ " is Not Prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num1 +" is Prime number");
			}
		}

	}

}
