package com;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> month = new ArrayList<String> ();
		
		//Add data in arraylist
		month.add("January");
		month.add("February");
		month.add("March");
		month.add("April");
		System.out.println("Added data is: ");
		for (String i: month){
			System.out.println(i);
		}
		
		//Get the access of any data from array
		System.out.println("Data at index 1 is: " + month.get(1));
		
		//update the array
		month.set(2, "November");
		System.out.println("Updated array list: ");
		for(String j: month){
			System.out.println(j);
		}
		//REmove the element from array
		month.remove(2);
		System.out.println("After removintg the data at index 2: ");
		for (String k: month){
			System.out.println(k);
		}
		
		//get the size of the array
		System.out.println("size of the array:" + month.size());
		
		
	}

}
