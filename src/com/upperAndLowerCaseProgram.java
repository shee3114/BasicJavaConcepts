package com;

import java.util.HashMap;
import java.util.Scanner;

public class upperAndLowerCaseProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String line = s.nextLine();

		String[] inputValues = line.split(" ");

		String inputString = inputValues[0];
		
		int count = Integer.parseInt(inputValues[1]);

		HashMap<Character, Integer> charCountMap = new HashMap<>();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		for (int i = 0; i < strArray.length; i++) {

			char c = strArray[i];
			if (charCountMap.get(c) == count) {
				strArray[i] = Character.toUpperCase(c);
			}
		}
		String outputString = new String(strArray);
		System.out.println(outputString);

	}
}
