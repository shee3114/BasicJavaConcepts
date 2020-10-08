package com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
	int reverseNum = 0;
	while(num!=0){
		int digit = num%10;
		reverseNum = reverseNum *10+ digit;
		 
		System.out.println(reverseNum);
		num = num/10;
		
	}
		
	System.out.println("Reverse Num: " +reverseNum);	
	}		
}




