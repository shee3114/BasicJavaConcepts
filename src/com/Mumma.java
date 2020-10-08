package com;

import java.util.ArrayList;

public class Mumma {
	 int a = 5;
	 int b;

	 public Mumma(int y){
		 b = y;
	 }
	public static void main(String[] args) {
		//Mumma m = new Mumma();
		//m.a = 10;
		//System.out.println(m.a);
		Mumma m1 = new Mumma(3);
		System.out.println(m1.b);
		
		ArrayList<String> color = new ArrayList<>();
		color.add("Red");
		color.add("Pink");
		color.add("Orange");
		for(String i : color){
			System.out.println(i);
		}
		
		color.set(0, "black");
		for(String j : color){
			System.out.println(j);
		}
		
		for (int k = 1; k<=4; k++){
			//++k;
			System.out.println("K: " + ++k);
		}
	}
}
