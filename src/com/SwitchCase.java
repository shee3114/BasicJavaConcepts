package com;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int day = s.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesay");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("sorry! please provide valid input");
			break;
		}
		
		
	}

}
