package com;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		// Scanner s = new Scanner(System.in);
		// int n= s.nextInt();
		// if(n%2==0){
		// System.out.println("The number is even number");
		// }
		// else{
		// System.out.println("The numbe is odd number");
		// }
		{
			String str, reverse = "";
			int i, length;
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter any String:");
			str = scanner.nextLine();
			length = str.length();

			// Reversing a string
			for (i=length - 1; i>=0; i--){
				reverse = reverse + str.charAt(i);
			}

			System.out.println("After Reversed String: " + reverse);
		}
	}

}
