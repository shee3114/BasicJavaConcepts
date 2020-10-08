package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class practiseTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputData = s.nextLine();

		String [] inputSplitedData = inputData.split(" ");
		String inputString = inputSplitedData[0];
		int count = Integer.parseInt(inputSplitedData[1]);
		
		char [] charArray = inputString.toCharArray();
		HashMap <Character, Integer> charCounterMap = new HashMap<>();
		for (char c: charArray) {
			if(charCounterMap.containsKey(c)){
				charCounterMap.put(c, charCounterMap.get(c)+1);
			}else{
				charCounterMap.put(c, 1);
			}
		}
		
		for (int i = 0; i< charArray.length; i++){
			char c = charArray[i];
			if(charCounterMap.get(c)== count){
			charArray[i]=Character.toUpperCase(c);
			}
		}
		
		String outputString = new String(charArray);
		System.out.println(charArray);
		
	}

}
