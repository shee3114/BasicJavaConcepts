package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		List <Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println("This is first method");
		for (int i: list){
			System.out.println(i);
		}
		
		ArrayList<String> weekdays = new ArrayList<String>();
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		System.out.println("This is second method");
		for (int j = 0; j<weekdays.size();j++){
			System.out.println(weekdays.get(j));
		}
		
		int a[] = new int [2];
		a[0]= 33;
		a[1]=44;
		System.out.println("This is third method");
		for (int k = 0; k< a.length; k++){
			System.out.println(a[k]);
		}
		int b[]= {21,22,23};
		System.out.println("This is forth method");
		for (int l = 0;l<b.length;l++){
			System.out.println(b[l]);
		}
		
		LinkedList<String> month = new LinkedList<String>();
		month.add("January");
		month.add("February");
		month.add("March");
		for(String m : month){
			System.out.println(m);
		}
		
		HashMap <String, String> People = new HashMap<String, String> ();
		
		People.put("Maddy", "Sk");
		People.put("Sheetal", "Desai");
		People.put("Snehal", "Desai");
		for (String n : People.keySet()){
			System.out.println(n + " " +People.get(n));
		}
		System.out.println("sirname: " +People.get("Madddy"));
 	}
	
	}
