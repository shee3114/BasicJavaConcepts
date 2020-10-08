package com;

import java.util.ArrayList;
import java.util.Iterator;

public class JustAnPractice {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Sheetal Desai");
		list.add("8");
		list.add("7.5L");
		list.add("August");
		list.add("August");
		System.out.println("Data is " + list);
		
		ArrayList<String> month = new ArrayList<String>();
		month.add("January");
		month.add("February");
		month.add("March");
		System.out.println("Month array: " + month);
		
		month.add(3, "May");
		System.out.println("After adding new index: " + month);
		
		month.set(3,"April");
		System.out.println("After editing index: " +month);
		System.out.println("Iterator concept");
		Iterator<String> itr = month.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		

	}

}
