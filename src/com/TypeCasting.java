package com;

public class TypeCasting {

	public static void main(String[] args) {

		int myInt = 8;
		double myDouble = myInt;
		System.out.println("myInt: " + myInt);
		System.out.println("myDouble: " + myDouble);

		double myDouble1 = 9.45;
		int myInt1 = (int) myDouble1;
		System.out.println("myInt1: " + myInt1);
		System.out.println("myDouble1: " + myDouble1);
		
		String name = "SheEtaL";
		System.out.println("Length: " +name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		String address = " It\'s allright. my name is \"sheetal\" we can use this\\that";
		System.out.println(address);
		
		for(int i = 1; i<=10;i++){
			if(i==3 || i==4){
				continue;
			}
			if(i ==7){
				break;
			}
			System.out.println(i);
			

			
		}
		
	}

}
