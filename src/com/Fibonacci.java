package com;

public class Fibonacci {

	static String lastName = "Desai"; ////just for the variable concept program
	int dob = 4;   /// just for the variable concept program
	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, n3, count, i;
		System.out.print(n1 + " " + n2);
		for (i=2;i<=10;++i){
			n3 = n1 + n2;
			System.out.print(" " +n3);
			n1 = n2;
			n2 = n3;	
		}
	}
}
