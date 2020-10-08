package com;

import java.util.Scanner;

public class EnumConcept {

	enum Level{
		HIGH,
		MEDIUM,
		LOW
	}
	
	public static void main(String[] args) {
		
		//Level myVar = Level.MEDIUM
		//System.out.println(myVar);
		Scanner myObj = new Scanner(System.in);
		String level = myObj.next(); 
		
		//switch(level){
		//case HIGH:
			System.out.println("High Level");
			//break;
		//case MEDIUM:
			System.out.println("Medium Level");
			//break;
		//case LOW:
			System.out.println("Low Level");
		//	break;
		}
	}


