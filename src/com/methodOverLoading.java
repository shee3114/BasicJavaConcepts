package com;

public class methodOverLoading {

	// Method overloading same method with diff argument
	public  int plusMethod(int x, int y) {
		return x + y;

	}

	public static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {

		methodOverLoading obj = new methodOverLoading();
		int totalInt = obj.plusMethod(1, 2);
		System.out.println(totalInt);
		double totalDouble = plusMethod(1.2, 2.2);
		System.out.println(totalDouble);
	}
}

// in while loop, condition is checked first and then execute